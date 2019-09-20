package com.p2p.yk.service;

import com.sz.p2p.entity.Loan;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 借款/散标表 服务类
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
public interface LoanService extends IService<Loan> {

	/**
	 * 查看所有的借款/散标信息+分页
	 * @param map
	 * @return
	 */
	List<Loan> selectListPageLoans(Map<String, Object> map);
	
	/**
	 * 通过编号查看散标信息
	 * @param id
	 * @return
	 */
	Loan selectOneLoan(Integer id);
}
