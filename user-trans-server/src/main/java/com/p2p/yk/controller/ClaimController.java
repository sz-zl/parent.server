package com.p2p.yk.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.yk.service.ClaimService;
import com.sz.p2p.entity.Claim;

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
 * 债权表 前端控制器
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Api(tags={"债权管理接口"})
@Controller
@RequestMapping("/claim")
public class ClaimController {

	private int cp=1;
	private int ps=10;
	
	@Autowired
	private ClaimService claimService;
	
	/**
	 * 查看所有债权信息+分页
	 * @param cp
	 * @param ps
	 * @return
	 */
	@ResponseBody
	@PostMapping("listClaim1")
	@ApiImplicitParams(value = {
	@ApiImplicitParam(name = "cp",value = "当前页",paramType = "query",dataType = "int"),
	@ApiImplicitParam(name = "ps",value = "每页显示行数",paramType = "query",dataType = "int")})
	@ApiOperation(value="查看所有债权信息")
	public List<Claim> listClaim1(Integer cp,Integer ps){
		if(cp!=null&&cp>0) {
			this.cp=cp;
		}
		if(ps!=null&&ps>0) {
			this.ps=ps;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cp", (this.cp-1)*this.ps);
		map.put("ps", this.cp*this.ps);
		List<Claim> ClaimList = claimService.selectListPageClaims(map);
		return ClaimList;
	}
	
	/**
	 * 根据债权编号查看债权详情
	 * @param id
	 * @return
	 */
	@ResponseBody
	@PostMapping("getClaim1")
	@ApiImplicitParam(name = "id",value = "债权编号",paramType = "query",dataType = "int")
	@ApiOperation(value="根据债权编号查看债权详情")
	public Claim getClaim1(Integer id) {
		Claim claim = claimService.selectById(id);
		return claim;
	}
	
}

