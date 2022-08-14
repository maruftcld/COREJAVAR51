/*BufferedOutputStream used an internal buffer. 
 * It adds more efficiency than to
 * write data directly into a stream. So, it makes the performance fast. */

package com.java.core51;

import java.io.*;

public class BufferedOutputStreamTest {

    public static void main(String args[]) throws Exception {

        FileOutputStream fout = new FileOutputStream("F:/folder2/new.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        String s = "He is my favourite player";
        byte b[] = s.getBytes();
        bout.write(b);

        bout.flush();
        bout.close();
        System.out.println("success");
    }
}
