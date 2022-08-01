package com.java.core.sample;

//inheritance

// Class to Class
// Class to interface
// interface to interface

class Parent {
    int parentA = 10;
    
    int r;

    public Parent(String s) {
        System.out.println("parent constructor called");
    }
    
    void testParent(){
        System.out.println();
    }
}

class parentB{
    int r;
}




class ChildA extends Parent {
    int childA;
    public ChildA() {
        super("");
        System.out.println("child A constructor called" + r);
    }
    
    void testA(){  ///////////////////////-----------------------
        System.out.println("child A method called");
    }
}


public class InheritanceExample {
    public static void main(String[] args) {
        ChildA chA = new ChildA();
        chA.testA();
    }
}


interface M1 {
    int a = 10;
}
interface M2 extends M1 {
    int b = 11;
}
interface M3 extends M2 {
    int c = 12;
}

class T {
    int d = 13;
}

class $M extends T implements M3{
    public static void main(String[] args) {
        System.out.println(c);
    }
}
