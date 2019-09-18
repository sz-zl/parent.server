package com.p2p.yk.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.p2p.yk.dao.UserTransMapper;
import com.sz.p2p.entity.UserTrans;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 用户交易表 前端控制器
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Api(tags={"用户交易记录接口"})
@RestController
@RequestMapping("/userTrans")
public class UserTransController {

	@Autowired
	private UserTransMapper userTrans;
	
	@GetMapping("/show")
	@ApiOperation(value="查询数据",notes = "注意问题")
	public List<UserTrans> sh() {
		List<UserTrans> list = userTrans.selectList(new EntityWrapper<>());
		return list;
	}
	
	@GetMapping("/find")
	@ApiImplicitParam(name = "id",value = "数据编号",paramType = "query",dataType = "int")
	@ApiOperation(value="根据编号查看对象",notes="")
	@ApiModelProperty(value="对象编号",required = true)
	public UserTrans findOne(Integer id) {
		UserTrans user = userTrans.selectOne(new UserTrans());
		return user;
	}
	
}

