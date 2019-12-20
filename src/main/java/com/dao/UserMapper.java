package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int insert(User record);

    List<User> selectAll();
    User select(@Param("id") int id, @Param("email") String email);
    User selectByEmail(@Param("email") String email);
}