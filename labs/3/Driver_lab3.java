/**
  * file: Driver_lab3.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 3
  * due date: February 21, 2017
  * version: 1
  *
  * This file contains a program to answer the Kattis problem
  * called Different Distances in Lab 3. 
  */

/**
  * Write a program to compute the p-norm distance between pairs of points,
  * for a given value p. 
  * The formula is (|X1 - X2|^p + |Y1 - Y2|^p)^1/p
  */

import java.util.Scanner;

public class Driver_lab3{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    // Ask user to input two pairs of points and the p-norm distance
    System.out.println("Enter pairs of points and the p-norm distance for each pair. Enter 0 when done.");
    double number = input.nextDouble();

    while(number != 0){

      //Save each of the coordinates and p-norm
      double x1 = number;
      double y1 = input.nextDouble();
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      double p = input.nextDouble();

      // Find the distance using the formula
      double abs1 = Math.abs(x1 - x2);
      double abs2 = Math.abs(x1 - x2);
      double pow1 = Math.pow(abs1, p);
      double pow2 = Math.pow(abs2, p);
      double combine = pow1 + pow2;
      double distance = Math.pow(combine, (1/p));
      
      // Output distance
      System.out.println(distance);
      
      number = input.nextDouble();
    }
  }
}