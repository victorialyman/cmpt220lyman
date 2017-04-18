/**
  * file: TestLocation.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 6
  * due date: April 18, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 9.13 from
  * the Introduction to Java Programming textbook
  */

/**
  * Write the following method that returns the location of the largect element
  * in a two-dimensional array:
  * public static Location locateLargest(double[][] a)
  * The return value is an instance of Location.  Write a test program that prompts
  * the user to enter a two-dimensional array and displays the location of the
  * largest element in the array.
  */

import java.util.Scanner;

public class TestLocation{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of rows and column in the array: ");

    // Create int to save row and column size
    int row = input.nextInt();
    int column = input.nextInt();

    // Create array from row and column sizes
    double[][] a = new double[row][column];

    System.out.println("Enter the array: ");

    // Save values to the array
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[i].length; j++){
        a[i][j] = input.nextDouble();
      }
    }

    // Initiate finding of max location
    Location location = locateLargest(a);

    // Output largest value and location
    System.out.println("The location of the largest element is " + 
      location.maxValue + " at (" + location.row + ", " + location.column + ")");
  }

  public static Location locateLargest(double[][] a){
    return new Location(a);
  }
}