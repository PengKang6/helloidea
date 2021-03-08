package com.pk.dao;

import com.pk.domain.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountDao {

    public void saveAccount(Account account);
    public List<Account> findAllByID();
}
