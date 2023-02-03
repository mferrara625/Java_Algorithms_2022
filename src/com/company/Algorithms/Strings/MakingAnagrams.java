package com.company.Algorithms.Strings;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {

//    https://www.hackerrank.com/challenges/making-anagrams/problem?isFullScreen=true

    public static int makingAnagrams(String s1, String s2) {
        int result = s1.length() + s2.length();
        Map<Character, Integer> freqS1 = new HashMap<>();
        Map<Character, Integer> freqS2 = new HashMap<>();


        for(Character c : s1.toCharArray()){
            if(freqS1.get(c) == null){
                freqS1.put(c, 1);
            } else {
                freqS1.put(c, freqS1.get(c) + 1);
            }
        }

        for(Character c : s2.toCharArray()){
            if(freqS2.get(c) == null){
                freqS2.put(c, 1);
            } else {
                freqS2.put(c, freqS2.get(c) + 1);
            }
        }

        for(Character c : freqS1.keySet()){
            if(freqS2.get(c) == null){
                result-=freqS1.get(c);
            } else {
                result -= Math.abs(freqS1.get(c) - freqS2.get(c));
            }
        }

        for(Character c : freqS2.keySet()){
            if(freqS1.get(c) == null){
                result-=freqS2.get(c);
            }
        }

        return (s1.length() + s2.length()) - result;

    }
}
