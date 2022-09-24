package com.company.ThreeMonthPrepKit.Week1;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-sparse-arrays/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();

        for(String q : queries){
            int count = 0;
            for(String s : strings){
                if(q.equals(s))
                    count++;

            }
            result.add(count);


        }

        return result;

    }
}
