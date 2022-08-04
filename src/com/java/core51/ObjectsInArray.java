package com.java.core51;



class Vehicle {}
class Fruit {}
class Laptop {}

public class ObjectsInArray {
    
    static Vehicle v;
    public static void main(String[] args) { 
        Vehicle[] objArr = new Vehicle[3];
        objArr[0] = new Vehicle();
        objArr[1] = new Vehicle();
        //objArr[2] = new Fruit();
        
        Object[] obj = new Object[3];
        obj[0] = new Vehicle();
        obj[1] = new Fruit();
        obj[2] = new Laptop();
        
        System.out.println(obj[2]);
        
    }
}