package com.p2p.yk.dao;

import com.sz.p2p.entity.Claim;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 债权表 Mapper 接口
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
public interface ClaimMapper extends BaseMapper<Claim> {

	/**
	 * 查询所有债权关系+分页
	 * @return
	 */
	List<Claim> selectListPageClaims(Map<String, Object> map);
}
