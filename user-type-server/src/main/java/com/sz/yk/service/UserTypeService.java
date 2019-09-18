package com.sz.yk.service;

import com.sz.p2p.entity.UserType;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 用户类型表 服务类
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
public interface UserTypeService extends IService<UserType> {

	List<UserType> getAll();
}
