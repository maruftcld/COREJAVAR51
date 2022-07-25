package com.java.core51;

public class StaticKeyword {
    
    int x; //non static member
    static int y; //static member
    
    void xx(){};
    static void yy(){};
    
    // static members && not static members
    // non-static content = static + non-static members
    // static content = static members
    public static void main(String[] args) { 
        y = 10;
        yy();
    }
    
    int sum(){
        x = 10;
        y = 10;
        xx();
        yy();
        return 0;
    }
}