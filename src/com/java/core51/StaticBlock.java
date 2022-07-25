
package com.java.core51;

public class StaticBlock {

    static {
        System.err.println("staic block 2");
    }
    
    static {
        System.err.println("staic block 1");
    }
    
    public static void main(String[] args) {
        System.out.println("main method execute");
    }
}