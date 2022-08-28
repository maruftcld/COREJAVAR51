package com.java.core.model;

public class PolymorphismExample {
    
    void add(){
        int a;
    };
    void add(String s){};
    void add(int i){};

}


class Food {
    String name;
    String color;
    double price;

    public Food() {
    }

    
    public Food(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
    
    
}
class TestFood{
    public static void main(String[] args) {
        Food f = new Food();
        f.name = "Burger";
        f.color = "yellow";
        f.price = 10.00;
        
        Food f4 = new Food("Pizza", "Yellow", 20);

        Food f1 = new Food();
        f1.name = "Pizza";
        f1.color = "yellow";
        f1.price = 10.00;
        
        Food f2 = new Food();
        f2.name = "Pizza2";
        f2.color = "yellow";
        f2.price = 10.00;
        
        
    }
}