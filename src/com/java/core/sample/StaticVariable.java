package com.java.core.sample;

public class StaticVariable {
    // salary  variable is a private static variable
    private static double salary;
    int x;//instance/non-static variable
    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";

    void test() {
        //int x=0;//local variable can never be static
        x = 0;
        salary = 345;//non-static member can access static member        
    }

    public static void main(String args[]) {
        //x=0;      //static member can not access non-static member
        StaticVariable sv = new StaticVariable();
        sv.x=100;
        //this.x;// static member dosen't have 'this'
        salary = 1000;
        //int r=0;
        System.out.println(DEPARTMENT + "average salary:" + salary);
    }
}
