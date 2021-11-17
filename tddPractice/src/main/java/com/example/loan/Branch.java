package com.example.loan;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    List<Step> steps = new ArrayList<>();
    private int count = 0;

    public void addStep(Step step) {
        steps.add(step);
    }

    public Boolean execute() {
        for (Step step : steps) {
            Boolean result = step.execute();
            if (result) {
                count++;
            } else {
                return false;
            }
        }
        return true;
    }

    public int successStepsCount() {
        return count;
    }
}
