/**
  * file: PlateNumbers.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 2
  * due date: February 14, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 4.25 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Assume a vehicle plate number consists of 3 uppercase letters followed by
  * four digits. Write a program to generate a plate number.
  */

import java.util.Random;

public class PlateNumbers{
  public static void main(String[] args){

    // Generate three random numbers to correspond to the letters A-Z in ASCII code.
    int a = (int)((Math.random() * (90 - 65)) + 65);
    int b = (int)((Math.random() * (90 - 65)) + 65);
    int c = (int)((Math.random() * (90 - 65)) + 65);

    /**
      * String
      *
      * A sequence of characters.
      */

    // Create strings to convert ASCII code to letters.
    String letter1 = Character.toString((char) a);
    String letter2 = Character.toString((char) b);
    String letter3 = Character.toString((char) c);

    // Generate four random digits.
    int d = (int)((Math.random() * 9) + 1);
    int e = (int)((Math.random() * 9) + 1);
    int f = (int)((Math.random() * 9) + 1);
    int g = (int)((Math.random() * 9) + 1);

    // Convert integers into strings
    String num1 = d + "";
    String num2 = e + "";
    String num3 = f + "";
    String num4 = g + "";


    // Output plate number.
    System.out.println(letter1 + letter2 + letter3 + num1 + num2 + num3 + num4);
  }
}