package com.company.Java.Advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;


public class JavaMD5 {

//    https://www.hackerrank.com/challenges/java-md5/problem?isFullScreen=true

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(s.getBytes());
        byte[] digest = md.digest();
        String result = DatatypeConverter.printHexBinary(digest).toLowerCase();

        System.out.println(result);
    }
}
