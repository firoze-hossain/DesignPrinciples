package com.roze.solid.liskovSubstitutionPrinciple.goodDesign;

public class HomeLoan implements SecureLoan{
    @Override
    public void doPayment(double amount) {

    }

    @Override
    public void foreCloseLoan() {

    }
}
