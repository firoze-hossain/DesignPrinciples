package com.roze.solid.liskovSubstitutionPrinciple.badDesign;

public interface LoanPayment {
    public void doPayment(double amount);
    public void foreCloseLoan();
    public void doRePayment(double amount);
}
