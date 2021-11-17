package com.example.loan.bo;

import java.util.Arrays;

public class SupplierValidator {
    public Boolean validateSpecial(String field) {
        return Arrays.asList("特殊", "一般").contains(field);
    }
}
