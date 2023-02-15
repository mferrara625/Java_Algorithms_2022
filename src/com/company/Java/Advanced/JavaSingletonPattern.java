package com.company.Java.Advanced;

public class JavaSingletonPattern {

//    https://www.hackerrank.com/challenges/java-singleton/problem?isFullScreen=true

    static class Singleton{

        private Singleton(){};
        public String str;

        public static Singleton getSingleInstance(){
            return new Singleton();
        }
    }
}
