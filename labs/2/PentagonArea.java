/**
  * file: PentagonArea.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 2
  * due date: February 7, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 4.1 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Prompt the user to enter the length from the center of a pentagon 
  * to a vertex and computes the area of the pentagon.
  */

import java.util.Scanner;

public class PentagonArea{
  public static void main(String[] args){

    /**
      * Scanner
      * 
      * Collect user input
      */
    Scanner input = new Scanner(System.in);

    // Ask user for length from the center of a pentagon to a vertex.
    System.out.println("Enter the length from the center of a pentagon to a vertex:");

    // Save user input as a double value.
    double r = input.nextDouble();

    /**
      * Math.sin
      *
      * Compute sine of an angle.
      */
    /**
      * Math.PI
      *
      * Executes the numerical value of Pi (3.14159...)
      */

    // Compute length of a side.
    double s = 2 * r * Math.sin(Math.PI/5);

    /**
      * Math.pow(a, b)
      *
      * Computes a to the power of b.
      */
    /**
      * Math.tan
      *
      * Computes the tangent of an angle.
      */
    //Computer area.
    double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/5));

    System.out.println("The area of the pentagon is " + area);
  }
}