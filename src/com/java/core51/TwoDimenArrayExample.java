package com.java.core51;

public class TwoDimenArrayExample {
    
    // 2D arrays of array
    // matrix
    public static void main(String[] args) {
        int arr[][] = new int[5][3]; // row-column
        arr[0][0] = 2; 
        arr[0][1] = 3;
        arr[0][2] = 5;
        
        arr[1][0] = 10; 
        arr[1][1] = 20;
        
        arr[2][0] = 50; 
        arr[2][1] = 60;
        arr[2][2] = 80;
        
        System.out.println(arr[1][2]);
        
        int arr1[][] = {{2/*column*/, 3, 5}/*row*/, {10, 20}, {50, 60, 80, 90}};
        System.out.println(arr1.length);   
        System.out.println(arr1[0][2]);
        
        int arr3[][][] = new int[5][3][1]; 
        
        
        
    }
}