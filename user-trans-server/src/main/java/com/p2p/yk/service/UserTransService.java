package com.p2p.yk.service;

import com.sz.p2p.entity.UserTrans;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 用户交易表 服务类
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
public interface UserTransService extends IService<UserTrans> {

	List<UserTrans> selectPageList(Map<String, Object> map);
}
