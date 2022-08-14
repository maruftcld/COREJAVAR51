package com.java.core51;

import java.io.*;

public class BufferedInputStreamTest {

    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("F:/folder2/new.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
