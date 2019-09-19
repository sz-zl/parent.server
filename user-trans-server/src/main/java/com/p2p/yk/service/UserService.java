package com.p2p.yk.service;

import com.sz.p2p.entity.User;
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

	User selectUserById(Integer id);
}
