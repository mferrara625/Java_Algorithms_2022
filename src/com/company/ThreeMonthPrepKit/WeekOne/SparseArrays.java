package com.company.ThreeMonthPrepKit.WeekOne;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {

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
