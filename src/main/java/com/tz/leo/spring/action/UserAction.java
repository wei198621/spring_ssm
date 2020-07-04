package com.tz.leo.spring.action;

import com.opensymphony.xwork2.Action;
import com.tz.leo.spring.entity.User;
import com.tz.leo.spring.service.UserService;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/7/4 17:01
 * Content:
 */
public class UserAction {
    private UserService userService;

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String findAll(){
        this.users =userService.findAll();
        return Action.SUCCESS;
    }

}
