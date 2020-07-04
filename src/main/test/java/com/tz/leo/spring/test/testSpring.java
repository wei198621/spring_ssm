package com.tz.leo.spring.test;

import com.tz.leo.spring.entity.User;
import com.tz.leo.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/7/4 17:59
 * Content:
 */
public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-basic.xml");
        UserService userService = (UserService) context.getBean("userService");
        List<User> allUser = userService.findAll();
        for (User user : allUser) {
            System.out.println(user);
        }

    }
}
