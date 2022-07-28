package com.java.core51;

public class StringReference {
    
    static StringReference ref;
    static StringReference ref1;
    
    public static void main(String[] args) {
        ref = new StringReference();
        ref1 = new StringReference();
        //System.out.println(ref);
        //System.out.println(ref1);
        
        //System.out.println(ref == ref1);
        
        String s1 = "OK";
        String ss = "OK";
        String s2 = "OK";
        String s3 = "OK";
        System.out.println(s1 == s3); 
        
        
        // == operator checks the object reference
        // equals() method checks just value
        
        
        
        
    }
}