package com.roze.solid.singleResponsibilityPrinciple.bank;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

//this class will be held only account relation operations(like:-get,update,create,delete account)
public class AccountOperations {
    private static Map<Integer, Account> accountMap = new HashMap<>();

    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public void updateAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber) {
        return accountMap.get(accountNumber);
    }

    //this method should be hold by another class
    //this is basically hold by Transactional related class
    //this breaks the law of single responsibility of account class

    //**XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX**
    public void deposit(BigDecimal amount, int accountNumber) {

    }
}
