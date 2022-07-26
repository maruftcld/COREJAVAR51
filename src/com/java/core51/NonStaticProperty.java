package com.java.core51;

//static = class.property
//non static+static = object.property
public class NonStaticProperty {
    String course = "JEE";
    static String address = "Dhaka";
    
    public static void main(String[] args) {
        new NonStaticProperty(); //Anonymous Object
        NonStaticProperty ns = new NonStaticProperty();
        System.out.println(ns.course); //non static property access
        System.out.println(ns.address); //static property access
    }
}