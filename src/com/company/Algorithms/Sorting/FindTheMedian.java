package com.company.Algorithms.Sorting;

import java.util.Collections;
import java.util.List;

public class FindTheMedian {

//    https://www.hackerrank.com/challenges/find-the-median/problem?isFullScreen=true

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size()/2);
    }
}
