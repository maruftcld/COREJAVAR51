package com.java.core51;


abstract class Bike {
    abstract void accelarate();
    abstract void brake();
    void model(){
        System.out.println("model method of bike class");
    };  
}
class Honda extends Bike{
    @Override
    void accelarate() {
    }
    @Override
    void brake() {
    }
}


class Yamaha extends Bike{
    @Override
    void accelarate() {
    }

    @Override
    void brake() {
    }
}

class A{}
class B extends A{}

public class SubclassReturn {
    
    A test3(){
        return new B();
    }
    
    int a;
    int sum(){
        return 0;
    }
    Bike test1(){
        return new Honda();
    }
    Toyota test2(){
        return new Toyota();
    }
    
}