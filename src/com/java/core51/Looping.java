package com.java.core51;

public class Looping {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
           // System.out.println("Hello " + i);
        }
        int y = 0;
        while (true) {            
            System.out.println("Hello " + y);
            y++;
            if(y==5){
                break;
            }
        }
        
        do{
            System.out.println("executing");
        }while(false);
        
       
        
    }
}