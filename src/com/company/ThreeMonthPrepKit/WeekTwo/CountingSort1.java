package com.company.ThreeMonthPrepKit.WeekTwo;

import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> freq = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            freq.add(0);
        }
        for(Integer i : arr){
            freq.set(i, freq.get(i) + 1);
        }
        return freq;
    }

}
