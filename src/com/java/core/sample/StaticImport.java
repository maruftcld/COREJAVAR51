
package com.java.core.sample;

import static java.lang.Math.*;

public class StaticImport {
    
static int x;
int y;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(Math.PI);
        
        StaticImport ai = new StaticImport();
        System.out.println(ai.y);
        System.out.println(PI);
        System.out.println(random());
        
    }
    
    void sample(){
    //static int y=0;
        System.out.println(y);
    }
}


