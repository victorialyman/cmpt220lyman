/**
  * file: NonDecreasingOrder.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 1
  * due date: February 7, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 3.8 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Write a program that prompts the user to enter
  * three integers and display the integers in
  * non-desreasing order.
  */

import java.util.Scanner;

public class NonDecreasingOrder{
  public static void main(String[] args) {

    /**
      * Scanner
      *
      * Collect user input.
      */
    Scanner input = new Scanner(System.in);

    //Ask user for three integers.
    System.out.println("Enter three integers: ");

    //Save the user-inputed integer values.
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    /**
      * If-else
      *
      * Compare two or more sets of data.
      */

    //Compare the integers and output in non-decreasing order.
    if (a == b && b == c) {
      System.out.println(a + " " + b + " " + c);
    }
    else if (a == b && c < a) {
      System.out.println(c + " " + a + " " + b);
    }
    else if (a == b && c > a) {
      System.out.println(a + " " + b + " " + c);
    }
    else if (a == c && b > c) {
      System.out.println(a + " " + c + " " + b);
    }
    else if (a == c && b < c) {
      System.out.println(b + " " + a + " " + c);
    }
    else if (b == c && a < b) {
      System.out.println(a + " " + b + " " + c);
    }
    else if (b == c && a > b) {
      System.out.println(b + " " + c + " " + a);
    }
    else if (a < b && b < c && a < c) {
      System.out.println(a + " " + b + " " + c);
    }
    else if (a < c && c < b && a < b) {
      System.out.println(a + " " + c + " " + b);
    }
    else if (b < c && c < a && b < a) {
      System.out.println(b + " " + c + " " + a);
    }
    else if (b < a && a < c && b < c) {
      System.out.println(b + " " + a + " " + c);
    }
    else if (c < a && a < b && c < b) {
      System.out.println(c + " " + a + " "+ b);
    }
    else {
      System.out.println(c + " " + b + " " + a);
    }

  }
}