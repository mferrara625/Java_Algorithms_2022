package com.company.Java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

//    https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true

    public static void javaList() {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            source.add(in.nextInt());
        }

        int queries = in.nextInt();
        for (int l = 0; l < queries; l++) {
            String query = in.next();

            switch (query) {
                case "Insert" -> {
                    int index = in.nextInt();
                    int value = in.nextInt();
                    source.add(index, value);
                }
                case "Delete" -> source.remove(in.nextInt());
            }
        }

        for (Integer i : source) {
            System.out.print(i + " ");
        }

        in.close();
    }
}
