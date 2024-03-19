package com.roze.solid.liskovSubstitutionPrinciple.goodDesign;

public class LoanClosureService {
    private SecureLoan secureLoan;

    //we can only pass the child Class HomeLoan
    //keeps the relationship between parent-child class substitution
    //Good Design
    public LoanClosureService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;
    }

    public void foreCloseLoan() {
        secureLoan.foreCloseLoan();
    }
}
