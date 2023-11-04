package com.yoramu.service;

import com.yoramu.model.Account;

import java.util.List;

public interface AccountService {
    Account createAccount(Account account);
    List<Account> accountList();
    Account login(String email, String password);
}
