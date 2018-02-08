package com.swift.academy.valuesVsReference;

public class ValueVsReference{

    static double calculateExpectedLoanV(double principal, int years) {
        for (int i = 0 ; i < years; i++) {
            principal *= 1.05;
        }
        return principal;
    }

    static double calculateExpectedLoanR(LoanTerms termArg) {
        for (int i = 0 ; i < termArg.years; i++) {
            termArg.principal *= 1.05;
        }
        return termArg.principal;
    }

    public static void main(String[] args) {
        double valueTypeResult;
        double referenceTypeResult;

        LoanTerms terms = new LoanTerms(1000, 10);
        
        System.out.println(terms.principal);                        // 1000
        valueTypeResult = calculateExpectedLoanV(terms.principal, terms.years);         // 1628.89
        System.out.println(terms.principal);                        // 1000
                                                   
        System.out.println(terms.principal);                        // 1000
        referenceTypeResult = calculateExpectedLoanR(terms);        // 1628.89

        System.out.println(terms.principal);                        // 1628.8946267 !!! Should be 1000, because it makes no sense to change loan terms when calculating end loan result !!

    }
}