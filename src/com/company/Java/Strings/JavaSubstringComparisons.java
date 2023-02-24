package com.company.Java.Strings;

public class JavaSubstringComparisons {

//    https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";

        for (int i=0; i < s.length() - k + 1; i++){
            String substring = s.substring(i, i+k);
            if (substring.compareTo(largest) > 0)
                largest = substring;
            if (substring.compareTo(smallest) < 0)
                smallest = substring;
        }

        return smallest + "\n" + largest;
    }
}
