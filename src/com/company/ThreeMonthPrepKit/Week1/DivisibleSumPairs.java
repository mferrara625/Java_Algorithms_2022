package com.company.ThreeMonthPrepKit.Week1;

import java.util.List;

public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

//        https://www.hackerrank.com/challenges/three-month-preparation-kit-divisible-sum-pairs/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one

        int result = 0;

        for(int i = 0; i < ar.size(); i++){
            for(int j = i + 1; j < ar.size(); j++){
                if((ar.get(i) + ar.get(j)) % k == 0){
                    result++;
                }
            }
        }

        return result;

    }
}
