package com.company.Java.DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

//    https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

    public static void javaMap()
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, Integer> phoneMap = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            phoneMap.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (phoneMap.containsKey(s)) {
                System.out.println(s + "=" + phoneMap.get(s));
            } else {
                System.out.println("Not found");
            }
        }

    }
}
