package com.example.loan;

import java.util.ArrayList;
import java.util.List;

public class Pipeline {
    List<Phase> phases = new ArrayList<>();

    public void addPhase(Phase phase) {
        phases.add(phase);
    }

    public PipeLineStatus start() {
        int successCount = 0;
        for (Phase phase : phases) {
            Boolean success = phase.execute();
            if (success) {
                successCount += phase.getSuccessStepsCount();
            } else {
                return new PipeLineStatus(false, successCount);
            }
        }
        return new PipeLineStatus(true, successCount);
    }
}
