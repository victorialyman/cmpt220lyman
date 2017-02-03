/**
  * file: RandomMonth.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 1
  * due date: February 7, 2017
  * version: 1
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
      * switch
      *
      * Test for a range of values.
      */

    // Find month name corresponding to the random number.
    switch (month) {
      case 1: System.out.println("January");
        break;
      case 2: System.out.println("February");
        break;
      case 3: System.out.println("March");
        break;
      case 4: System.out.println("April");
        break;
      case 5: System.out.println("May");
        break;
      case 6: System.out.println("June");
        break;
      case 7: System.out.println("July");
        break;
      case 8: System.out.println("August");
        break;
      case 9: System.out.println("September");
        break;
      case 10: System.out.println("October");
        break;
      case 11: System.out.println("November");
        break;
      case 12: System.out.println("December");
    }
    }

  }