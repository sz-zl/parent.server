package com.p2p.yk.controller;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.p2p.yk.service.UserTransService;
import com.sz.p2p.entity.UserTrans;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
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
public class UserTransController {

	@Autowired
	private UserTransService userTransService;
	
	@GetMapping("show")
	@ApiOperation(value="查询数据",notes = "注意问题")
	@ResponseBody
	public List<UserTrans> sh() {
		List<UserTrans> list = userTransService.selectList(new EntityWrapper<>());
		return list;
	}
	
	@GetMapping("find")
	@ApiImplicitParam(name = "id",value = "数据编号",paramType = "query",dataType = "long")
	@ApiOperation(value="根据编号查看对象")
	@ApiModelProperty(value="对象编号",required = true)
	@ResponseBody
	public UserTrans findOne(Long id) {
		UserTrans user = userTransService.selectById(id);
		return user;
	}
	
	
	/** 
	 * 添加交易记录
	 */
	@PostMapping("saveTrans1")
	@ApiOperation(value="添加用户交易记录",notes = "所提供的数据必须合法")
	@ApiModelProperty(value = "添加的对象")
	@ResponseBody
	public void saveTrans1(UserTrans userTrans,Model model) {
		userTrans.setTransId(12321L);
		userTrans.setTransDate(new Date());
		userTransService.insert(userTrans);
	}
	/** 
	 * 添加交易记录
	 */
	@ApiIgnore()
	@GetMapping("saveTrans")
	public String saveTrans(UserTrans userTrans,Model model) {
		boolean flag = userTransService.insert(userTrans);
		if(flag) {
			return "";
		}
		return "error";
	}
	
	
	/**
	 * 查看所有交易记录+分页
	 */
	@PostMapping("listUserTrans1")
	@ApiOperation(value="获取所有用户交易记录",notes = "所提供的数据必须合法")
	@ApiModelProperty(value = "添加的对象")
	public List<UserTrans> listUserTrans1(){
		//userTransService.selectPage(page)
		return null;
	}
}

