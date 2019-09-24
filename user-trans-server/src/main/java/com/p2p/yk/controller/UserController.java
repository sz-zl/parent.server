package com.p2p.yk.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.p2p.yk.service.UserService;
import com.sz.p2p.entity.Split;
import com.sz.p2p.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Api(tags={"用户管理接口"})
@Controller
@RequestMapping("/user")
public class UserController {

	private int cp=1;
	private int ps=4;
	
	@Autowired
	private UserService userService;
	
	/**
	 * 查看所有用户+分页+根据名称查询
	 */
	@GetMapping("listUsers1")
	@ApiOperation(value="获取所有用户信息")
	@ApiImplicitParams(value = {
	@ApiImplicitParam(name = "cp",value = "当前页",paramType = "query",dataType = "int"),
	@ApiImplicitParam(name = "ps",value = "每页显示行数",paramType = "query",dataType = "int"),
	@ApiImplicitParam(name = "username",value = "用户名",paramType = "query",dataType = "string")})
	@ResponseBody
	public Split<User> listUsers1(Integer cp,Integer ps,String username){
		if(cp!=null&&cp>0) {
			this.cp=cp;
		}
		if(ps!=null&&ps>0) {
			this.ps=ps;
		}
		int count = userService.selectCount(new EntityWrapper<User>());
		int pages = (int)Math.ceil(1.0*count/this.ps);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cp", (this.cp-1)*this.ps);
		map.put("ps", this.cp*this.ps);
		map.put("username", username);
		System.out.println("本次查询条件为"+cp+"...."+ps+"...名字是"+username);
		List<User> userList = userService.selectListPageUsers(map);
		Split<User> split = new Split<>(count, this.cp, this.ps, pages, userList);
		/*
		 * 对遍历分页过后的数据查看
		 */
		List<User> elementList = split.getElementList();
		for (User user : elementList) {
			System.out.println("本次输入的人的真名"+user.getRealName());
		}
		
		return split;
	}
	/**
	 * 查看所有用户+分页+根据名称查询
	 */
	@GetMapping("listUsers")
	@ApiIgnore
	public String listUsers(Integer cp,Integer ps,String username,Model model){
		if(cp!=null&&cp>0) {
			this.cp=cp;
		}
		if(ps!=null&&ps>0) {
			this.ps=ps;
		}
		int count = userService.selectCount(new EntityWrapper<User>());
		int pages = (int)Math.ceil(1.0*count/this.ps);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cp", (this.cp-1)*this.ps);
		map.put("ps", this.cp*this.ps);
		map.put("username", username);
		List<User> userList = userService.selectListPageUsers(map);
		Split<User> split = new Split<>(count, this.cp, this.ps, pages, userList);
		model.addAttribute("splitDTO", split);
		return "";
	}
	
	
	
	/**
	 * 根据用户编号查看散标信息
	 * @param id
	 * @return
	 */
	@ResponseBody
	@PostMapping("getUser1")
	@ApiImplicitParam(name = "id",value = "用户编号",paramType = "query",dataType = "int")
	@ApiOperation(value="根据用户编号查看散标信息")
	public User getUser1(Integer id) {
		User user = userService.selectById(id);
		return user;
	}
	
	/**
	 * 添加普通用户
	 * @param user
	 * @return
	 */
	@ResponseBody
	@PostMapping("saveUser1")
	@ApiOperation(value="注册")
	public Boolean saveUser1(User user) {
		return userService.insert(user);
	}
	
	
	/**
	 * 验证用户是否是借款人身份登录
	 */
	
	@PostMapping("islogin")
	public String isloginLoan(Model model) {
		System.out.println("进入了判断用户身份控制器");
		redis.clients.jedis.Jedis jedis = new redis.clients.jedis.Jedis("10.1.14.191",6379);
		String str = jedis.get("myuser");
		if(str==null) {
			//跳转登录页面
			return "login2";
		}else {
			System.out.println("从redis缓存中获取到数据");
			User user = JSON.parseObject(str, User.class);
			if(user.getUserTypeId()==0) {
				//普通用户
				//跳转到借款人申请页面
				return "borrow";
			}else if(user.getUserTypeId()==1) {
				//待申请借款人
				model.addAttribute("info", "您已申请过,请耐心等待管理员审核");
				return "index";
			}else if(user.getUserTypeId()==2) {
				//借款人
				//进入借款页面
				return "borrow2";
			}else {
				//出借人
				//跳转登录页面
				return "login2";
			}
		}
	}
	
	
	/**
	 * 修改用户为借款人
	 */
	@ApiIgnore
	@RequestMapping("loanUser")
	public String loanUser(User user,HttpServletRequest request) {
		System.out.println("进入了控制器");
		redis.clients.jedis.Jedis jedis = new redis.clients.jedis.Jedis("10.1.14.191",6379);
		String str = jedis.get("myuser");
		User u = JSON.parseObject(str,User.class);
		user.setUserId(u.getUserId());
		user.setUserTypeId(1d);
		userService.updateById(user);
		return "index";
	}
	
	
//	/**
//	 * 登录
//	 */
//	@ApiIgnore
//	@RequestMapping("login")
//	public String login(User user,Model model) {
//		User u = userService.selectOne(new EntityWrapper<User>(user));
//		redis.clients.jedis.Jedis jedis = new redis.clients.jedis.Jedis("10.1.14.191",6379);
//		if(u!=null) {
//			jedis.set("myuser", JSON.toJSONString(u));
//			return "index";
//		}
//		model.addAttribute("error", "账号或密码错误!");
//		System.out.println(111111);
//		return "/jsp/login";
//	}
}

