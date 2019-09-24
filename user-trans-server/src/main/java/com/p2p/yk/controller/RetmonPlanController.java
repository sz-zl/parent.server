package com.p2p.yk.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.p2p.yk.service.RetmonPlanService;
import com.sz.p2p.entity.RetmonPlan;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 还款计划表 前端控制器
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Api(tags={"还款管理接口"})
@Controller
@RequestMapping("/retmonPlan")
public class RetmonPlanController {

	@Autowired
	private RetmonPlanService retmonPlanService;
	
	/**
	 * 还款
	 * @param retmonPlan
	 * @return
	 */
	@ResponseBody
	@PostMapping("updateRetPlan1")
	@ApiImplicitParam(name = "retmonPlan",value = "修改的对象",paramType = "query")
	@ApiOperation(value="还款")
	@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,readOnly = false)
	public boolean updateRetPlan1(RetmonPlan retmonPlan) {
		retmonPlan.setStatus(0d);
		RetmonPlan retmonPlan2 = new RetmonPlan();
		retmonPlan2.setStatus(1d);
		double num = retmonPlan.getRetMonNum()+1;
		boolean flagNow = retmonPlanService.updateById(retmonPlan);
		boolean flagNext = retmonPlanService.update(retmonPlan2,new EntityWrapper<RetmonPlan>().eq("ret_mon_date_num", num));
		return flagNow&&flagNext;
		
	}
}

