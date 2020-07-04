package com.tz.leo.spring.service;

import com.tz.leo.spring.dao.UserDao;
import com.tz.leo.spring.entity.User;

import java.util.List;
import java.util.Random;

/**
 * Author: tz_wl
 * Date: 2020/7/4 16:56
 * Content:
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        int max=1000;
        int min=100;

        Random random = new Random();
        int id = random.nextInt(max)%(max-min+1) + min;
        user.setId(id);
        userDao.save(user);
    }

    @Override
    public List<User> findAll() {

        return userDao.findAll();
    }
}
