package com.java.core51;

import java.io.IOException;


// throw throws
// try catch finally
public class ExceptionExample {
    
    
    static Exception testException(){
        if(7<5){
            throw new ArithmeticException();
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    
    static int test(){
       /* try {
              System.out.println(5/0);
        } catch (Exception e) {
            System.out.println(e);
        }
      */
        System.out.println(5/0);
        System.out.println("print");
        return 0;
    }
    
    static void test2() throws ArithmeticException{
        throw new ArithmeticException();
    }
    
    public static void main(String[] args){
        System.out.println("start");
        test();
        
           /*
        testException();
        try {
            test();
        } catch (Exception e) {
        }
        
     
        try { // the possible occurance of exception
            System.out.println("try block");
            //System.out.println(5/0);
            int a[] = {2,3};
            System.out.println(a[3]);
        }catch(ArithmeticException e){ // to handle the exception
            System.out.println("catch block arithmetic");
            System.out.println(e);
        }catch(IndexOutOfBoundsException e){ // to handle the exception
            System.out.println("catch block array");
            System.out.println(e);
        }catch(NullPointerException e){ // to handle the exception
            System.out.println("catch block null");
            System.out.println(e);
        }catch(Exception e){ // to handle the exception
            System.out.println("catch block");
            System.out.println(e);
        }finally{ // must be excuted
            System.out.println("finally block");
        }
                */
        System.out.println("end");
    }
}