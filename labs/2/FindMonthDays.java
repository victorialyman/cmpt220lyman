/**
  * file: FindMonthDays.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 2
  * due date: February 7, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 3.11 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Write a program that prompts the user to enter the month
  * and year and displays the number of days in the month.
  */

import java.util.Scanner;

public class FindMonthDays{
  public static void main(String[] args){

    /**
      * Scanner
      *
      * Use to collect user input.
      */

    Scanner input = new Scanner(System.in);

    // Ask the user for a month and year.
    System.out.println("Enter a number month and year:");

    // Save the user inputs into values.
    int month = input.nextInt();
    int year = input.nextInt();

    /**
      * Switch statement
      *
      * Compares multiple data sets.
      */

    // Check user input to output correct days per month.
    switch(month){
      case 1: System.out.println("January " + year + " has 31 days.");
        break;
      case 2: {
        if(year % 4 == 0){
          System.out.println("February " + year + " has 29 days.");
        }
        else {
          System.out.println("February " + year + " has 28 days.");
        }
          break;
      }
      case 3: System.out.println("March " + year + " has 31 days.");
        break;
      case 4: System.out.println("April " + year + " has 30 days.");
        break;
      case 5: System.out.println("May " + year + " has 31 days.");
        break;
      case 6: System.out.println("June " + year + " has 30 days.");
        break;
      case 7: System.out.println("July " + year + " has 31 days.");
        break;
      case 8: System.out.println("August " + year + " has 31 days.");
        break;
      case 9: System.out.println("September " + year + " has 30 days.");
        break;
      case 10: System.out.println("October " + year + " has 31 days.");
        break;
      case 11: System.out.println("November " + year + " has 30 days.");
        break;
      case 12: System.out.println("December " + year + " has 31 days.");
        break;
      default: System.out.println("Errors: invalid status");
        System.exit(1);
    }
  }
}