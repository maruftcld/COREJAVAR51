package com.java.core51;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int i = Integer.parseInt(str);
        double d = Double.valueOf(str);
        int output = i * 3;
        System.err.println(output);
    }
}