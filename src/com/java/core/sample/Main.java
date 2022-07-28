package com.java.core.sample;

public class Main {
    int x;
    public Main(int x){
    this.x=x;
        System.out.println("Hello");
    }
    
    public static void main(String[] args) {
        Main m = new Main(15);
        System.out.println(m.x);
        Main m2 = new Main(10);
        System.out.println(m2.x);
    }
}
