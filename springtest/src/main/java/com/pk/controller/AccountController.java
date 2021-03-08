package com.pk.controller;

import com.pk.service.AccountService;
import com.pk.test.MyLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/a")
    public String findAll(){
        System.out.println("表现层查询所有账户");
        accountService.findAll();
        return "list";
    }

    @RequestMapping("/aop")
    public String saveLog(){
        return "list";
    }


}
