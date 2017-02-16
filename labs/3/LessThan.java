/**
  * file: LessThan.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 3
  * due date: February 21, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 5.13 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Use a while loop to find the largest integer n such that
  * n^3 is less than 12000
  */

public class LessThan{
  public static void main(String[] args){

    // Create integer n
    int n = 1;

    /**
      * while loop
      *
      * allows code to be exectued repeatedly based on a given Boolean condition
      */
    // Check if n^3 < 12000
    while(n * n * n < 12000){
      n++;
    }

    // Return n to the last number checked in the loop.
    n--;

    int ncubed = n * n * n;

    System.out.println("The largest integer n such that n^3 is less than 12,000 is " + n);
    System.out.println("n^3 is " + ncubed);
  }
}