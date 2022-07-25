
package com.java.core51;

public class VariableUse {
    
    int result;
 
    int midTerm(){
        result = 50;
        return result;
    }
    
    int midFinal(){
        result = 100;
        return result;
    }
    
    
    public static void main(String[] args) {
        VariableUse vs = new VariableUse();
        System.out.println(vs.midTerm());
        System.out.println(vs.midFinal());
        
    }

}