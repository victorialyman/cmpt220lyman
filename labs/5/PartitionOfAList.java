/**
  * file: PartitionOfAList.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 5
  * due date: March 28, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 7.32 from
  * the Introduction to Java Programming textbook
  */

/**
  * Write the following method that partitions the list using
  * the first element called a pivot.
  * public static int partition(int[] list)
  * After the partition, the elements in the list are rearranged so that all
  * the elemtns before the pivot are less than or equal to the pivot and the
  * elements after the pivot are greater than the pivot. The method returns
  * the index where the pivot is located in the new list.
  */

import java.util.Scanner;

public class PartitionOfAList{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    //Ask user for an unsorted list
    System.out.print("Enter list: ");
    int a = input.nextInt(); // The first number entered indicates the number of elements in the list
    int[] list = new int[a]; //Create list from user inputed info
    for(int i = 0; i < list.length; i++){
      list[i] = input.nextInt();
    }

    partition(list);

    System.out.print("After the partition, the list is ");
    printArray(list);

  }

  public static int partition(int[] list){

  }

  // Method to print an array that I use in every program where I need to print an array
  public static void printArray(int[] array){

    for(int i = 0; i < array.length; i++){

      System.out.print(array[i] + " ");

    }
  }
}