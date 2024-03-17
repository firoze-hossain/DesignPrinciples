package com.roze.solid.singleResponsibilityPrinciple.bank;

import java.math.BigDecimal;

//this class's job is to do only transactional operation
public class TransactionOperations {
    public void deposit(BigDecimal amount, int accountNumber) {
        //getting account details, this job is done by AccountOperations
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }

    public void withdraw(BigDecimal amount, int accountNumber) {
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));
    }
}
