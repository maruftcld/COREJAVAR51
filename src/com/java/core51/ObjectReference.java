package com.java.core51;


class Trainee {
    String name;
    int round;
    double salary;
}

public class ObjectReference {

    static Trainee t;
    public static void main(String[] args) {
        int a = 10;
        Trainee t1 = new Trainee();
        Trainee t2 = new Trainee();
        Trainee t3 = new Trainee();
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        
        System.out.println(t);
        
        t = new Trainee();
        System.out.println(t);
        
        
    }
}