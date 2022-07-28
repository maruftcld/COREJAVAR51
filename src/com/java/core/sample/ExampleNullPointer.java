package com.java.core.sample;


public class ExampleNullPointer { //NullPointerException
    static ExampleNullPointer enl;
    static String s;

    public static void main(String[]  args) {
        System.out.println(s);
        System.out.println(enl.toString());
    }
}
