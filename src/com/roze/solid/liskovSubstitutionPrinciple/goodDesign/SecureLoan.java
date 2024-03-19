package com.roze.solid.liskovSubstitutionPrinciple.goodDesign;

public interface SecureLoan extends LoanPayment {
    public void foreCloseLoan();
}
