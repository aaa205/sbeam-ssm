package com.dao;

import com.pojo.User;
import java.util.List;

public interface UserMapper {
    int insert(User record);

    List<User> selectAll();
}