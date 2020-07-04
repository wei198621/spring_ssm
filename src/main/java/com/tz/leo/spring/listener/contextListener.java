package com.tz.leo.spring.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Author: tz_wl
 * Date: 2020/7/4 17:04
 * Content: 此类不用关注
 */
public class contextListener implements ServletContextListener {

    private ClassPathXmlApplicationContext context;

    //服务器启动初始化方法
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String config = servletContextEvent.getServletContext().getInitParameter("config");
        System.out.println(config);
        context =new ClassPathXmlApplicationContext(config);
        servletContextEvent.getServletContext().setAttribute("application",context);
        System.out.println("=======服务器启动========");
    }

    //服务器关闭初始化方法
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("=======服务器销毁========");
        context.close();

    }
}
