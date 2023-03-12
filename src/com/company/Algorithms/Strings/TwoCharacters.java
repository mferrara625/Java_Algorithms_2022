package com.company.Algorithms.Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoCharacters {

//    https://www.hackerrank.com/challenges/two-characters/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

    public static int alternate(String s) {
        int result = 0;
        int temp;
        Set<Character> charSet = new HashSet<>();
        for(char c : s.toCharArray()){
            charSet.add(c);
        }
        List<Character> charList = new ArrayList<>(charSet);
        for(int i = 0; i < charList.size() - 1; i++){
            for(int j = i + 1; j < charList.size(); j++){
                char first = charList.get(i);
                char second = charList.get(j);
                for(int l = 0; l < 2; l++){
                    boolean isFirst = true;
                    temp = 0;
                    for(int k = 0; k < s.length(); k++){
                        if(s.charAt(k) == first){
                            if(isFirst){
                                temp = 0;
                                break;
                            } else {
                                temp++;
                                isFirst = true;
                            }
                        } else if (s.charAt(k) == second){
                            if(isFirst){
                                temp++;
                                isFirst = false;
                            } else {
                                temp = 0;
                                break;
                            }
                        }
                    }
                    if(temp > result){
                        result = temp;
                    }
                    first = charList.get(j);
                    second = charList.get(i);
                }
            }

        }
        return result;

    }

}
