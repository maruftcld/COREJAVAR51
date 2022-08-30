package com.java.core.model;

public class ExceptionPropagationExample {
    
    
    static void aa(){
        System.out.println(1/0);
    }
    static void bb(){
        try {
            aa();
        } catch (Exception e) {
        }
    }
    static void cc(){
        try {
            bb();
        } catch (Exception e) {
        }
    }
    static void dd(){
        try {
             cc();
        } catch (Exception e) {
        }
    }
    

    public static void main(String[] args){
        try {
            dd();
        } catch (Exception e) {
        }
    }
}