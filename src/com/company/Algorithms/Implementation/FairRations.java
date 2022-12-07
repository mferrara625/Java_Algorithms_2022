package com.company.Algorithms.Implementation;

import java.util.List;

public class FairRations {

//    https://www.hackerrank.com/challenges/fair-rations/problem?isFullScreen=true

    public static String fairRations(List<Integer> B) {

        int count = 0;

        for(int i = 0; i < B.size() - 1; i++){
            if(B.get(i) % 2 != 0){
                if(i > 0 && B.get(i - 1) % 2 != 0){
                    B.set((i - 1), B.get(i - 1) + 1);
                } else {
                    B.set((i + 1), B.get(i + 1) + 1);                               }
                B.set((i), B.get(i) + 1);
                count+=2;
            }
        }
        for(Integer i : B){
            if(i % 2 != 0)
                return "NO";
        }

        return count + "";
    }
}
