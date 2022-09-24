package com.company.ThreeMonthPrepKit.Week2;

import java.util.HashMap;
import java.util.Map;

public class Pangrams {

    public static String pangrams(String s) {

//        https://www.hackerrank.com/challenges/three-month-preparation-kit-pangrams/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-two

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
