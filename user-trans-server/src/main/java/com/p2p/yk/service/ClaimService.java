package com.p2p.yk.service;

import com.sz.p2p.entity.Claim;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 债权表 服务类
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
public interface ClaimService extends IService<Claim> {

	/**
	 * 查询所有债权关系+分页
	 * @return
	 */
	List<Claim> selectListPageClaims(Map<String, Object> map);
	
	/**
	 * 根据债权编号查询数据
	 * @param id
	 * @return
	 */
	Claim selectOneLoan(Integer id);
}
