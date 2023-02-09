package com.company.Algorithms.Strings;

import java.util.HashMap;
import java.util.Map;

public class GameOfThronesI {

//    https://www.hackerrank.com/challenges/game-of-thrones/problem?isFullScreen=true

    public static String gameOfThrones(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(Character c : s.toCharArray()){
            if(freq.get(c) == null){
                freq.put(c, 1);
            } else {
                freq.put(c, freq.get(c) + 1);
            }
        }
        if(s.length() % 2 == 0){
            for(int i : freq.values()){
                if(i % 2 != 0){
                    return "NO";
                }
            }
            return "YES";
        }
        boolean hasOdd = false;
        for(int i : freq.values()){
            if(i % 2 != 0){
                if(!hasOdd)
                    hasOdd = true;
                else
                    return "NO";
            }
        }
        return "YES";
    }
}
