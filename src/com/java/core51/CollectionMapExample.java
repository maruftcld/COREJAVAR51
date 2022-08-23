package com.java.core51;

import java.util.*;


class Location {
    String name;
    int road;
    String area;

    public Location(String name, int road, String area) {
        this.name = name;
        this.road = road;
        this.area = area;
    }
}



public class CollectionMapExample {
    public static void main(String[] args) {
        
        int a = 10;
        
        Location loc1 = new Location("Kakrail", 1, "Dhaka1");
        Location loc4 = new Location("Mirpur", 1, "Dhaka4"); 
        
        
        
        Location loc2 = new Location("Dhanmondi", 1, "Dhaka2");
        System.out.println("Loc2:: " + loc2);
        Location loc3 = new Location("Paltan", 1, "Dhaka3");
        System.out.println("Loc3:: " + loc3);
        loc3 = loc2; //same object reassign
        System.out.println("After Assaign :: " + loc3);
        Object o = new Object();
        System.out.println("Object " + o);
        o = loc3;
        System.out.println("Obj " + o);
        System.out.println("Last " + loc3);
       
        List<Location> locList = new ArrayList<>();
        locList.add(loc1);
        locList.add(loc2);
        locList.add(loc3);
        locList.add(loc4);
        
        List<Location> locList2 = new LinkedList<>();
        locList2.add(loc1);
        locList2.add(loc2);
        locList2.add(loc3);
        locList2.add(loc4);
        
        
        Employee emp1 = new Employee("Mr. A", 10, 100.00);
        Employee emp2 = new Employee("Mr. B", 20, 200.00);    
        Employee emp3 = new Employee("Mr. C", 30, 300.00);    
        Employee emp4 = new Employee("Mr. D", 40, 400.00);    
        
        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        
        List<Object> list = new ArrayList<>();
        list.add(locList);
        list.add(empList);
        
        Map<String, List<Object>> map = new HashMap<>();
        map.put("L1", list);
        
        List<Location> locs = (List<Location>) map.get("L1").get(0);
        System.out.println(locs.get(0).name);
        
        //locMap.put("L3", loc3);
        //locMap.put("L1", loc1);
        //locMap.put(1.01, loc2);
       

       //System.out.println(locMap.get("1.01").name);
       
        
        Map<String, String> strs = new Hashtable<>();
        strs.put("a", "Round 1");
        strs.put("b", "Round 2");
        strs.put("c", new String(""));
        strs.put("d", "Round 3");
        System.out.println(strs.get("d"));
        
        
        String s = "a";
        String s1 = new String("a");
        System.out.println(s == s1);
        
        Queue q = new PriorityQueue();
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        q.add("E");
        
        //System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.remove());
        //System.out.println(q.poll());
        //System.out.println(q.peek());
        //System.out.println(q.poll());

    }
}