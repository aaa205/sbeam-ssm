package com.service;

import com.pojo.User;


public interface UserService {

    User doRegister(User user);
    User doLogin(User user);
}
