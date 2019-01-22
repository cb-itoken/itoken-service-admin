package com.cb.itoken.service.admin.test.service;

import com.cb.itoken.service.admin.ServiceAdminApplication;
import com.cb.itoken.service.admin.domain.TbSysUser;
import com.cb.itoken.service.admin.service.AdminService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceAdminApplication.class)
@ActiveProfiles(value = "dev")
@Transactional
@Rollback
public class AdminServiceTest {

    @Autowired
    private AdminService adminService;

    @Test
    public void register(){
        TbSysUser tbSysUser = new TbSysUser();
        tbSysUser.setUserCode(UUID.randomUUID().toString());
        tbSysUser.setLoginCode("cong_bing@163.com");
        tbSysUser.setPassword("123456");
        tbSysUser.setUserName("congbing");
        tbSysUser.setUserType("0");
        tbSysUser.setMgrType("1");
        tbSysUser.setStatus("0");
        tbSysUser.setCreateBy(tbSysUser.getUserCode());
        tbSysUser.setCreateDate(new Date());
        tbSysUser.setUpdateBy(tbSysUser.getUserCode());
        tbSysUser.setUpdateDate(new Date());
        tbSysUser.setCorpCode("0");
        tbSysUser.setCorpName("iToken");
        adminService.register(tbSysUser);
    }

    @Test
    public void login(){
        TbSysUser tbSysUser = adminService.login("cong_bing@163.com", "123456");
        Assert.assertNotNull(tbSysUser);
    }
}
