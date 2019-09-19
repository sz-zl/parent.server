package com.p2p.yk.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.p2p.yk.dao.UserMapper;
import com.p2p.yk.service.UserService;
import com.sz.p2p.entity.User;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

	@Override
	public User selectUserById(Integer id) {
		return this.baseMapper.selectUserById(id);
	}

}
