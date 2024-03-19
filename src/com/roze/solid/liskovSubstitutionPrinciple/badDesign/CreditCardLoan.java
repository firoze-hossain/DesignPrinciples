package com.roze.solid.liskovSubstitutionPrinciple.badDesign;

public class CreditCardLoan implements LoanPayment {
    @Override
    public void doPayment(double amount) {

    }

    @Override
    public void foreCloseLoan() {
        throw new UnsupportedOperationException("Fore closure is not allowed!!");
    }

    @Override
    public void doRePayment(double amount) {

    }
}
