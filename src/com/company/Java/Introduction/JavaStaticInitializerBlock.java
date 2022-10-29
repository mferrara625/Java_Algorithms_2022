package com.company.Java.Introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

//    https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true

    public static void javaStaticInitializerBlock() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int B = scan.nextInt();
        int H = scan.nextInt();

        if(B <= 0 || H <= 0)
            System.out.println( "java.lang.Exception: Breadth and height must be positive");
        else {
            System.out.println( B * H );
        }
    }
}
