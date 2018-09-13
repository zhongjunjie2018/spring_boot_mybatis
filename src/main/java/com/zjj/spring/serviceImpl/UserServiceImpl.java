package com.zjj.spring.serviceImpl;

import com.zjj.spring.dao.UserMapper;
import com.zjj.spring.model.User;
import com.zjj.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public User queryUserByName(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void modifyUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }
}
