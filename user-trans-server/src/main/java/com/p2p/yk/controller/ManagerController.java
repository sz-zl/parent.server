package com.p2p.yk.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.p2p.yk.service.ManagerService;
import com.sz.p2p.entity.Manager;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 * 管理员表 前端控制器
 * </p>
 *
 * @author yk
 * @since 2019-09-19
 */
@Api(tags={"后台管理员操作接口"})
@Controller
@RequestMapping("/manager")
public class ManagerController {

	@Autowired
	private ManagerService managerService;
	
	/**
	 * 登录后台
	 * @param manager
	 * @return
	 */
	@PostMapping("getManager")
	@ApiImplicitParam(name = "manager",value = "登录账号对象",paramType = "query" ,dataType = "Manager")
	@ApiOperation(value="登录")
	@ResponseBody
	public boolean getManager(Manager manager,HttpServletRequest request) {
		System.out.println(1);
		Manager admin = managerService.selectOne(new EntityWrapper<Manager>(manager));
		if(admin!=null) {
			//账号正确
			request.getSession().setAttribute("myadmin", admin);
			return true;
		}
		return false;
	}
}

