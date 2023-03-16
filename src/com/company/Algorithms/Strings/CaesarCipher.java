package com.company.Algorithms.Strings;

public class CaesarCipher {

//    https://www.hackerrank.com/challenges/caesar-cipher-1/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

    public static String caesarCipher(String s, int k) {

        String result = "";
        while(k > 26)
            k -= 26;
        for(char c : s.toCharArray()){
            char temp = c;
            if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)){
                if((c > 90 - k && c <= 90) || (c > 122 - k && c <= 122)){
                    temp -= 26;
                }
                temp += k;
            }
            result += temp;
        }

        return result;
    }
}
