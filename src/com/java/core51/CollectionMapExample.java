package com.java.core51;

import java.util.HashMap;
import java.util.Map;

public class CollectionMapExample {
    public static void main(String[] args) {
        
       Map<String, Object> map = new HashMap<String, Object>();
       map.put("emp1", "Mr. A");
       map.put("emp2", "Mr. B");
       map.put("emp3", "Mr. C");
        System.out.println(map.get("emp2"));
       
    }
}