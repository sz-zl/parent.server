package com.sz.yk.service.impl;

import com.sz.p2p.entity.UserAccount;
import com.sz.yk.dao.UserAccountMapper;
import com.sz.yk.service.UserAccountService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户表 服务实现类
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
