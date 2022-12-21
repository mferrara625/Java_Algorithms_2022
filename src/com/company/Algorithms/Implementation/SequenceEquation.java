package com.company.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;

public class SequenceEquation {

//    https://www.hackerrank.com/challenges/permutation-equation/problem?isFullScreen=true

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= p.size(); i++) {
            result.add(p.indexOf(p.indexOf(i)+1)+1);
        }
        return result;

    }
}
