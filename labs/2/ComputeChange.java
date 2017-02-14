/**
  * file: ComputeChange.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 2
  * due date: February 14, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 4.26 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss
  * of accuracy when converting a float value to an int value.
  * Read the input as a string such as "11.56". Your program should extract
  * the dollar amount before the decimal point and the cents after
  * the decimal amount using the indexOf and substring method.
  */

import java.util.Scanner;

public class ComputeChange{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    // Recieve the amount
    System.out.print("Enter an amount, for example 11.56: ");
    /**
      * String
      *
      * A squence of characters
      */
    String amount = input.nextLine();

    /**
      * substring
      *
      * Returns this string's substring that begins and ends at the specified indexes
      */

    //Find the number of one dollars
    String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));

    // Find the cents left over
    int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

    // Find the number of quarters in the remaining amount
    int numberOfQuarters = cents / 25;
    cents = cents % 25;

    //Find the number of dimes in the remaining amount
    int numberOfDimes = cents / 10;
    cents = cents % 10;

    // Find the number of nickels in the remaining amount
    int numberOfNickels = cents / 5;
    cents = cents % 5;

    //Find the number of pennies in the remaining amount
    int numberOfPennies = cents;

    //Display results
    System.out.println("Your amount " + amount + " consists of");
    System.out.println("      " + numberOfOneDollars + " dollars");
    System.out.println("      " + numberOfQuarters + " quarters");
    System.out.println("      " + numberOfDimes + " dimes");
    System.out.println("      " + numberOfNickels + " nickels");
    System.out.println("      " + numberOfPennies + " pennies");
  }
}