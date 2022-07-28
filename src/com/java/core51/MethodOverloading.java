package com.java.core51;

public class MethodOverloading {
        
    void x(String a){};
    int x(int a, String b){return 0;};
    int x(int a, int b){return 0;}
    void x(String a, int b){};
    
    
    int method(){
        String s = "";
        return new Integer(10);
    }
    
}