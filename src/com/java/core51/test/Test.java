package com.java.core51.test;

import java.util.*;

interface IA {}
class TT implements IA {}
class TTT implements IA {}


class AA {}
class T extends AA{}



public class Test {
    public static void main(String[] args) {
      AA a = new T();
      
      
      
      IA aa = new TT();
      IA bb = new TTT();
      
      Iterable i = new TreeSet();
      
      
    }
}