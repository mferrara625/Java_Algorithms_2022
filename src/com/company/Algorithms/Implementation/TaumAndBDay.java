package com.company.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaumAndBDay {

//    https://www.hackerrank.com/challenges/taum-and-bday/problem?isFullScreen=true

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        List<Long> costList = new ArrayList<>();
        costList.add(((long) b * bc) + ((long) w * wc));
        costList.add(((long) b * (wc + z)) + ((long) w * wc));
        costList.add(((long) b * bc) + ((long) w * (bc + z)));
        costList.add(((long) b * (wc + z)) + ((long) w * (bc + z)));


        return Collections.min(costList);

    }
}
