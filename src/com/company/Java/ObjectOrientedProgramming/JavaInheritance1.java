package com.company.Java.ObjectOrientedProgramming;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class JavaInheritance1 {

//    https://www.hackerrank.com/challenges/java-inheritance-1/problem

    class Animal{
        void walk()
        {
            System.out.println("I am walking");
        }
    }
    class Bird extends Animal
    {
        void fly()
        {
            System.out.println("I am flying");
        }
        void sing() {
            System.out.println("I am singing");
        }
    }


        public void javaInheritance1(){

            Bird bird = new Bird();
            bird.walk();
            bird.fly();
            bird.sing();

        }
}
