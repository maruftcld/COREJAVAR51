package com.java.core.sample;

public class JavaThis {
    static int a;
    int f = 12;
    
    int x, y, z;

    public JavaThis() {
        x = 10;
    }
    
    public JavaThis(int x) {
        this.x = 10;
    }
    
    
    
    
    void test2(){
        System.out.println(this.f);
        System.out.println("test2 this  "+ this.x);
        System.out.println("called test2");
        System.out.println("test2 " + x);
    }
    
    void test(){
        this.test2();
        System.err.println(f);
        this.f = 40;
        System.out.println("test " + f);
        System.err.println("test " + x);
        System.out.println(this.a);
        System.out.println(this);
        System.out.println(new JavaThis());
    }
    
    // this represents the current class object reference
    public static void main(String[] args) {
        JavaThis jt = new JavaThis();
        jt.test();
        jt.f = 30;
        System.out.println("main " + jt.f);
        
        //System.out.println(a);
        //System.out.println(JavaThis.a);
        //System.out.println(new JavaThis().a);
    }
}