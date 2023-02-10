package com.company.Algorithms.Search;

import java.util.*;

public class MissingNumbers {

//    https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Set<Integer> result = new HashSet<>();
        Map<Integer, Integer> freq = new HashMap<>();
        for (Integer i : arr) {
            if (freq.get(i) == null) {
                freq.put(i, 1);
            } else {
                freq.put(i, freq.get(i) + 1);
            }
        }

        for (Integer i : brr) {
            if (freq.get(i) != null && freq.get(i) > 0) {
                freq.put(i, freq.get(i) - 1);
            } else {
                result.add(i);
            }
        }

        List<Integer> res = new ArrayList<>(result);

        Collections.sort(res);

        return res;

    }
}
