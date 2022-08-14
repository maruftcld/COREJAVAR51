package com.java.core51;


class Parent {}
class Child extends Parent {}


public class CastingExample {   
    public static void main(String[] args) {
        
        Parent p = new Child(); //down casting
        Child c = (Child) new Parent(); // up casting
        
        boolean bool = false; //1bit
        int a = 10; //32bit
        double d = a; //64bit
        
        double dd = 1.56;
        int aa = (int) dd; //explicit type casting - narrowing
        
        int x = 10;
        double y = x; //implicit type casting - widening
        
    }
}

