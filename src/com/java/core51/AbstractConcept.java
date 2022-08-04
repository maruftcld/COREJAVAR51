package com.java.core51;

// hides relevant/unnecessary information and only shows the relevant and necessary details and attributes
public abstract class AbstractConcept {
       abstract void sum();
       void multiply(){};
}


abstract class Car {

    public Car() {
        
        System.out.println("super class car");
    }
    public Car(int a) {
    }
     
    static int a;
    
    abstract void accelarate();
    abstract void brake();
    void model(){
        System.out.println("model method of car class");
    };
}

class Tesla extends Car{
    @Override
    void accelarate() {
        System.out.println("accelarate tesla");
    }

    @Override
    void brake() {
    }
    
    void model(){
     System.out.println("model method of tesla class");
    }
}

class Toyota extends Car{
    
    @Override
    void accelarate() {
        System.out.println("accelarate toyota");
    }

    @Override
    void brake() {
    }
    
    void model(){
     System.out.println("model method of toyota class");
    }
    
}

class Test {   
    static Car c;
    public static void main(String[] args) {
        
        c = new Tesla();
        c.model();
        
        c = new Toyota();
        c.model();
    }
}