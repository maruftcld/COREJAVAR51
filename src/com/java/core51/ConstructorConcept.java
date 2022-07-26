package com.java.core51;

public class ConstructorConcept {

    int round = 51;
    
    //constructor overloading
    //number of parameters and data type
    public ConstructorConcept() { //non argumented default constructor
        System.out.println("constructor");
    }
    
    public ConstructorConcept(int a) { //argumented constructor
    }
    
    public ConstructorConcept(int a, int b) { //argumented constructor
    }
    
    public ConstructorConcept(int a, String b) { //argumented constructor
    }
   

    public static void main(String[] args) {
          ConstructorConcept cs = new ConstructorConcept();
    }
    
}