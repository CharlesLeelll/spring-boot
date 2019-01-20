package com.lee.springboot.service.impl;

import com.lee.springboot.bean.Account;
import com.lee.springboot.dao.AccountDao;
import com.lee.springboot.service.AccountService;

import java.util.List;

/**
 * @author: Charles
 * @Date: 2019.1.20
 * @Desc:
 */
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public int add(Account account) {
        return 0;
    }

    @Override
    public int update(Account account) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public Account findAccountById(int id) {
        return null;
    }

    @Override
    public List<Account> findAccountList() {
        return null;
    }
}
