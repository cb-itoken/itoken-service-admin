package com.cb.itoken.service.admin.test.service;

import com.cb.itoken.service.admin.ServiceAdminApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceAdminApplication.class)
@ActiveProfiles(value = "dev")
public class AdminServiceTest {

    @Test
    public void register(){

    }

    @Test
    public void login(){

    }
}
