package com.service;

import com.dao.UserMapper;
import com.exception.BusinessException;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 插入用户数据
     *
     * @param user
     * @return 包含用户数据的user
     */
    @Override
    public User doRegister(User user) {
        if (userMapper.selectByEmail(user.getEmail()) == null) {
            userMapper.insert(user);
            return userMapper.selectByEmail(user.getEmail());
        }
        else
            throw new BusinessException(2, "该用户已注册");
    }

    @Override
    public User doLogin(User user) {
        return null;
    }
}
