package com.java.core51;

import com.java.core51.test.Car;

public class AccessModifier {
    // public = all package + all class
    // protected = same class + same package
    // Default = same class + same package
    // private = same class
    public int a;
    protected int b;
    int c;
    
    public void speed(){}
    private void speed1(){}
    
    
    public static void main(String[] args) {
        Car c = new Car();
        
    }
}