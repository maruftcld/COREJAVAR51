package com.java.core51;

public class ShortCircuitOperator {
    
    static int a = 10;
    static int b = 5;
    static boolean status = false;
    
    public static void main(String[] args) {
        
        if((a<b) || (status = true)){
            System.out.println("if " + status);
        }else{
            System.out.println("else " + status);
        }
        
        
    }
}