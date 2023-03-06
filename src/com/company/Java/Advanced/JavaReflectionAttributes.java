package com.company.Java.Advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class JavaReflectionAttributes {

//    https://www.hackerrank.com/challenges/java-reflection-attributes/problem?isFullScreen=true

     static class Student{

    }

    public static void javaReflectionAttributes(){
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method m : methods){
            methodList.add(m.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}
