/**
  * file: lab1lyman.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 1
  * due date: January 31, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 2.1 from
  * the Introduction to Java Programming textbook. 
  */


/**
  * Write a program that reads a Celsius degree 
  * and then converts it to Farenheit.
  * Display the result.
  */

import java.util.Scanner;

public class ConvertFahrenheit {
  public static void main(String[] args) {

    /**
      * print
      * 
      * Prints a message in the console.
      */

    System.out.print("Enter a degree in Celsius:");

    /**
      * Scanner
      *
      * Obtains a value given by the user.
      */

    Scanner input = new Scanner(System.in);

    /**
      * double
      *
      * Saves the value inputed by user into a double value.
      */


    double celsius = input.nextDouble();

    // Convert celsius value to fahrenheit.

    double fahrenheit = (9.0 / 5.0) * celsius + 32;

    // Display result.

    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

  }
}