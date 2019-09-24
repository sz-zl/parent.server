package com.p2p.yk.dao;

import com.sz.p2p.entity.Loan;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 借款/散标表 Mapper 接口
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
public interface LoanMapper extends BaseMapper<Loan> {

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
	
	/**
	 * 查看最大编号
	 */
	Long selectMaxId();
}
