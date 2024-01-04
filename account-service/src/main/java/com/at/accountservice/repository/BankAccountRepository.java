package com.at.accountservice.repository;

import com.at.accountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository  extends JpaRepository<BankAccount, String> {
}
