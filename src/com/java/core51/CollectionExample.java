package com.java.core51;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {

        List list = new ArrayList();
        
        list.add(1);
        list.add(2.3);
        list.add(3.3);

        
        for (int i = 0; i < list.size(); i++) {
            Integer a = (Integer) list.get(i);
            System.out.println(a);
        }

    }
}