package com.company.Algorithms.Implementation;

import java.util.*;

public class ManasaAndStones {

//    https://www.hackerrank.com/challenges/manasa-and-stones/problem?isFullScreen=true

    public static List<Integer> stones(int n, int a, int b) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
            set.add(a*i+b*(n-i-1));
        List<Integer> res = new ArrayList<>(set);
        Collections.sort(res);
        return res;

    }
}
