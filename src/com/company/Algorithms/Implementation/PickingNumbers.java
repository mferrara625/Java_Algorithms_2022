package com.company.Algorithms.Implementation;

import java.util.Collections;
import java.util.List;

public class PickingNumbers {

//    https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int currentLowest = a.get(0);
        int temp = 1;
        int longest = 0;
        for (int i = 1; i < a.size(); i++) {
            if (Math.abs(a.get(i) - currentLowest) <= 1)
                temp++;
            else {
                if (temp > longest)
                    longest = temp;
                temp = 1;
                currentLowest = a.get(i);
            }
        }
        if (temp > longest)
            longest = temp;

        return longest;
    }
}
