package com.java.core51;

import java.util.Date;

public class StringVsBufferVsBuilder {
    public static void main(String[] args) {
        
        long starts = System.currentTimeMillis();
        String ss = "Hello ";
        for (int i = 0; i < 100000; i++) {
            ss.concat("World");
        }
        long ends = System.currentTimeMillis();
        System.out.println("String Ref : " + (ends - starts));
        
        long start = System.currentTimeMillis();
        String s = new String("Hello ");
        for (int i = 0; i < 100000; i++) {
            s.concat("World");
        }
        long end = System.currentTimeMillis();
        System.out.println("String Object: " + (end - start));

        long start1 = System.currentTimeMillis();
        StringBuffer sbfr = new StringBuffer("Hello "); // thread-safe
        for (int i = 0; i < 100000; i++) {
            sbfr.append("World");
        }
        long end1 = System.currentTimeMillis();
        System.out.println("StringBuffer : " + (end1 - start1));
        

        long start2 = System.currentTimeMillis(); // NOT thread-safe
        StringBuilder sbldr = new  StringBuilder("Hello ");
        for (int i = 0; i < 100000; i++) {
            sbldr.append("World");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder : " + (end2 - start2));
    }
}