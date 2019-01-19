package com.lee.springboot.dao;

import com.lee.springboot.bean.Account;

import java.util.List;

/**
 * @author: Charles
 * @Date: 2019.1.19
 * @Desc:
 */
public interface AccountDao {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
