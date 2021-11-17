package com.example.loan.bo;

public enum Gender {
    FEMALE("女性", 60), MALE("男性", 65);

    private String text;
    private Integer maxSumOfLenderAgeAndLoanAge;

    Gender(String text, Integer maxSumOfLenderAgeAndLoanAge) {
        this.text = text;
        this.maxSumOfLenderAgeAndLoanAge = maxSumOfLenderAgeAndLoanAge;
    }

    public String text() {
        return text;
    }

    public int maxSumOfLenderAgeAndLoanAge() {
        return maxSumOfLenderAgeAndLoanAge;
    }
}
