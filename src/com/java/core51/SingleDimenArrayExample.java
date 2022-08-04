package com.java.core51;

// 1. declaration

import java.lang.reflect.Array;
import java.util.Arrays;

// 2. instantiation
// 3. initialization
public class SingleDimenArrayExample {
    int a; //primitive type
    String s; //class type
    // primitive + class
//    primitive type
    // array declaration way-1;
    static int arr1[]; //.............
    // array declaration way-2;
    int[] arr2;
//    class type 
    // array declaration way-1;
    static String arrS1[];
    // array declaration way-2;
    int[] arrS2;
    
    static int arrX[];
    static int su[];
    public static void main(String[] args) {
        // array instantiation
        arr1 = new int[2];
        arrS1 = new String[2];
        // array initialization
        arr1[0] = 10; arr1[1] = 15;
        arrS1[0] = "Hello"; arrS1[1] = "World";
         int myArr[] = {10, 20, 30, 40};
         String aa[] = new String[3];
         aa[2] = "Java";
        //System.out.println(myArr[2]);
        // access the values of an array
        for (int i = 0; i < myArr.length; i++) {
           // System.out.println(i + " :: " + myArr[i]);
        }
         //aa[4] = "";
        
        arrX = new int[2];
        System.out.println(arrX.length);
        arrX[1] = 11;
        arrX = new int[3];
        System.out.println(arrX[1]);
        int st[] = new int[2];
        //st[] = new int[3];
        int su[] = {50, 60};
        
        SingleDimenArrayExample ae = new SingleDimenArrayExample();
       
     }
}