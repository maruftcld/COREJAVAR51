package com.java.core.sample;

import com.java.core51.entity.Employee;
import static java.lang.System.gc;
import java.util.Properties;
import java.util.Set;

public class JavaTest {
    public static void main(String[] args) {
        
        try {
            System.out.println("try");
            int a[] = {0, 2};
            System.out.println(a[3]);
            System.out.println(".........");
        } catch (Exception e) {
            System.out.println("catch");
            //System.exit(0);
        }finally{
            System.out.println("finally");
        }
        
        
        String s = "value";
        System.out.println(s);
        
        //System.exit(0);
        
        String ss = new String("Hello"); //
        System.out.println(ss);
        
        System.out.println("hello");
        Properties prop = System.getProperties();
        
        Set<Object> keys = prop.keySet();
        for (Object key : keys) {
            System.out.println(key + " : " + System.getProperty(key.toString()));
            //System.out.println();
        }
        
        
    }
}