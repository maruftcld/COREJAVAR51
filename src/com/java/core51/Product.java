package com.java.core51;

public class Product {
    String code;
    String name;
    int qty;
    double price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
           
}

class TestProduct {
        Product p;
        void test(){
            p = new Product();
            p.code = "102";
        }

}


class TestProduct1 {

    int a;
    int b;
    
    public TestProduct1() {
    }

    public TestProduct1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
       TestProduct1 tp1 = new TestProduct1(10, 15);
       tp1.setA(10);
    }

}

