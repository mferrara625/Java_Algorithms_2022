package com.company.Java.Introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoops1 {

    public static void javaLoops1() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1; i <= 10; i++){
            System.out.println(N + " x " + i + " = " +(N * i));
        }
        bufferedReader.close();
    }
}
