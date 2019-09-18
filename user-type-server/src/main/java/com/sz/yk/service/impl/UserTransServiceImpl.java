package com.sz.yk.service.impl;

import com.sz.p2p.entity.UserTrans;
import com.sz.yk.dao.UserTransMapper;
import com.sz.yk.service.UserTransService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户交易表 服务实现类
 * </p>
 *
 * @author yk
 * @since 2019-09-16
 */
@Service
public class UserTransServiceImpl extends ServiceImpl<UserTransMapper, UserTrans> implements UserTransService {

}
