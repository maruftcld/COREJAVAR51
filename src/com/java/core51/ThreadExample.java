package com.java.core51;
    // By using the Thread class
    // By using the Runnable interface


class ThreadClass extends Thread{
    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        try {
            System.out.println(Thread.currentThread().getId() + " : " + Thread.currentThread().getName());
        } catch (Exception e) {
        }
    }  
}
class ThreadClass1 implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getId() + " : " + Thread.currentThread().getName());
        } catch (Exception e) {
        }
    }  
}

public class ThreadExample {
    static int count = 7;
    public static void main(String[] args) {
 
        for (int i = 0; i < count; i++) {
            // By Thread class
            //ThreadClass tc = new ThreadClass();
            //tc.start();
            
            // By Runnable Interface
            Thread tc1 = new Thread(new ThreadClass1());
            //System.err.println(tc1);
            Thread tc2 = new Thread(new ThreadClass1());
            
            
            System.out.println("......1");
            tc1.setName(i + "-L");
            tc1.start();
            System.out.println("......2");
            tc2.setName(i + "-R");
            tc2.start();
        } 
  
    }
}
