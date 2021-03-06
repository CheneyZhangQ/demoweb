package com.ssm.service.impl;

import com.ssm.dao.UserMapper;
import com.ssm.model.User;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangqiang on 2017/7/8.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询用户信息
     * @param id
     * @return
     */
    @Override
    public User getUser(String id){
        User user = userMapper.selectByPrimaryKey(Integer.parseInt(id));
        return user;
    }

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    @Override
    public int addUser(User user){
        return userMapper.insert(user);
    }
}
