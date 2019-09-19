package com.p2p.yk.service.impl;

import com.sz.p2p.entity.Manager;
import com.sz.p2p.dao.ManagerMapper;
import com.sz.p2p.service.ManagerService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author yk
 * @since 2019-09-19
 */
@Service
public class ManagerServiceImpl extends ServiceImpl<ManagerMapper, Manager> implements ManagerService {

}
