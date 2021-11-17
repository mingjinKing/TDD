package com.example.loan;

import java.util.ArrayList;
import java.util.List;

public class Phase {
    List<Branch> branches = new ArrayList<>();
    private int count = 0;

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public Boolean execute() {
        for (Branch branch : branches) {
            Boolean result = branch.execute();
            if (result) {
                count += branch.successStepsCount();
                return true;
            }
        }
        return false;
    }

    public int getSuccessStepsCount() {
        return count;
    }
}
