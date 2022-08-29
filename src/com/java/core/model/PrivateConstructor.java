package com.java.core.model;

//Singletone pattern
public class PrivateConstructor {

    static PrivateConstructor pvcs;
    int a = 10;
    private PrivateConstructor() {
    }
    
    //factory method
    static PrivateConstructor getObject(){
        if(pvcs == null){
            return new PrivateConstructor();
        }else{
            return null;
        }  
    }

}


class TestConstructor {
    public static void main(String[] args) {
        PrivateConstructor pc = PrivateConstructor.getObject();
        System.out.println(pc.a);
    }
}