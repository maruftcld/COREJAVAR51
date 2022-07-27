package com.java.core51;

public class WrapperClass {
    
    public static void main(String[] args) {
        int value = 10; // primitive type
        Integer i = new Integer(10); // class type
        
        // instanceof checks if it is an instance/object of the class
        
        Double d = new Double(10.002);
        Float f = new Float(10.002);
        
        int a = 15;
        Integer ii = new Integer(10);
        float ff = ii.floatValue();
        System.out.println(ff);
    }
}