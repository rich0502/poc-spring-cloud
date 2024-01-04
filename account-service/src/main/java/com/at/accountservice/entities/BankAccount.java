package com.at.accountservice.entities;

import com.at.accountservice.enums.AccountType;
import com.at.accountservice.model.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
public class BankAccount {
    @Id
    private String accountId;
    private Double balance;
    private LocalDate createAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Transient
    private Customer customer;
    private Long customerId;
}
