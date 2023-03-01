package com.company.Java.DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

//    https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true

    public static void javaStack() {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String input = scan.next();
            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                if (!stack.isEmpty()) {
                    switch (c) {
                        case ')':
                            if (stack.peek() == '(') {
                                stack.pop();

                            }
                            break;
                        case '}':
                            if (stack.peek() == '{') {
                                stack.pop();

                            }
                            break;
                        case ']':
                            if (stack.peek() == '[') {
                                stack.pop();

                            }
                            break;
                        default:
                            stack.push(c);

                    }

                } else {
                    stack.push(c);
                }
            }

            System.out.println(stack.isEmpty());

        }
        scan.close();
    }
}
