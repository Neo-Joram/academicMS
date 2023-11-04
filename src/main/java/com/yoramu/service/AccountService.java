package com.yoramu.service;

import com.yoramu.model.Account;

import java.util.List;

public interface AccountService {
    public Account createAccount(Account account);
    public List<Account> accountList();
    public Account login(String email, String password);
}
