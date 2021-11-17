package com.example.loan.controller;

import lombok.Getter;

@Getter
public class QueryResult {
    private final boolean canLoan;
    private final String failureMessage;

    public QueryResult(boolean canLoan, String failureMessage) {

        this.canLoan = canLoan;
        this.failureMessage = failureMessage;
    }

    public static QueryResult success() {
        return new QueryResult(true, "");
    }

    public static QueryResult fail(String message) {
        return new QueryResult(false, message);
    }
}
