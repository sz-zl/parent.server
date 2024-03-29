package com.p2p.yk.controller;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.p2p.yk.service.DjxClientService;
import com.p2p.yk.service.UserTransInsertService;
import com.p2p.yk.service.UserTransService;
import com.sz.p2p.entity.Split;
import com.sz.p2p.entity.UserTrans;
import com.sz.p2p.entity.UserTransInsert;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

/**
 * <p>
 * 用户交易表 前端控制器
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Api(tags={"用户交易记录接口"})
@Controller
@RequestMapping("/userTrans")
@ConfigurationProperties(prefix = "spring-cloud-eureka-server")
public class UserTransController {
	
	private int cp=1;
	private int ps=4;
	@Autowired
	private DjxClientService DjxClientService;
	@Autowired
	private UserTransService userTransService;
	@Autowired
	private UserTransInsertService userTransInsertService;
	
	@ResponseBody
	@GetMapping("show")
	public String ShowDetails() {
		System.out.println("调用了show方法");
		return DjxClientService.getPhone();
	}
	
	
	
	/**
	 * 根据编号查看交易记录
	 * @param id
	 * @return
	 */
	@GetMapping("getTrans1")
	@ApiImplicitParam(name = "id",value = "数据编号",paramType = "query",dataType = "long")
	@ApiOperation(value="根据编号查看交易对象")
	@ApiModelProperty(value="对象编号",required = true)
	@ResponseBody
	public UserTrans getTransOne1(Long id) {
		UserTrans userTrans = userTransService.selectOneTrans(id);
		return userTrans;
	}
	/**
	 * 根据编号查看交易记录
	 * @param id
	 * @return
	 */
	@GetMapping("getTrans")
	@ApiIgnore()
	public String getTransOne(Long id,Model model) {
		UserTrans userTrans = userTransService.selectOneTrans(id);
		model.addAttribute("userTransTDO", userTrans);
		return "";
	}
	
	
	/** 
	 * 添加交易记录
	 */
	@GetMapping("saveTrans1")
	@ApiOperation(value="添加用户交易记录",notes = "所提供的数据必须合法")
	@ApiModelProperty(value = "添加的对象")
	@ResponseBody
	public Boolean saveTrans1( UserTransInsert userTransInsert) {
		//随便赋值,触发器会修改
		userTransInsert.setTransId(12321L);
		userTransInsert.setTransDate(new Date());
		return userTransInsertService.insert(userTransInsert);
	}
	/** 
	 * 添加交易记录
	 */
	@ApiIgnore()
	@GetMapping("saveTrans")
	public String saveTrans(UserTransInsert userTransInsert,Model model) {
		boolean flag = userTransInsertService.insert(userTransInsert);
		if(flag) {
			return "";
		}
		return "error";
	}
	
	
	/**
	 * 查看所有交易记录+分页
	 */
	@GetMapping("listUserTrans1")
	@ApiOperation(value="获取所有用户交易记录",notes = "所提供的数据必须合法")
	@ApiImplicitParams(value = {
	@ApiImplicitParam(name = "cp",value = "当前页",paramType = "query",dataType = "int"),
	@ApiImplicitParam(name = "ps",value = "每页显示行数",paramType = "query",dataType = "int")})
	@ApiModelProperty(value = "添加的对象")
	@ResponseBody
	public Split<UserTrans> listUserTrans1(Integer cp,Integer ps){
		if(cp!=null&&cp>0) {
			this.cp=cp;
		}
		if(ps!=null&&ps>0) {
			this.ps=ps;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cp", (this.cp-1)*this.ps);
		map.put("ps", this.cp*this.ps);
		List<UserTrans> transList = userTransService.selectPageList(map);
		int count = userTransService.selectCount(new EntityWrapper<UserTrans>());
		int pages = (int)Math.ceil(1.0*count/this.ps);
		Split<UserTrans> split = new Split<>(count, this.cp, this.ps, pages, transList);
		/**
		 * 测试输入到页面的数据
		 */
		System.out.println("用户的cp为"+cp);
		List<UserTrans> elementList = split.getElementList();
		for (UserTrans userTrans : elementList) {
			System.out.println("name="+userTrans.getUser().getRealName());
		}
		return split;
	}
	/**
	 * 查看所有交易记录+分页
	 */
	@PostMapping("listUserTrans")
	@ApiIgnore()
	public String listUserTrans(Integer cp,Integer ps,Model model){
		if(cp!=null&&cp>0) {
			this.cp=cp;
		}
		if(ps!=null&&ps>0) {
			this.ps=ps;
		}
		System.out.println(cp+""+ps);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cp", (this.cp-1)*this.ps);
		map.put("ps", this.ps);
		List<UserTrans> transList = userTransService.selectPageList(map);
		model.addAttribute("transListDTO", transList);
		return "";
	}
}

