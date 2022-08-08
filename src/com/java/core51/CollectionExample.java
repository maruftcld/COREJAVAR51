package com.java.core51;

import java.util.*;


class Desktop{}

public class CollectionExample {
    public static void main(String[] args) {
        Desktop d = new Desktop();
        //System.out.println(d);
        
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add(1.0);
        list.add(d);
        list.add(d);
        list.add(d);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}