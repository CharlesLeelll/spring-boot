package com.lee.springboot.controller;

import com.lee.springboot.bean.Account;
import com.lee.springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Charles
 * @Date: 2019.1.20
 * @Desc:
 */
@RestController
@RequestMapping("/acc")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Account> getAccount() {
        return accountService.findAccountList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Account getAccountById(@PathVariable("id") int id) {
        return accountService.findAccountById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        int s = accountService.update(account);
        if (s == 1) {
            return account.toString();
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name") String name, @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        int s = accountService.add(account);
        if (s == 1) {
            return account.toString();
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delAccount(@PathVariable("id") int id) {
        int s = accountService.delete(id);
        if (s == 1) {
            return "success";
        } else {
            return "fail";
        }
    }
}
