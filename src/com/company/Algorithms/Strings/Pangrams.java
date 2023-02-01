package com.company.Algorithms.Strings;

import java.util.HashMap;
import java.util.Map;

public class Pangrams {

//    https://www.hackerrank.com/challenges/pangrams/problem?isFullScreen=true

    public static String pangrams(String s) {
        Map<Character, Character> freq = new HashMap<>();
        for(Character c : s.toLowerCase().toCharArray()){
            if(c >= 97 && c <= 122)
                if(freq.get(c) == null){
                    freq.put(c, c);
                }
        }

        if(freq.size() == 26)
            return "pangram";

        return "not pangram";

    }
}
