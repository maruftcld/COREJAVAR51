package com.java.core.model;

import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Hashtable;

public class JavaHashing {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String s = "password";
        String ss = "password";
        System.out.println(s.hashCode());
       
        MessageDigest digest = MessageDigest.getInstance("SHA-1");
        byte[] hash = digest.digest(s.getBytes(StandardCharsets.UTF_8));
        System.out.println(hash);
        
        Hashtable<Integer, Integer> hashTable = new Hashtable<>();
        hashTable.put(1, s.hashCode());
        hashTable.put(2, s.hashCode());
        hashTable.put(3, s.hashCode());
        hashTable.put(4, s.hashCode());

 
    }
}
