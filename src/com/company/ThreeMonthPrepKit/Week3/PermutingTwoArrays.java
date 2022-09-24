package com.company.ThreeMonthPrepKit.Week3;

import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-two-arrays/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-three

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {

        Collections.sort(A);
        Collections.sort(B);
        Collections.reverse(B);
        System.out.println(A + " ++++\n" + B);
        for(int i = 0 ; i < A.size(); i++){
            if(A.get(i) + B.get(i) < k)
                return "NO";
        }
        return "YES";
    }
}
