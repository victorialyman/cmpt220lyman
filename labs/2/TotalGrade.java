/**
  * file: lab1lyman.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 2
  * due date: February 7, 2017
  * version: 2
  *
  * This file contains a program to answer Question 2
  * on Lab 2.
  */

/**
  * Make a program that calculates the percentage total grade
  * of a student in this class.
  * The program will ask for a percentage corresponding to
  * [midterm exam, final exam, projects, homework and labs]
  * and will return the final letter grade.
  */

import java.util.Scanner;

public class TotalGrade {
  public static void main(String[] args) {

    /**
      * println
      *
      * Prints a message to the console.
      */

    // Prompt the user for their grades.
    System.out.println("Please enter the following as a percentage...");

    /**
      * Scanner
      *
      * Collects user input.
      */
    Scanner input = new Scanner(System.in);

    System.out.print("Midterm exam: ");
    /**
      * double
      *
      * Saves the given values as a double values.
      */
    double midterm = input.nextDouble();

    System.out.print("Final exam: ");
    double finalexam = input.nextDouble();

    System.out.print("Projects: ");
    double prj = input.nextDouble();

    System.out.print("Homework and labs: ");
    double hw = input.nextDouble();

    // Calculate the percentage distribution.
    midterm = midterm * 0.2;
    finalexam = finalexam * 0.2;
    prj = prj * 0.2;
    hw = hw * 0.4;

    // Add up to find total grade.
    double sum = midterm + finalexam + prj + hw;
    
    //Find out letter grade and display.
    if(sum > 89){
      System.out.println("Your final grade is: A");
    }
    else if(sum > 79 && sum < 90){
      System.out.println("Your final grade is: B");
    }
    else if(sum > 69 && sum < 80){
      System.out.println("Your final grade is: C");
    }
    else if(sum > 59 && sum < 70){
      System.out.println("Your final grade is: D");
    }
    else{
      System.out.println("Your final grade is: F");
    }

  }
}