/**
  * file: PalindromeInt.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 3
  * due date: February 21, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 6.3 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Write the methods with the following headers:
  * public static int reverse(int number)
  * public static boolean isPalindrome(int number)
  *
  * Use the reverse method to implement isPalindrome. A number is a
  * palindrome if its reversal is the same as itself. Write a test program
  * that prompts the user to enter an integer and reports whether the
  * integer is a palindrome.
  */

import java.util.Scanner;

public class PalindromeInt{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    // Ask user to input a number.
    System.out.print("Enter an integer: ");

    // Save user input as an integer
    int num = input.nextInt();

    // Output reverse and palindrome.
    System.out.println("The reverse of " + num + " is " + reverse(num));
    
    if(isPalindrome(num)) {
      System.out.println(num + " is a palindrome.");
    }
    else{
      System.out.println(num + " is not a palindrome.");
    }

  }

  public static int reverse(int number){

    int reverse = 0;

    while(number != 0){

      // Add a 0 to the end
      reverse = reverse * 10;
      // Add the end digit to the reverse value
      reverse = reverse + (number % 10);
      // Extract the digit
      number = number / 10;
    }

    return reverse;
  }

  public static boolean isPalindrome(int number){

    return (number == reverse(number));
  }
}