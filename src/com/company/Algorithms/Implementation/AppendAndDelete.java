package com.company.Algorithms.Implementation;

public class AppendAndDelete {

//    https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true

    public static String appendAndDelete(String s, String t, int k) {
        if (k >= s.length()+t.length())return "Yes";

        int sameChars = Math.min(s.length(), t.length());

        for (int i = 0; i < Math.min(s.length(),t.length()); i ++){
            if(s.charAt(i) != t.charAt(i)){
                sameChars = i;
                break;
            }
        }
        k -= ((s.length()-sameChars) + (t.length()-sameChars));

        if(k >= 0 && k % 2 == 0) return "Yes";
        return "No";
    }

}

}
