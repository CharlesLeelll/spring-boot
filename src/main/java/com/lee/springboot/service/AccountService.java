package com.lee.springboot.service;

import com.lee.springboot.bean.Account;

import java.util.List;

/**
 * @author: Charles
 * @Date: 2019.1.20
 * @Desc:
 */
public interface AccountService {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();

}
