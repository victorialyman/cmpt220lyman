/**
  * file: BubbleSort.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 4
  * due date: February 28, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 7.18 from
  * the Introduction to Java Programming textbook
  */

/**
  * Write a sort method that uses the bubble sort algorithm
  */

import java.util.Scanner;

public class BubbleSort{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    // Create array to store numbers
    double[] myArray = new double[10];

    // Ask user for 10 numbers
    System.out.print("Enter ten numbers: ");

    //Save 10 numbers to an array
    for(int i = 0; i < myArray.length; i++) {
      myArray[i] = input.nextDouble();
    }

    bubbleSort(myArray);

    printArray(myArray, 10);

  }

  // Output sorted array
  public static void printArray(double[] array, int nums){

    for(int i = 0; i < array.length; i++){

      System.out.print(array[i] + " ");

      if((i + 1) % nums == 0){
        System.out.println("");
      }
    }
  }

  public static void bubbleSort(double[] array){

    // Create temp double for swap
    double temp;

    // Start first pass
    boolean swap = true;

    while(swap){

      // Set to false until swap occurs
      swap = false;

      for(int i = 0; i < array.length - 1; i++){

        // Check which number is biggeer
        if(array[i] > array[i + 1]){
          temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          // Set to true because swap has occurred 
          swap = true;
        }
      }
    }
  }
}