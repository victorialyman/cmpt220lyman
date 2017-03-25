/**
  * file: TwoSortedLists.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 5
  * due date: March 28, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 7.31 from
  * the Introduction to Java Programming textbook
  */

/**
  * Write the following method that merges 2 sorted lists into
  * a new sorted list.
  * public static int[] merge(int[] list1, int[] list2)
  * Implement the mehod in a way that takes at most 
  * list1.lenght + list2.length comparisons. Write a test program that prompts
  * the user to enter two sorted lists and displays the merged list.
  */

import java.util.Scanner;

public class TwoSortedLists{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    //Ask user for 2 lists
    System.out.print("Enter list1: ");
    int a = input.nextInt(); // The first number entered indicates the number of elements in the list
    int[] list1 = new int[a]; //Create list1 from user inputed info
    for(int i = 0; i < list1.length; i++){
      list1[i] = input.nextInt();
    }

    System.out.print("Enter list2: ");
    int b = input.nextInt(); // The first number entered indicates the number of elements in the list
    int[] list2 = new int[b]; //Create list2 from user inputed info
    for(int i = 0; i < list2.length; i++){
      list2[i] = input.nextInt();
    }

    // Combine the two arrays
    int[] combinedLists = merge(list1, list2);


    // Print combined sorted list
    printArray(combinedLists);


  }

  public static int[] merge(int[] list1, int[] list2){

    int[] combinedLists = new int[list1.length + list2.length];

    // Add list1 numbers to the new array
    for(int i = 0; i < list1.length; i++){
      combinedLists[i] = list1[i];
    }
    
    // Add list2 numbers to the new array
    for(int j = 0, k = list1.length; j < list2.length; j++, k++){
      combinedLists[k] = list2[j];
    }

    // Sort list
    sort(combinedLists);

    return combinedLists;

  }

  public static void sort(int[] list){
    for(int i = 0; i < list.length - 1; i++){
      int min = list[i];
      int minIndex = i;

      for(int j = i +1; j < list.length; j++){
        if(list[j] < min){
          min = list[j];
          minIndex = j;
        }
      }

      if (minIndex != i){
        list[minIndex] = list[i];
        list[i] = min;
      }
    }
  }

  // Method to print an array that I use in every program where I need to print an array
  public static void printArray(int[] array){

    for(int i = 0; i < array.length; i++){

      System.out.print(array[i] + " ");

    }
  }
}