package com.p2p.yk.service.impl;

import com.sz.p2p.entity.UserTrans;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.p2p.yk.dao.UserTransMapper;
import com.p2p.yk.service.UserTransService;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户交易表 服务实现类
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Service
public class UserTransServiceImpl extends ServiceImpl<UserTransMapper, UserTrans> implements UserTransService {

	@Override
	public List<UserTrans> selectPageList(Map<String, Object> map) {
		return this.baseMapper.selectPageList(map);
	}

}
