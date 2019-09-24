package com.p2p.yk.service.impl;

import com.sz.p2p.entity.Claim;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.p2p.yk.dao.ClaimMapper;
import com.p2p.yk.service.ClaimService;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 债权表 服务实现类
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Service
public class ClaimServiceImpl extends ServiceImpl<ClaimMapper, Claim> implements ClaimService {

	@Override
	public List<Claim> selectListPageClaims(Map<String, Object> map) {
		return this.baseMapper.selectListPageClaims(map);
	}

	@Override
	public Claim selectOneLoan(Integer id) {
		return this.baseMapper.selectOneLoan(id);
	}

}
