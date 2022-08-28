package com.java.core.model;

import java.util.Arrays;

public class ArrayConcept {
    public static void main(String[] args) {
        
        int[] a = {1, 2, 3};
        int[] ae = Arrays.copyOf(a, 4);
       //ae[3] = 10;
        System.out.println(a.length);
        System.out.println(ae[3]);
        
        a[0] = 11;
        int[] b = new int[1];
        int[] c = new int[1];
        
        
        a[0] = 11;
        
        int[][] ax = {{1,2,3}, {1,6,5}};
        
        int[][] aa = new int[5][];
        aa[0] = a;
        aa[1] = b;
        aa[2] = c;

        
        
        int[][][] aaa = new int[1][][];
        
        
    }
}