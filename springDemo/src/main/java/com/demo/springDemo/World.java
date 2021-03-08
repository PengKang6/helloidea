package com.demo.springDemo;

import com.demo.springDemo.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class World {
    public static void main(String[] args) throws SQLException {
        //获取spring容器
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        //根据bean id获取对象
        UserService userService = (UserService) applicationContext.getBean("UserService");
        userService.saveUser();


    }
}