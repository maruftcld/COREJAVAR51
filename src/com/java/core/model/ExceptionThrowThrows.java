package com.java.core.model;

public class ExceptionThrowThrows {
    
    static void test() {
        //System.out.println(1/0);
        throw new ArithmeticException();
    }
    
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println("catch");
        }
    }
   
}