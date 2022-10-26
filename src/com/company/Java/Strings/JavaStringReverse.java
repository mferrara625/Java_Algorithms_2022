package com.company.Java.Strings;

import java.util.Scanner;

public class JavaStringReverse {

//    https://www.hackerrank.com/challenges/java-string-reverse/problem

    public static void javaStringReverse() {
        String result = "Yes";
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        for(int i = 0; i < A.length()/2; i++){
            if(A.charAt(i) != A.charAt(A.length() - 1 - i)){
                result = "No";
                break;
            }

        }
        System.out.println(result);

    }
}
