package com.cb.itoken.service.admin.service.impl;

import com.cb.itoken.common.domain.TbSysUser;
import com.cb.itoken.common.mapper.TbSysUserMapper;
import com.cb.itoken.common.service.impl.BaseServiceImpl;
import com.cb.itoken.service.admin.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AdminServiceImpl extends BaseServiceImpl<TbSysUser, TbSysUserMapper> implements AdminService {

}
