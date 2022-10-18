package com.company.Algorithms.Implementation;

import java.util.List;

public class BillDivision {

//    https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int total = 0;
        for(int i = 0; i < bill.size(); i++){
            if(i != k)
                total += bill.get(i);

        }
        total = total/2;
        if(b == total)
            System.out.println("Bon Appetit");
        else
            System.out.println(b - total);

    }
}
