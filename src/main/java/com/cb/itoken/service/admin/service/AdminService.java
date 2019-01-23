package com.cb.itoken.service.admin.service;


import com.cb.itoken.common.domain.TbSysUser;

public interface AdminService {
    /**
     * 注册
     * @param tbSysUser
     */
    public void register(TbSysUser tbSysUser);

    /**
     * 登录
     * @param loginCode 登录账号
     * @param plantPassword 明文密码
     * @return
     */
    public TbSysUser login(String loginCode, String plantPassword);
}
