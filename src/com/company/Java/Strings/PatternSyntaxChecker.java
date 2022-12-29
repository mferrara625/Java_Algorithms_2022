package com.company.Java.Strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {

//    https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numOfTestCases = Integer.parseInt(in.nextLine());
        while(numOfTestCases>0){
            String pattern = in.nextLine();
            try{
                Pattern compiled = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e){
                System.out.println("Invalid");
            } finally {
                numOfTestCases--;
            }
        }
        in.close();
    }
}
