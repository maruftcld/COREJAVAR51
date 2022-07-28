package com.java.core.sample;


public class StringPoolExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        
        String s3 = new String("Hello");
        String s4 = new String("Hello");
         
        System.out.println("s1 == s2 :"+(s1==s2)+ " equality= "+ s1.equals(s3));//true
        System.out.println("s1 == s3 :"+(s1==s3));//false
        System.out.println("s3 == s4 :"+(s3==s4));//false
    }
}
