package com.j.hidden;

import java.util.function.Supplier;

public class Helper {

    public static void measureExecutionTime(Execute task, long numberOfExecutions, String description) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfExecutions; i++) {
            task.execute();
        }
        long duration = System.currentTimeMillis() - startTime;
        System.out.println(description + " ; Execution time [" + duration + "] ms");
    }

    public static interface Execute {
        void execute();
    }
}
