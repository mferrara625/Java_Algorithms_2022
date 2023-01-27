package com.company.Algorithms.Strings;

import java.util.Stack;

public class SuperReducedString {

//    https://www.hackerrank.com/challenges/reduced-string/problem?isFullScreen=true
    public static String superReducedString(String s) {

        Stack<Character> stack = new Stack<>();

        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            System.out.println(stack);
            if (stack.size() > 0 && s.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.size() == 0) {
            return "Empty String";
        }
        String result = "";
        for (Character c : stack) {
            result += c;
        }
        return result;

    }
}
