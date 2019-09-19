package com.p2p.yk.dao;

import com.sz.p2p.entity.UserTrans;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 用户交易表 Mapper 接口
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
public interface UserTransMapper extends BaseMapper<UserTrans> {

	List<UserTrans> selectPageList(Map<String, Object> map);
}
