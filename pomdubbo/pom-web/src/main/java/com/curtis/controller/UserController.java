package com.curtis.controller;

import com.curtis.inter.UserServiceInterface;
import com.curtis.service.*;
import com.curtis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author boring
 */

@RequestMapping(value = "/")
@Controller
public class UserController {

    @Autowired
    private UserServiceInterface userservice;

    @RequestMapping(value = "/")
    @ResponseBody
    public void getUser(@RequestParam String username) {
        User user = userservice.getUser(username);
        System.out.println(user.getUsername() + "的密码为:" + user.getPassword());
    }
}
