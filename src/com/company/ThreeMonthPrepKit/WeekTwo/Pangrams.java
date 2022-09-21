package com.company.ThreeMonthPrepKit.WeekTwo;

import java.util.HashMap;
import java.util.Map;

public class Pangrams {

    public static String pangrams(String s) {

        Map<Character, Integer> freq = new HashMap<>();
        int letters = 0;
        for(Character c : s.toLowerCase().toCharArray()){
            if(freq.get(c) == null && (c <= 122 && c >= 97)){
                freq.put(c, 1);
                letters++;
            }

        }
        if(letters >= 26)
            return "pangram";

        return "not pangram";
    }
}
