package com.company.Algorithms.Implementation;

import java.util.HashMap;
import java.util.Map;

public class HappyLadybugs {

//    https://www.hackerrank.com/challenges/happy-ladybugs/problem?isFullScreen=true

    public static String happyLadybugs(String b) {

        boolean hasEmptySpace = false;
        boolean matchStreak = true;

        Map<Character, Integer> freq = new HashMap<>();

        for(int i = 1; i < b.length() - 1; i++){
            if(b.charAt(i) == b.charAt(i - 1) || (b.charAt(i) == b.charAt(i + 1))){
                continue;
            } else {
                matchStreak = false;
            }
        }
        for(Character c : b.toCharArray()){
            if(c == '_'){
                hasEmptySpace = true;
            }
            else{
                if(freq.get(c) == null){
                    freq.put(c, 1);
                }
                else{
                    freq.put(c, freq.get(c) + 1);
                }
            }
        }
        for(Integer i : freq.values()){
            if( i == 1)
                return "NO";
        }

        if(hasEmptySpace || freq.size() == 1 || matchStreak)
            return "YES";

        return "NO";

    }
}
