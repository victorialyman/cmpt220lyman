/**
  * file: GreaterThan.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 3
  * due date: February 21, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 5.12 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Use a while loop to find the smallest integer n such that
  * n^2 is greater than 12,000
  */

public class GreaterThan{
  public static void main(String[] args){

    // Create integer n.
    int n = 1;

    /**
      * while loop
      *
      * allows code to be exectued repeatedly based on a given Boolean condition
      */
    // Check if n^2 < 12000
    while(n * n < 12000){
      n++;
    }

    int nsquared = n * n;

    System.out.println("The smallest integer n where n^2 is greater than 12000 is " + n);
    System.out.println("n^2 is " + nsquared);
  }
}

