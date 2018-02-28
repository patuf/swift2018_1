package com.swift.academy.exceptions_causes;

class CalculationException extends Exception {

    CalculationException(String message) {
        super(message);
    }

    CalculationException(String message, Throwable ex) {
        super(message, ex);
    }

}
