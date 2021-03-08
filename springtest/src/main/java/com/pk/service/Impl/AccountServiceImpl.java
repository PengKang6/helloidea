package com.pk.service.Impl;

import org.springframework.stereotype.Service;
import com.pk.domain.Account;
import com.pk.service.AccountService;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public void saveAccount(Account account) {
        System.out.println("保存了" + account.getName() + "的账户");
    }

    @Override
    public List<Account> findAll() {
        Account account1 = new Account();account1.setId(1);account1.setName("pk");account1.setMoney(12.12);
        Account account2 = new Account();account2.setId(2);account2.setName("pw");account2.setMoney(24.1);
        List<Account> list = new LinkedList<>(Arrays.asList(account1, account2));
        System.out.println("查询到了两个账户");
        return list;
    }
}
