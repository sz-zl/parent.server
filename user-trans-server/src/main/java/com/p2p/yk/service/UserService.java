package com.p2p.yk.service;

import com.sz.p2p.entity.User;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
public interface UserService extends IService<User> {

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
