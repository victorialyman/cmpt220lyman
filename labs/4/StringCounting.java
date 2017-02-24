/**
  * file: StringCounting.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 4
  * due date: February 28, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 6.20 from
  * the Introduction to Java Programming textbook
  */

/**
  * Write a method that counts the number of letters in a string using the following header:
  * public static int countLetters(String s)
  *
  * Write a test program that prompts the user to enter a string and
  * displays the number of letters in the string.
  */

import java.util.Scanner;

public class StringCounting{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    // Ask user to input a string
    System.out.print("Enter a string: ");
    String s = input.nextLine();

    // Display string length
    System.out.println("The number of letters in your string " + s + " is " + countLetters(s));
  }

  public static int countLetters(String s){

    // Save interger to count # of letters
    int numOfLetters = 0;

    for(int i = 0; i < s.length(); i++){

      //Check if character is a letter
      if(Character.isLetter(s.charAt(i))){
        // Add 1 to the # of letters
        numOfLetters = numOfLetters + 1;
      }
    }

    return numOfLetters;
  }
}