package com.company.Algorithms.WarmUp;

import java.util.List;

public class SimpleArraySum {

//    https://www.hackerrank.com/challenges/simple-array-sum/problem

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int result = 0;
        for(Integer i : ar)
            result+=i;
        return result;
    }
}
