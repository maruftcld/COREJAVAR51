package com.java.core51;

public class RecursionExample {
    
    static int status = 0;
    static int p(int a){
       System.out.println(status);
        status++;
        if(status < a){
            return a * p(a-1);
        }else{
            return 0;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(p(5));;
    }
}