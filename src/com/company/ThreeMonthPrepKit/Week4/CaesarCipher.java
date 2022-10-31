package com.company.ThreeMonthPrepKit.Week4;

import java.util.ArrayList;
import java.util.List;

public class CaesarCipher {

//    https://www.hackerrank.com/challenges/three-month-preparation-kit-caesar-cipher-1/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-four

    public static String caesarCipher(String s, int k) {
        // Write your code
        //  91-96 123
        String result = "";
        List<Character> holder = new ArrayList<>();
        while(k >= 26)
            k = k - 26;
        for(char c : s.toCharArray()){
            if((c>= 91 && c<= 96) || c>= 123 || c <= 64)
                holder.add(c);
            else if((c + k >= 91 && c + k<= 96) || c + k >= 123 ||((c >= 65 && c <= 90 ) && (c + k) >= 97))
                holder.add((char)( (c - 26) + (char) k));
            else
                holder.add((char)( c + (char) k));
        }
        for(Character t : holder){
            result += t.toString();
        }
        return result;
    }
}
