package com.sz.yk.service.impl;

import com.sz.p2p.entity.LoginLog;
import com.sz.yk.dao.LoginLogMapper;
import com.sz.yk.service.LoginLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录日志记录表 服务实现类
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements LoginLogService {

}
