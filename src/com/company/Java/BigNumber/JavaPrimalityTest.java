package com.company.Java.BigNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {



    public static void primalityTest() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger bigInt =new BigInteger(n);
        boolean isPrime = bigInt.isProbablePrime(13);
        String str = isPrime ? "prime " : "not prime";
        System.out.println(str);

        bufferedReader.close();
    }

}
