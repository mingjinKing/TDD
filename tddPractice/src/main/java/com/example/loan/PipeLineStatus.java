package com.example.loan;

import lombok.Getter;

@Getter
public class PipeLineStatus {
    private boolean success;
    private Integer successStepsCount;

    public PipeLineStatus(boolean success, int successStepsCount) {

        this.success = success;
        this.successStepsCount = successStepsCount;
    }
}
