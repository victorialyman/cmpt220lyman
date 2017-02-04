/**
  * file: Lottery.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 2
  * due date: February 7, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 3.15 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Generate a lottery of a three-digit number.
  * Prompt the user to enter a three-digit number,
  * The user wins if:
  * 1) All numbers match in exact order: $10,000.
  * 2) All digits match not in order: $3,000.
  * 3) One digit matches: $1,000.
  */

import java.util.Scanner;

public class Lottery{
  public static void main(String[] args){

  /**
    * Math.random
    *
    * Produces a random number.
    */
  int x = (int)((Math.random() * 9) + 1);
  int y = (int)((Math.random() * 9) + 1);
  int z = (int)((Math.random() * 9) + 1);

    /**
      * Scanner
      * 
      * Collect user input
      */
    Scanner input = new Scanner(System.in);

    // Prompt user to enter three-digit number.
    System.out.println("Enter three digits: ");

    // Save user input into an int value.
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    int winner;

    /**
      * If-else
      *
      * Compare two or more sets of data.
      */

    // Check for matches
    if(a == x && b == y && c == z){
      winner = 0;
    }
    else if(a == y && b == z && c == x){
      winner = 1;
    }
    else if(a == z && b == x && c == y){
      winner = 1;
    }
    else if(a == x && b == z && c == y){
      winner = 1;
    }
    else if(a == y && b == x && c == z){
      winner = 1;
    }
    else if(a == z && b == y && c == x){
      winner = 1;
    }
    else if(a == x || b == x || c == x){
      winner = 2;
    }
    else if(a == y || b == y || c == y){
      winner = 2;
    }
    else if(a == z || b == z || c == z){
      winner = 2;
    }
    else{
      winner = 3;
    }

    /**
      * Switch statement
      *
      * Compares multiple data sets.
      */

    // Find out if user has won lottery.
    switch(winner){
      case 0: System.out.println("You have won $10,000!");
        break;
      case 1: System.out.println("You have won $3,000!");
        break;
      case 2: System.out.println("You have won $1,000!");
        break;
      case 3: System.out.println("You have lost.");
        break;
      default: System.out.println("Errors: invalid status");
        System.exit(1);
    }

  }
}