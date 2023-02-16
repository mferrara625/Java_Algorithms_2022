package com.company.Java.Advanced;

public class CanYouAccess {

//    https://www.hackerrank.com/challenges/can-you-access/problem?isFullScreen=true

    Inner inner = new Inner();
    o = inner.new Private();
    Inner.Private innerPrivate = (Inner.Private) o;
    String response = innerPrivate.powerof2(num);
    System.out.println(num + " is " + response);
}
