package com.p2p.yk.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.p2p.yk.service.LoanService;
import com.sz.p2p.entity.Loan;
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * <p>
 * 借款/散标表 前端控制器
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Api(tags={"散标记录接口"})
@Controller
@RequestMapping("/loan")
public class LoanController {
	
	private int cp=1;
	private int ps=10;

	@Autowired
	private LoanService loanService;
	
	/**
	 * 查看所有的借款/散标信息+分页
	 * @param cp
	 * @param ps
	 * @return
	 */
	@ResponseBody
	@PostMapping("listLoans1")
	@ApiImplicitParams(value = {
	@ApiImplicitParam(name = "cp",value = "当前页",paramType = "query",dataType = "int"),
	@ApiImplicitParam(name = "ps",value = "每页显示行数",paramType = "query",dataType = "int")})
	@ApiOperation(value="查看所有散标信息")
	public Split<Loan> listLoans1(Integer cp,Integer ps){
		if(cp!=null&&cp>0) {
			this.cp=cp;
		}
		if(ps!=null&&ps>0) {
			this.ps=ps;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cp", (this.cp-1)*this.ps);
		map.put("ps", this.cp*this.ps);
		List<Loan> loanList = loanService.selectListPageLoans(map);
		int count = loanService.selectCount(new EntityWrapper<Loan>());
		int pages = (int)Math.ceil(1.0*count/this.ps);
		Split<Loan> split = new Split<>(count, this.cp, this.ps, pages, loanList);
		return split;
	}
	/**
	 * 查看所有的借款/散标信息+分页
	 * @param cp
	 * @param ps
	 * @return
	 */
	@PostMapping("listLoans")
	@ApiIgnore
	public String listLoans(Integer cp,Integer ps,Model model){
		if(cp!=null&&cp>0) {
			this.cp=cp;
		}
		if(ps!=null&&ps>0) {
			this.ps=ps;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cp", (this.cp-1)*this.ps);
		map.put("ps", this.cp*this.ps);
		List<Loan> loanList = loanService.selectListPageLoans(map);
		int count = loanService.selectCount(new EntityWrapper<Loan>());
		int pages = (int)Math.ceil(1.0*count/this.ps);
		Split<Loan> split = new Split<>(count, this.cp, this.ps, pages, loanList);
		model.addAttribute("splitDTO", split);
		return "";
	}
	
	
	/**
	 * 通过编号查看散标信息
	 * @param id
	 * @return
	 */
	@ResponseBody
	@PostMapping("getLoanOne1")
	@ApiImplicitParam(name = "id",value = "散标编号",paramType = "query",dataType = "int")
	@ApiOperation(value="根据散标编号查看散标信息")
	public Loan getLoanOne1(Integer id) {
		return loanService.selectOneLoan(id);
	}
	/**
	 * 通过编号查看散标信息
	 * @param id
	 * @return
	 */
	@PostMapping("getLoanOne")
	@ApiIgnore
	public String getLoanOne(Integer id) {
		Loan loan = loanService.selectOneLoan(id);
		if(loan!=null) {
			return "";
		}
		return "error";
	}
	
	
	
	/**
	 * 修改散标
	 */
	@ResponseBody
	@PostMapping("updateLoan1")
	@ApiImplicitParam(name = "loan",value = "修改后的散标对象",paramType = "query",dataType = "int")
	@ApiOperation(value="修改散标信息")
	public boolean updateLoan1(Loan loan) {
		boolean flag = loanService.updateById(loan);
		if(flag) {
			System.out.println("修改成功!");
			return true;
		}else {
			System.out.println("修改失败!");
			return false;
		}
	}
	
	
	/**
	 * 修改散标
	 */
	@PostMapping("updateLoan")
	@ApiIgnore
	public String updateLoan(Loan loan) {
		boolean flag = loanService.updateById(loan);
		if(flag) {
			System.out.println("修改成功!");
			return "";
		}else {
			System.out.println("修改失败!");
			return "";
		}
	}
	
	/**
	 * 添加散标
	 * @param loan
	 * @return
	 */
	@ResponseBody
	@PostMapping("insertLoan1")
	@ApiImplicitParam(name = "loan",value = "散标对象",paramType = "query")
	@ApiOperation(value="添加散标")
	public boolean insertLoan1(@RequestBody Loan loan) {
		redis.clients.jedis.Jedis jedis = new redis.clients.jedis.Jedis("10.1.14.191",6379);
		String str = jedis.get("myuser");
		System.out.println(loan);
		Long maxId = loanService.selectMaxId();
		Long id = Long.valueOf(maxId)+1;
		loan.setLoanNo(id);
		User u = JSON.parseObject(str,User.class);
		double userid = u.getUserId();
		loan.setUserId(userid);
		loan.setLoanId(id);
		return loanService.insert(loan);
	}
	/**
	 * 添加散标
	 * @param loan
	 * @return
	 */
	@PostMapping("insertLoan")
	@ApiIgnore
	public String insertLoan(Loan loan) {
		System.out.println("进入了");
		redis.clients.jedis.Jedis jedis = new redis.clients.jedis.Jedis("10.1.14.191",6379);
		String str = jedis.get("myuser");
		System.out.println(loan);
		if(str!=null) {
			Long maxId = loanService.selectMaxId();
			Long id = Long.valueOf(maxId)+1;
			loan.setLoanNo(id);
			User u = JSON.parseObject(str,User.class);
			double userid = u.getUserId();
			loan.setUserId(userid);
			loan.setLoanId(id);
			loanService.insert(loan);
			return "index";
		}else {
			return "login2";
		}
	}
	
}

