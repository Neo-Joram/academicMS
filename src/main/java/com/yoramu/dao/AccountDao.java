package com.yoramu.dao;

import com.yoramu.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountDao extends JpaRepository<Account, UUID> {
    Account findAccountByEmailAndPassword(String email, String password);
}
