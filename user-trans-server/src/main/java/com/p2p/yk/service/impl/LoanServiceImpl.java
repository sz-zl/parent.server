package com.p2p.yk.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.p2p.yk.dao.LoanMapper;
import com.p2p.yk.service.LoanService;
import com.sz.p2p.entity.Loan;

/**
 * <p>
 * 借款/散标表 服务实现类
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Service
public class LoanServiceImpl extends ServiceImpl<LoanMapper, Loan> implements LoanService {

	@Override
	public List<Loan> selectListPageLoans(Map<String, Object> map) {
		return this.baseMapper.selectListPageLoans(map);
	}

	@Override
	public Loan selectOneLoan(Integer id) {
		return this.baseMapper.selectOneLoan(id);
	}

	@Override
	public Long selectMaxId() {
		return this.baseMapper.selectMaxId();
	}

}
