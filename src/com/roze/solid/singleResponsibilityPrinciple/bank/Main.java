package com.roze.solid.singleResponsibilityPrinciple.bank;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Md. Firoze Hossain");
        account.setAccountNumber(15103271);
        account.setTotalAmount(BigDecimal.valueOf(10000));

        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);
        System.out.println("Account Details: " + account);
        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(1000), 15103271);
        System.out.println("After Deposit: " + account);
    }
}
