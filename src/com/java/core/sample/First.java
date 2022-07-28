package com.java.core.sample;


public class First {

    public static void main(String[] args) {
        //String ss = "Dhaka";
        String s = new String("Dhaka");
        s=s.concat(" Bangladesh");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Dhaka");
        sb.append(" Bangladesh");
        System.out.println(sb);

    }
}
