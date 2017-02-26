/**
  * file: SmallestElement.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 4
  * due date: February 28, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 7.9 from
  * the Introduction to Java Programming textbook
  */

/**
  * Write a method that finds the smallest element in an array of
  * double values using the following header:
  * public static double min(double[] array)
  *
  * Write a test program that prompts the user to enter ten numbers,
  * invokes this method to return the minimum value, and displays
  * the minimum value.
  */

import java.util.Scanner;

public class SmallestElement{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    // Create array to store numbers
    double[] tenNums = new double[10];

    // Ask user for 10 numbers
    System.out.print("Enter ten numbers: ");

    //Save 10 numbers to an array
    for(int i = 0; i < tenNums.length; i++) {
      tenNums[i] = input.nextDouble();
    }

    //Output minimum
    System.out.println("The minimum number is " + min(tenNums));

  }

  public static double min(double[] array){

    double min = array[0];

    for(int i = 0; i < array.length; i++){

      // Check if current double is smaller than current min
      if(min > array[i]){
        min = array[i];
      }
    }

    return min;

  }
}