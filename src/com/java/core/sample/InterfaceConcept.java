package com.java.core.sample;

public class InterfaceConcept {
     int a;
     static int b;
     void abc(){
         
     }
}
interface ICommon {
     static final int COUNT = 5;
     int delete();
     void update();
     void create();
     void getAll();
     default void test(){
     };
}

class Category implements ICommon { // implement class of ICommon
    
    public static void main(String[] args) {
        System.out.println(COUNT);
    }

    @Override
    public int delete() {
        return 0;
    }

    @Override
    public void update() {
        
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}