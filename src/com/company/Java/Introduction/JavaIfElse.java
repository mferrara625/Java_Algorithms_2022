package com.company.Java.Introduction;

import java.util.Scanner;

public class JavaIfElse {

//    https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true

    private static final Scanner scanner = new Scanner(System.in);

    public static void javaIfElse() {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N % 2 != 0 || (N >= 6 && N <= 20))
            System.out.println("Weird");
        else
            System.out.println("Not Weird");
        scanner.close();
    }
}
