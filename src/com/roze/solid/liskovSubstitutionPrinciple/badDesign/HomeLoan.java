package com.roze.solid.liskovSubstitutionPrinciple.badDesign;

public class HomeLoan implements LoanPayment{
    @Override
    public void doPayment(double amount) {

    }

    @Override
    public void foreCloseLoan() {

    }

    @Override
    public void doRePayment(double amount) {

    }
}
