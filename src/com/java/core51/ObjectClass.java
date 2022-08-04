package com.java.core51;

class Hello {
    static void abc(){
        System.out.println("hello");
    }
}

public class ObjectClass extends Hello{
    public static void main(String[] args) {
        abc();
        Hello.abc();
        ObjectClass.abc();
        
        ObjectClass oc = new ObjectClass();
        oc.abc();
        
    }
}