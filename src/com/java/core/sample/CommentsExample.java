/*
 * Multiline comment
 */
package com.java.core.sample;

//this is single line comment
public class CommentsExample {
   /**
     * This is a method to display sum of 2 int
     * @param numA this is 1st parameter to pass the method
     * @param numB this is 2nd parameter to pass the method
     * @return This methods returns an int value
     */
   public int addNum(int numA, int numB) {
      return numA + numB;
   }
   public static void main(String args[])
   {
      CommentsExample obj = new CommentsExample();
      int sum = obj.addNum(10, 20);

      System.out.println("Sum of 10 and 20 is :" + sum);
   }
}
