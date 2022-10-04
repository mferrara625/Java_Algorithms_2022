package com.company.Java.DataStructures;

public class JavaGenerics {

//    https://www.hackerrank.com/challenges/java-generics/problem?isFullScreen=true

    class Printer
    {
        //Write your code here
        void printArray(Object[] array){
            for(Object o : array){
                System.out.println(o);
            }
        }
    }
}
