package com.roze.solid.liskovSubstitutionPrinciple.badDesign;

public class LoanClosureService {
    private LoanPayment loanPayment;

    //whenever I pass the child class HomeLoan it will work
    //But It will not work for CreditCardLoan
    //Because the forCloseLoan is only for homeLoan not for CreditCardLoan
    //so when i pass CreditCardLOan class here it will throw UnsupportedOperationException
    //so the it is bad design for parent child substitution
    // it is not well designed for interchangeable(parent child)
    public LoanClosureService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }

    public void foreCloseLoan() {
        loanPayment.foreCloseLoan();
    }
}
