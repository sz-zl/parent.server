package com.p2p.yk.dao;

import com.sz.p2p.entity.User;

import java.util.List;
import java.util.Map;

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

	/**
	 * 根据编号查看用户
	 * @param id
	 * @return
	 */
	User selectUserById(Integer id);
	
	/**
	 * 查看所用用户信息+联表+分页
	 * @return
	 */
	List<User> selectListPageUsers(Map<String, Object> map);
}
