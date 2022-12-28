package com.company.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {

//    https://www.hackerrank.com/challenges/cut-the-sticks/problem?isFullScreen=true

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // ->   find min num
        //      remove any that matches min num
        //      minus minNum from remaining nums
        //      add new arr.size to result list ->^
        List<Integer> result = new ArrayList<>();
        result.add(arr.size());
        Collections.sort(arr);

        while (arr.size() > 1) {

            int shortestLength = arr.get(0);

            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == shortestLength) {
                    arr.remove(i);
                    i--;
                } else {
                    arr.set(i, arr.get(i) - shortestLength);
                }

            }
            if (arr.size() > 0)
                result.add(arr.size());
        }

        return result;

    }
}
