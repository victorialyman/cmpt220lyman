/**
  * file: PolygonArea.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 2
  * due date: February 7, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 4.5 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Write a program that prompts the user to enter the
  * number of sides and their length of a regular polygon 
  * and displays its area.
  */

import java.util.Scanner;

public class PolygonArea{
  public static void main(String[] args){

    /**
      * Scanner
      *
      * Collect user input.
      */
    Scanner input = new Scanner(System.in);

    // Ask user for number of sides and side length and save values.
    System.out.print("Enter the number of sides: ");
    double n = input.nextDouble();
    System.out.print("Enter the side length: ");
    double s = input.nextDouble();

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
    /**
      * Math.PI
      *
      * Executes the numerical value of Pi (3.14159...)
      */

    //Compute area of polygon and display results.
    double area = (n * Math.pow(n, s)) / (4 * Math.tan(Math.PI/n));
    System.out.println("The area of the " + n + "-sided polygon is " + area);
  }
}