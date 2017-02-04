/**
  * file: RandomMonth.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 2
  * due date: February 7, 2017
  * version: 2
  *
  * This file contains a program to answer Problem 3.4 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Write a program that randomly generates an integer
  * between 1 and 12 and displays the month name accordingly.
  */

public class RandomMonth{
  public static void main(String[] args) {

    /**
      * Math.random
      *
      * Produces a random number between 0 and 1.
      */

    // Produce a random number between 1 and 12.
    int month = (int)((Math.random() * 12) + 1);

    /**
      * if else
      *
      * Compares 2 or more sets of data.
      */

    // Find month name corresponding to the random number.
    if(month == 1) {
      System.out.println("January");
    }
    else if(month == 2) {
      System.out.println("February");
    }
    else if(month == 3) {
      System.out.println("March");
    }
    else if(month == 4) {
      System.out.println("April");
    }
    else if(month == 5) {
      System.out.println("May");
    }
    else if(month == 6) {
      System.out.println("June");
    }
    else if(month == 7) {
      System.out.println("July");
    }
    else if(month == 8) {
      System.out.println("August");
    }
    else if(month == 9) {
      System.out.println("September");
    }
    else if(month == 10) {
      System.out.println("October");
    }
    else if(month == 11) {
      System.out.println("November");
    }
    else {
      System.out.println("December");
    }
    }

  }