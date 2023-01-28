package com.company.Java.Advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {

//    https://www.hackerrank.com/challenges/sha-256/problem?isFullScreen=true

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }

        byte[] result = md.digest(input.getBytes());

        for (byte b : result) {
            System.out.format("%02x", b);
        }

    }
}
