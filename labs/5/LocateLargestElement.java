/**
  * file: LocateLargestElement.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 5
  * due date: March 28, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 8.13 from
  * the Introduction to Java Programming textbook
  */

/**
  * Write the following method that returns the location of
  * the largest element in a two-dimensional array.
  * public static int[] locateLargest(double[][] a)
  * The return value is a one-dimensional array that contains 2 elements.
  * There two elements indicate the row and column indices of the largest
  * element in the two-dimensional array. Write a test program that prompts
  * the user to enter a two-dimensional array and displays the location of
  * the largest element in the array.
  */

import java.util.Scanner;

public class LocateLargestElement{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    // Ask user for # of rows & columns
    System.out.print("Enter the number of rows and columns of the array: ");
    int row = input.nextInt();
    int column = input.nextInt();

    // Create new array with the given values
    double[][] userarray = new double[row][column];

    //Ask user to enter array
    System.out.println("Enter the array: ");

    // Create array from given values
    for(int i = 0; i < row; i++){
      for(int j = 0; j < column; j++){
        userarray[i][j] = input.nextDouble();
      }
    }

    int[] location = locateLargest(userarray);

    // Output the location
    System.out.print("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");

  }

  public static int[] locateLargest(double[][] a){

    // Create new array to save the location numbers for display later
    int[] location = new int[] {0, 0};

    // Create an element to check for the largest number
    double largest = 0;

    for(int k = 0; k < a.length; k++){

      for(int m = 0; m < a[k].length; m++){

        if(a[k][m] > largest){ // if the current element is larger than the saved largest

          // Save location numbers in the location array to display later
          location[0] = k;
          location[1] = m;

          // Save the number as largest to continue checking it against the rest of the elements
          largest = a[k][m];
        }
      }
    }

    return location;

  }

}