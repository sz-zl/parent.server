package com.p2p.yk.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.yk.service.LoanService;
import com.sz.p2p.entity.Loan;

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
	@ApiImplicitParams(value = {@ApiImplicitParam(name = "cp",value = "当前页",paramType = "query",dataType = "int"),@ApiImplicitParam(name = "ps",value = "每页显示行数",paramType = "query",dataType = "int")})
	@ApiOperation(value="查看所有散标信息")
	public List<Loan> listLoans1(Integer cp,Integer ps){
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
		System.out.println(loanList);
		return loanList;
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
		model.addAttribute("loanListDTO", loanList);
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
	@ApiOperation(value="根据散标查看散标信息")
	public Loan getLoanOne1(Integer id) {
		Loan loan = loanService.selectOneLoan(id);
		if(loan!=null) {
			return loan;
		}
		return null;
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
	@ApiOperation(value="根据散标查看散标信息")
	public boolean insertLoan1(Loan loan) {
		boolean flag = loanService.insert(loan);
		if(flag) {
			System.out.println("添加成功!");
			return true;
		}
		System.out.println("添加失败!");
		return false;
	}
	/**
	 * 添加散标
	 * @param loan
	 * @return
	 */
	@PostMapping("insertLoan")
	@ApiIgnore
	public boolean insertLoan(Loan loan) {
		boolean flag = loanService.insert(loan);
		if(flag) {
			System.out.println("添加成功!");
			return true;
		}
		System.out.println("添加失败!");
		return false;
	}
	
	/**
	 * 修改散标
	 * @param id
	 * @return
	 */
	@ResponseBody
	@PostMapping("deleteLoan1")
	@ApiImplicitParam(name = "id",value = "散标对象编号",paramType = "query",type = "int")
	@ApiOperation(value="根据散标编号删除散标")
	public boolean deleteLoan1(Integer id) {
		boolean flag = loanService.deleteById(id);
		if(flag) {
			System.out.println("删除成功!");
			return true;
		}
		System.out.println("删除失败!");
		return false;
	}
	/**
	 * 修改散标
	 * @param id
	 * @return
	 */
	@ResponseBody
	@PostMapping("deleteLoan")
	@ApiImplicitParam(name = "id",value = "散标对象编号",paramType = "query",type = "int")
	@ApiOperation(value="根据散标编号删除散标")
	public boolean deleteLoan(Integer id) {
		boolean flag = loanService.deleteById(id);
		if(flag) {
			System.out.println("删除成功!");
			return true;
		}
		System.out.println("删除失败!");
		return false;
	}
}

