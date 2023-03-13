package com.company.Algorithms.Implementation;

import java.math.BigInteger;

public class ExtraLongFactorials {

//    https://www.hackerrank.com/challenges/extra-long-factorials/problem?isFullScreen=true

    public static void extraLongFactorials(int n) {
        BigInteger bigInt = new BigInteger("1");
        for (int i = 1; i <= n; i++){
            bigInt = bigInt.multiply(new BigInteger(Integer.toString(i)));
        }
        System.out.println(bigInt);
    }
}
