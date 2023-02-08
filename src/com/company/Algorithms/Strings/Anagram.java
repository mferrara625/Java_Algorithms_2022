package com.company.Algorithms.Strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

//    https://www.hackerrank.com/challenges/anagram/problem?isFullScreen=true

    public static int anagram(String s) {

        if(s.length() % 2 != 0){
            return -1;
        }
        int result = 0;

        Map<Character, Integer> freq = new HashMap<>();


        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring(s.length()/2);


        for(Character c : s1.toCharArray()){
            if(freq.get(c) == null){
                freq.put(c, 1);
            }
            else{
                freq.put(c, freq.get(c) + 1);
            }
        }
        for(Character c : s2.toCharArray()){
            if(freq.get(c) == null){
                result++;
            } else {
                freq.put(c, freq.get(c) - 1);
            }
        }
        int pos = 0;
        int neg  = 0;
        for(Integer i : freq.values()){
            if(i >= 0){
                pos += i;
            }
            else{
                neg+=Math.abs(i);
            }

        }

        result += Math.min(pos, neg);

        return result;
    }
}
