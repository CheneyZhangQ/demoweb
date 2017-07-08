package com.ssm.service;

import com.ssm.model.User;

/**
 * Created by zhangqiang on 2017/7/8.
 */
public interface IUserService {

    User getUser(String id);

    int addUser(User user);
}
