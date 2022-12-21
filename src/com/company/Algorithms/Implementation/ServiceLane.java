package com.company.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;

public class ServiceLane {

//    https://www.hackerrank.com/challenges/service-lane/problem?isFullScreen=true

    public static List<Integer> serviceLane(int n, List<List<Integer>> cases, List<Integer> width) {
        // Write your code here
        List<Integer> list = new ArrayList<>();

        for (List<Integer> aCase : cases) {
            int min = width.get(aCase.get(0));

            for (int j = aCase.get(0); j <= aCase.get(1); j++)
                if (width.get(j) < min)
                    min = width.get(j);

            list.add(min);
        }
        return list;
    }
}
