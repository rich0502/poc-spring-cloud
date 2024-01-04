package com.at.accountservice;

import com.at.accountservice.entities.BankAccount;
import com.at.accountservice.enums.AccountType;
import com.at.accountservice.repository.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
@EnableFeignClients
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BankAccountRepository accountRepository){
        return args -> {
            BankAccount bankAccount = BankAccount.builder()
                    .accountId(UUID.randomUUID().toString())
                    .currency("MGA")
                    .balance(200000.0)
                    .createAt(LocalDate.now())
                    .customerId(Long.valueOf(1))
                    .type(AccountType.SAVING_ACCOUNT)
                    .build();

            BankAccount bankAccount2 = BankAccount.builder()
                    .accountId(UUID.randomUUID().toString())
                    .currency("MGA")
                    .balance(200000.0)
                    .createAt(LocalDate.now())
                    .type(AccountType.CURRENT_ACCOUNT)
                    .customerId(Long.valueOf(1))
                    .build();

            accountRepository.save(bankAccount);
            accountRepository.save(bankAccount2);
        };
    }
}
