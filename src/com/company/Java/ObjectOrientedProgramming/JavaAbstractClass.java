package com.company.Java.ObjectOrientedProgramming;

public class JavaAbstractClass {

//    https://www.hackerrank.com/challenges/java-abstract-class/problem

    abstract class Book{
        String title;
        abstract void setTitle(String s);
        String getTitle(){
            return title;
        }

    }
    class MyBook extends Book{
        String title;
        void setTitle(String s){
            title = s;
        }
        String getTitle(){
            return title;
        }
    }
}
