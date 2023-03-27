package com.company.Algorithms.Implementation;

public class ModifiedKaprekarNumbers {

//    https://www.hackerrank.com/challenges/kaprekar-numbers/problem?isFullScreen=true

    public static void kaprekarNumbers(int p, int q) {
        // Write your code here
        int count = 0;
        for(int i = p; i <= q; i++){
            Long n =(long) i * i;
            int n1 = 0;
            String s = Long.toString(n);
            String s1 = s.substring(0,s.length()/2);
            String s2 = s.substring(s.length()/2);
            if(s.length() > 1){
                n1 = Integer.parseInt(s1);
            }
            int n2 = Integer.parseInt(s2);
            if(i == n1 + n2){
                System.out.print(i+" ");
                count++;
            }

        }
        if(count < 1){
            System.out.println("INVALID RANGE");
        }
    }
}
