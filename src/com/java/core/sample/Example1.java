package com.java.core.sample;


public class Example1 {

    int data = 50;
//primitive types are pass by value
    void change(int data) {
        data = data + 100;//change will be in the local variavle
        System.out.println("Data in method: " + data);
        return;
    }
//objects are pass by reference

    void changeByObj(Example1 e) {
        e.data = 200;
    }

    public static void main(String[] args) {
        Example1 ex = new Example1();
        System.out.println("Before change: " + ex.data);
        int x=55;
        ex.change(x);
        System.out.println("After change by pass by value: " + ex.data);
        ex.changeByObj(ex);
        System.out.println("After change by pass by reference: " + ex.data);
    }
}
