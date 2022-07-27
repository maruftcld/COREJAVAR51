package com.java.core51.entity;

public class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mr. A", 20, 0.001);
        Employee e2 = new Employee("Mr. B", 30, 0.01);
        Employee e3 = new Employee("Mr. C", 40, 0.02);
        //System.out.println(e2.getAge());
        //System.out.println(e1.getSalary());
        
        Employee e = new Employee();
        System.out.println(e.getSalary());
        System.out.println(e1.salary);
        
    }
}