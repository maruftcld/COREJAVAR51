package com.java.core.sample;


public class ThisRefEx {
    //instance variable
    int x;
    String y;
    ThisRefEx(){
    this(3, "H");
    }

    public ThisRefEx(int x, String y) {
        // resolve ambiguity between instance variable and parameter
        this.x = x;
        this.y = y;
    }
    void sum(int x, int y){
        System.out.println(x+y);
    }

    void doYYY() {
        RecRef recref = new RecRef();
        // passing current object as a parameter to another method
        recref.doXX(this);
        recref.doMM(x);
    }
    public static void main(String[] args) {
        ThisRefEx trfex = new ThisRefEx();
        trfex.doYYY();
    }
}

class RecRef {

    void doXX(ThisRefEx rr) {
       rr.sum(5, 6);         
    }

    void doMM(int s) {
    }
}
