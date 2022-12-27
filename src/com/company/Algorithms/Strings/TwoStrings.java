package com.company.Algorithms.Strings;

public class TwoStrings {

//    https://www.hackerrank.com/challenges/two-strings/problem?isFullScreen=true

    public static boolean isFirst = true;

    public static String twoStrings(String s1, String s2) {

        int smallStr = Math.min(s1.length(), s2.length());
        for(int i = 0; i < smallStr; i+= Math.max( 1, (smallStr / 2) / 2)){
            for(int j = i; j <  Math.min( smallStr, i + ((smallStr / 2) / 2)); j++){
                if(s1.charAt(i) == s2.charAt(j) || s2.charAt(i) == s1.charAt(j))
                    return "YES";
            }
        }
        if(isFirst){
            isFirst = false;
            String s3 = new StringBuilder(s1).reverse().toString();
            String s4 = new StringBuilder(s2).reverse().toString();

            return twoStrings(s3, s4);
        }

        isFirst = true;

        return "NO";

    }

}

