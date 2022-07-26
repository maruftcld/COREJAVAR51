package com.java.core51;

public class StringExample {
    //primitive
    //object = default value null
    static String name = "A";
    String address = "Dhaka";
    
    public static void main(String[] args) {
        String name = "B";
        //System.out.println(StringExample.name);
        
        
        String firstName = "Mr. ";
        String lastName = "A";
        String fullName = firstName + lastName;
        String fName = firstName.concat(lastName);
        //System.out.println(firstName + lastName);
        
        
        String str = "Hello";
        //System.out.println(str.length());
        
        
        String s1 = "ABC";
        String s2 = "ABC";
        
        //System.out.println(s1 == s2); // equality operator
        //System.out.println(s1.equals(s2)); // equals method
        
        //string pool
        String ss1 = "ABC";
        String ss2 = new String("ABC");
        System.out.println(ss1 == ss2);
        System.out.println(ss1.equals(ss2));
        
        
        
        
    }
}