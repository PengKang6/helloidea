package com.pk.service;

import com.pk.domain.Account;

import java.util.List;

public interface AccountService {
    public void saveAccount(Account account);
    public List<Account> findAll();
}
