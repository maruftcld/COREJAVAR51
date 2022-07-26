package com.java.core51;

public class ReferenceUsage {

    int round;
    String course;
    double salary;
    
    String name;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    
    public static void main(String[] args) {
        ReferenceUsage rf = new ReferenceUsage();
        rf.setName("Mr. A");
        System.out.println(rf.getName());
        rf.setName("Mr. B");
        System.out.println(rf.getName());
        

        ReferenceUsage rf1 = new ReferenceUsage();
        rf1.round = 51;
        rf1.course = "JEE";
        rf1.salary = 0.00;

        ReferenceUsage rf2 = new ReferenceUsage();
        rf2.round = 52;
        rf2.course = "C#";
        rf2.salary = 0.01;
        
    }
}