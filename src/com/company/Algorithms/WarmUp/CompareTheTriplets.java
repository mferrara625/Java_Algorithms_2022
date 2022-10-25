package com.company.Algorithms.WarmUp;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

//    https://www.hackerrank.com/challenges/compare-the-triplets/problem

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> result = new ArrayList();
        int aliceScore = 0;
        int bobScore = 0;
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)){
                aliceScore++;
            } else if (b.get(i) > a.get(i)){
                bobScore++;
            }
        }
        result.add(aliceScore);
        result.add(bobScore);


        return result;

    }
}
