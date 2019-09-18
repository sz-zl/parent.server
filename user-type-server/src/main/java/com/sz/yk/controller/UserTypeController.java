package com.sz.yk.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.sz.p2p.entity.UserType;
import com.sz.yk.service.UserTypeService;

import java.util.List;

/**
 * <p>
 * 用户类型表 前端控制器
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@RestController
@RequestMapping("/userType")
public class UserTypeController {
	
	@Autowired
	private UserTypeService userType;

	@RequestMapping("show")
	public List<UserType> show(){
		System.out.println(1);
		List<UserType> list = userType.selectList(new EntityWrapper<UserType>());
		System.out.println(list);
		return list;
	}
}

