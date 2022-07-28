package com.java.core.sample;


public class MethodExample {
    //Field variable
    int x, y;
    double d;
    String s;

    //method name= dispSum
    //method signature= dispSum(int x, int y)
    //method interface= int dispSum(int x, int y)
     int dispSum() {
        int c=0;
        //c+=n;// not accessible
        int n =10;//Local variable
        c+=n;//accessible here
        return x + y;
    }
    //Mutator method
     //parameter x,y
    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        MethodExample m  = new MethodExample();
        m.setXY(50,60);
        int sum=m.dispSum();
        System.out.println(sum);
    }
}
