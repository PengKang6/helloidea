package com.demo.springDemo.service.Impl;

import com.demo.springDemo.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser() {
        System.out.println("save user");
    }
}
