/**
  * file: ReviseSelectionSort.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 5
  * due date: March 28, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 7.20 from
  * the Introduction to Java Programming textbook
  */

/**
  * In Section 7.11, you used selection sort to sort an array.
  * The selection-sort method repeatedly finds the smallest number in the current
  * array and swaps it with the first. Rewrite this program by finding the largest
  * number and swapping it with the last. Write a test program that reads in
  * 10 double numbers, invoked the method, and displays the sorted numbers.
  */

import java.util.Scanner;

public class ReviseSelectionSort{
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

    selectionSortR(tenNums);
    printArray(tenNums, 10);

  }

  public static void selectionSortR (double[] list){

    for(int i = 0; i < list.length - 1; i++){
      // Find the maximum in the list
      double currentMax = list[i];
      int currentMaxIndex = i;

      for(int j = i + 1; j < list.length; j++){
        if (currentMax < list[j]){
          currentMax = list[j];
          currentMaxIndex = j;
        }
      }

      // Swap list[i] with list[currentMaxIndex] if necessary
      if(currentMaxIndex != i){
        list[currentMaxIndex] = list[i];
        list[i] = currentMax;
      }
    }

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
}