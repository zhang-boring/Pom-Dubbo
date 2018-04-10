package com.curtis.dao;

import com.curtis.mapper.UserMapper;
import com.curtis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * @author boring
 */

@Repository
public class UserDAO {

    @Autowired
    private UserMapper userMapper;

    public User findUserByName(String username) {
        User user = userMapper.findUserByName(username);
        return user;
    }
}
