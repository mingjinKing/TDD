package com.example.loan.bo;

import com.example.loan.controller.QueryResult;

public class Validator {

    public static final int MAX_LOAN_AGE = 30;
    public static final int MAX_HOUSE_AGE = 40;

    public QueryResult check(UserLoanPlanMaterial userLoanPlanMaterial, Integer loanAge) {
        Integer lenderAge = userLoanPlanMaterial.getLenderAge();
        Gender gender = userLoanPlanMaterial.getGender();
        if (loanAge > MAX_LOAN_AGE) {
            return QueryResult.fail(String.format("贷款年限最长为_%d_年", MAX_LOAN_AGE));
        }
        if (loanAge + userLoanPlanMaterial.getHouseAge() > MAX_HOUSE_AGE) {
            return QueryResult.fail(String.format("贷款年限_加_房龄不能超过%d年", MAX_HOUSE_AGE));
        }
        if (lenderAge + loanAge > gender.maxSumOfLenderAgeAndLoanAge()) {
            return QueryResult.fail(String.format("%s_主贷款人_年龄_加_贷款年限_不超过_%s", gender.text(), gender.maxSumOfLenderAgeAndLoanAge()));
        }
        return QueryResult.success();
    }

}
