/**
  * file: ComputeAverage.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 3
  * due date: February 21, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 5.1 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Write a program that reads an unspecified number of integers,
  * determines how many positive and negative values have been read,
  * and computes the total and average of the input values.
  * Your program ends with the input 0.
  * Display the average as a floating-point number.
  */

import java.util.Scanner;

public class ComputeAverage{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    // Ask user for integers.
    System.out.print("Enter an integer, the input ends if it is 0:");
    int number = input.nextInt();

    // Create values to save amount of positive & negative values.
    int positive = 0;
    int negative = 0;

    // Create value to save total.
    int total = 0;

    // Create a value to save the amount of integers.
    int amount = 0;

    /**
      * while loop
      *
      * allows code to be executed repeatedly based on a given Boolean statement
      */
    // Create while loop to continously search for integers given.
    do {
      if(number > 0){
        positive = positive + 1;
      }
      else{
        negative = negative + 1;
      }

      total = total + number;
      amount = amount + 1;
      number = input.nextInt();
    } while(number != 0);

    // Find average.
    int average = total / amount;

    // Display findings.
    System.out.println("The number of positives is " + positive);
    System.out.println("The number of negatives is " + negative);
    System.out.println("The total is " + total);
    System.out.println("The average is " + average);
  }
}