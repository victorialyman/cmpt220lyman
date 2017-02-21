/**
  * file: SumDigits.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 3
  * due date: February 21, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 6.2 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Write a method that computes the sum of the digits in an integer.
  * Use the following method header:
  * public static int sumDigits(long n)
  */

import java.util.Scanner;

public class SumDigits{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    // Ask user for an integer.
    System.out.print("Enter an multi-digit integer: ");

    // Save user input as an integer.
    int number = input.nextInt();

    // Output sum.
    System.out.println("The sum of the digits is " + sumDigits(number));

  }

  public static int sumDigits(int n){

    int sum = 0;

    /**
      * while loop
      *
      * allows code to be exectued repeatedly based on a given Boolean condition
      */
    while(n != 0){
      
      // Add digit to sum.
      sum = sum + (n % 10);

      // Extract digit from number.
      n = n / 10;
    }

    return sum;
  }
}