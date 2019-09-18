package com.sz.yk.service.impl;

import com.sz.p2p.entity.Loan;
import com.sz.yk.dao.LoanMapper;
import com.sz.yk.service.LoanService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
