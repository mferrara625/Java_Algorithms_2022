package com.company.Java.Strings;

import java.util.Scanner;

public class JavaStringsIntroduction {

//    https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true

    public static void stringIntro() {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length()+B.length());

        if(A.charAt(0) > B.charAt(0))
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println(String.valueOf(A.charAt(0)).toUpperCase() + A.substring(1, A.length()).toLowerCase() + " " + String.valueOf(B.charAt(0)).toUpperCase() + B.substring(1, B.length()).toLowerCase());
    }
}
