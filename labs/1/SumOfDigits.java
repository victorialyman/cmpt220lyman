/**
  * file: lab1lyman.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 1
  * due date: January 31, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 2.6 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Write a programs that reads an integer between 0 and 1000
  * and adds all the digits in the integer.
  */

import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {

    /**
      * print
      * 
      * Prints a message in the console.
      */

    System.out.print("Enter a number between 0 and 1000: ");

    /**
      * Scanner
      * 
      * Creates an object to allow user input.
      */
    Scanner input = new Scanner (System.in);

    /**
      * int
      *
      * Saves the user input as a integer value.
      */

    int num = input.nextInt();

    // Find the first digit.
    int a = num % 10;

    // Extract the first digit and find the second digit.
    int b = (num / 10) % 10;

    // Extract the first 2 digits and find the third digit.
    int c = (num / 100) % 10;


    // Add all of the digits together.
    int sum = a + b + c;

    //Display the sum.

    /**
      * println
      *
      * Prints a message to the console on a new line.
      */
    System.out.println("The sum of the digits is " + sum);

  }
}