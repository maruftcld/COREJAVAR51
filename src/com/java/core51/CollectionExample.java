package com.java.core51;

import java.util.*;
import java.util.function.Consumer;


class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
// object.method

class EmployeeShowData {
    static void printEmployees(Employee a, Employee b, Employee c, Employee d, Employee e){
        System.out.println(a.name + " " + a.age);
        System.out.println(b.name + " " + b.age);
        System.out.println(c.name + " " + c.age);
        System.out.println(d.name + " " + d.age);
        System.out.println(e.name + " " + e.age);
    }
    
    static void printEmployeesBeta(List<Employee> empList){
         for (int i = 0; i < empList.size(); i++) {
             //Employee e = (Employee) empList.get(i);
             //System.out.println(e.name + " " + e.age);
             System.out.println(i + " " + empList.get(i).getName() + " " + empList.get(i).getAge());  
         }
    }
}

class Trainees {
String name;
    int age;
    double salary;

    public Trainees(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

}

interface SuperA {
    void abc();
}

class AA implements SuperA{

    @Override
    public void abc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class BB implements SuperA{

    @Override
    public void abc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Emp {}
class Trainee1{}

public class CollectionExample {
    
    SuperA method1(){
        return new AA();
    }
     SuperA method2(){
        return new BB();
    }
    
     static Emp abc(){
         return  null;
     }
    
    public static void main(String[] args) { 
      // Trainee1 p = (Trainee1) CollectionExample.abc();
        
        SuperA supA = new  AA();
        SuperA supB = new  BB();
        
        
        Employee emp1 = new Employee("Mr. A", 10, 100.00);
        Employee emp2 = new Employee("Mr. B", 20, 200.00);    
        Employee emp3 = new Employee("Mr. C", 30, 300.00);    
        Employee emp4 = new Employee("Mr. D", 40, 400.00);    
        Employee emp5 = new Employee("Mr. E", 50, 500.00);    
        //EmployeeShowData.printEmployees(emp1, emp2, emp3, emp4, emp5); 
        
        Trainees t1 = new Trainees("Mr. E", 50, 500.00); 
        Trainees t2 = new Trainees("Mr. E", 50, 500.00); 
        Trainees t3 = new Trainees("Mr. E", 50, 500.00); 
        Trainees t4 = new Trainees("Mr. E", 50, 500.00); 
        
        List<Object> objList = new LinkedList<>();
        objList.add("Abc");
        objList.add(1.20);
        
        
        List<Trainees> arrList = new ArrayList<>();
        arrList.add(t1);
        arrList.add(t2);
        arrList.add(t3);
        
        arrList.iterator();
        
        System.out.println(arrList.get(0));

        List<Employee> empList = new ArrayList();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp5);
        
        Employee[] arr1 = (Employee[]) empList.toArray();

        System.out.println("array value  " + arr1[0].name);
        
        Iterator<Employee> empIterator = empList.iterator();

        for (Iterator<Employee> iterator = empList.iterator(); iterator.hasNext();) {
            Employee next = iterator.next();
            System.err.println(next.name);
        }
        
        for (Iterator<Employee> iterator = empList.iterator(); iterator.hasNext();) {
            Employee next = iterator.next();
            
        }
        
        
        EmployeeShowData.printEmployeesBeta(empList);

        Set<Employee> set = new LinkedHashSet<>();
        set.add(emp1);
        set.add(emp2);
        set.add(emp2);
        set.add(emp3);
        set.add(emp3);
        set.add(emp3);

        Spliterator<Employee> spl = set.spliterator();
        Spliterator<Employee> spl1 = spl.trySplit();
        
        
        Iterator<Employee> empIterator1 = set.iterator();
        
        
        
        for (Object emp : set) {
            Employee e = (Employee) emp;
            System.out.println(e.getName());
        }
        
    }
}

