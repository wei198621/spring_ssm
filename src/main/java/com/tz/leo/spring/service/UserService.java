package com.tz.leo.spring.service;

import com.tz.leo.spring.entity.User;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/7/4 16:55
 * Content:
 */
public interface UserService {
    public void save(User user);
    public List<User> findAll();
}
