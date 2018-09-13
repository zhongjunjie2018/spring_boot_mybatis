package com.zjj.spring.service;

import com.zjj.spring.model.User;

public interface UserService {

    void  addUser(User user);

    User queryUserByName(Integer id);


    void modifyUser(User user);
}
