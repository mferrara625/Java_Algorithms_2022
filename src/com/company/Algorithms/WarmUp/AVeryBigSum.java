package com.company.Algorithms.WarmUp;

import java.util.List;

public class AVeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long result = 0;
        for(Long i : ar){
            result += i;
        }

        return result;
    }

}
