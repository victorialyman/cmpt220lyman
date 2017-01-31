/**
  * file: lab1lyman.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 1
  * due date: January 31, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 2.5 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Write a programs that reads the subtotal and the gratuity rate,
  * then computes the gratuity and total.
  */

import java.util.Scanner;

public class CalculateTips {
  public static void main(String[] args) {

    /**
      * print
      * 
      * Prints a message in the console.
      */

    // Ask user for subtotal and gratuity rate.
    System.out.print("Enter the subtotal and gratuity rate: ");

    /**
      * Scanner
      *
      * Obtains values given by the user.
      */

    Scanner input = new Scanner(System.in);

    /**
      * double
      *
      * Saves values into double values.
      */

    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();

    //Calulate gratuity and total.
    double gratuity = subtotal * (gratuityRate / 100);
    double total = subtotal + gratuity;

    //Display gratuity and total.
    System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);

  }
}