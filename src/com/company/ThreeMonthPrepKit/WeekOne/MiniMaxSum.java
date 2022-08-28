package com.company.ThreeMonthPrepKit.WeekOne;

import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        Collections.sort(arr);
        for(Integer i : arr){
            sum += i;
        }
        System.out.println(sum - arr.get(4) + " " + (sum - arr.get(0)));

    }
}
