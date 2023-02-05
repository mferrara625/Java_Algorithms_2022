package com.company.Algorithms.Strings;

public class BeautifulBinaryString {

//    https://www.hackerrank.com/challenges/beautiful-binary-string/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

    public static int beautifulBinaryString(String b) {
        int result = 0;
        for(int i = 0; i < b.length() - 2; i++){
            if(b.charAt(i) == '0' && b.charAt(i + 1) == '1' && b.charAt(i + 2)  == '0'){
                result++;
                i+=2;
            }
        }

        return result;

    }
}
