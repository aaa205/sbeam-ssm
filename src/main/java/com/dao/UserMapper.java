package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int insert(User record);

    List<User> selectAll();
    User selectById(@Param("id") int id);
    User selectByEmail(@Param("email") String email);
    User selectByEmailAndPassword(@Param("email") String email,@Param("password") String password);
}