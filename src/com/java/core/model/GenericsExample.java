package com.java.core.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class GenericsExample {  
    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
        l.add(1);
        l.add(1);
        l.add(1);

        for (Object item : l) {
            System.out.println((Integer) item);
        } 
    }
}