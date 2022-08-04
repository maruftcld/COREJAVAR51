package com.java.core51;

import java.util.ArrayList;
import java.util.List;


class Dog{}
class Hen{}
class Cow{}

public class CollectionExample {
    public static void main(String[] args) {
        Hen h = new Hen();
        List l = new ArrayList();
        l.add(1);
        l.add(new Dog());
        l.add(new Cow());
        l.add(h);
        
        System.out.println(l.get(1));
    }
}