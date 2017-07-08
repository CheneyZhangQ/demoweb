package com.ssm;

import com.ssm.model.User;
import com.ssm.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhangqiang on 2017/7/8.
 */
public class test extends BaseTest {

    @Autowired
    private IUserService userService;

    @Test
    public void addUser() {
        User user = new User();
        user.setPassword("654321");
        user.setUsername("测试账号");
        System.out.println(userService.addUser(user));
    }
}
