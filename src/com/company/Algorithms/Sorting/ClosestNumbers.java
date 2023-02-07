package com.company.Algorithms.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {

//    https://www.hackerrank.com/challenges/closest-numbers/problem?isFullScreen=true

    public static List<Integer> closestNumbers(List<Integer> arr) {
        int diff = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        List<Integer> res = new ArrayList<>();
        Collections.sort(arr);

        for(int i = 0; i < arr.size() - 1; i++){
            diff = arr.get(i + 1) - arr.get(i);

            if(diff == minDiff){
                res.add(arr.get(i));
                res.add(arr.get(i + 1));
            }
            else if(diff < minDiff){
                res.clear();
                minDiff = diff;
                res.add(arr.get(i));
                res.add(arr.get(i + 1));
            }
        }

        return res;
    }
}
