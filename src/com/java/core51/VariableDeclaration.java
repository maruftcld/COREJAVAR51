
package com.java.core51;

public class VariableDeclaration {
    
    static int e;
    
    static int x = 15; //global variable
    
    public static void main(String[] args) {
        
        e = 10;
        // variables can be reassigned but can not be declared again
        int a; //local variable
        a = 10;
        int c = a;
        c = a;
        int x = 10; //local variable
        System.out.println(x); // access the local variable
        System.out.println(VariableDeclaration.x); // access the global variable
    }
}
