package com.java.core.sample;


import java.util.Date;

public class ConsturctorExample {
    //Field variable declaration

    double d, c;//1. Initialization using default value
    Date date = new Date();//2. Initialization using explicit value
    String s; //3. Initialization using constructor

    //no-argument constructor
    public ConsturctorExample() {
    }

    //constructor overloding
    public ConsturctorExample(String s) {
        this.s = s;
    }

    int sum() {
        return 0;
    }

    int sum(int x) {
        return 0;
    }

    public static void main(String[] args) {
        ConsturctorExample obj = new ConsturctorExample();
        obj.sum(2);
    }
}
