package com.java.core51;

import java.util.Scanner;


class Vehicle1 {
    int speed;
    double regularPrice = 5000;
    String color; 
    double getSalePrice(){
        return 0.0;
    }
}

class Truck extends Vehicle1{
    int weight; 
    public Truck(int weight) {
        this.weight = weight;
    }
      
    @Override
    double getSalePrice(){
        regularPrice = 5000;
        if(weight > 2000){
            regularPrice = regularPrice - (regularPrice * .1); 
        }
        return regularPrice;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tempWeight = s.nextInt();
        Truck t = new Truck(tempWeight);
        System.out.println(t.getSalePrice());
    }
}



public class InheritanceExample {
    
}