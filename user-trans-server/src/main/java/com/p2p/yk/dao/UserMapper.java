package com.p2p.yk.dao;

import com.sz.p2p.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
public interface UserMapper extends BaseMapper<User> {

	User selectUserById(Integer id);
}
