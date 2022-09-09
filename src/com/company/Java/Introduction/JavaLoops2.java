package com.company.Java.Introduction;

import java.util.Scanner;

public class JavaLoops2 {

    public static void javaLoops2(){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            StringBuilder stringBuilder = new StringBuilder();
            int result = a;
            for(int j =0; j < n; j++){
                result += (int)Math.pow(2,(j)) * b;
                stringBuilder.append(result).append(" ");
            }
            System.out.println(stringBuilder);
        }
        in.close();
    }
}
