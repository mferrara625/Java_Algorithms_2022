package com.company.Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;


public class JavaBigInteger {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        BigInteger a = scan.nextBigInteger();

        BigInteger b = scan.nextBigInteger();

        BigInteger c = a.add(b);

        System.out.println(c);

        BigInteger d = a.multiply(b);

        System.out.println(d);


    }
}
