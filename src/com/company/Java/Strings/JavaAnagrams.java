package com.company.Java.Strings;

public class JavaAnagrams {

//    https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

    static boolean isAnagram(String a, String b) {
        // Complete the function

        if (a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();
        int aVal = 0, bVal = 0;


        for (int i = 0; i < a.length(); i++) {
            aVal += (int)a.charAt(i)*(int)a.charAt(i);
            bVal += (int)b.charAt(i)*(int)b.charAt(i);
        }

        return aVal == bVal;
    }
}
