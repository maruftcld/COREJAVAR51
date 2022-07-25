
package com.java.core51;

public class MethodDeclaration {
    
    boolean abc(){
        int a = 0;
        return true;
    }
    
    static int sum(int x, int y){
        int z = x + y;
        return z;
    }
    
    void method1(){
         
    }
    
    public static void main(String[] args) {
        sum(10 , 15);
        int x = sum(10 , 15);
        System.out.println(x);
        System.err.println(sum(10 , 15));
    }
}
