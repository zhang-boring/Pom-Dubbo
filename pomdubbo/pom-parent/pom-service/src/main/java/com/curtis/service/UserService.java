package com.curtis.service;

import com.curtis.dao.UserDAO;
import com.curtis.inter.UserServiceInterface;
import com.curtis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author boring
 */

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserDAO userDAO;

    public User getUser(String username) {
        User user = userDAO.findUserByName(username);
        return user;
    }
}
