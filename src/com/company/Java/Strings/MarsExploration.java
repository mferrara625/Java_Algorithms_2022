package com.company.Java.Strings;

public class MarsExploration {

//    https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true

    public static int marsExploration(String s) {
        // Write your code here
        int result = 0;
        for(int i = 0; i < s.length(); i+=3){
            for(int j = 0; j < 3; j++){
                if(j % 2 == 0 && s.charAt(i + j) != 'S'){
                    result++;
                }
                if(j % 2 != 0 && s.charAt(j + i) != 'O'){
                    result++;
                }
            }
        }
        return result;

    }
}
