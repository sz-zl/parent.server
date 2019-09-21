package com.p2p.yk.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.yk.service.UserService;
import com.sz.p2p.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
	private int ps=10;
	
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
	public List<User> listUsers1(Integer cp,Integer ps,String username){
		if(cp!=null&&cp>0) {
			this.cp=cp;
		}
		if(ps!=null&&ps>0) {
			this.ps=ps;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cp", (this.cp-1)*this.ps);
		map.put("ps", this.cp*this.ps);
		map.put("username", username);
		List<User> userList = userService.selectListPageUsers(map);
		return userList;
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
	
}

