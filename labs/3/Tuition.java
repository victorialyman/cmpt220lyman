/**
  * file: Tuition.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 3
  * due date: February 21, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 5.7 from
  * the Introduction to Java Programming textbook. 
  */

/**
  * Suppose that the tuition for a university is $10,000 this year
  * and increases 5% every year. In one year, the tuition will be $10,500.
  * Write a program that computes the tuition in ten years and
  * the total cost of four years' worth of tuition after the tenth year.
  */

public class Tuition{
  public static void main(String[] args){

    // Tuition starts at $10,000.
    double tuition = 10000;
    
    /**
      * for loop
      *
      * allows code to be executed repeatedly for a specific iteration
      */

    // Increase tuition by 5% for 10 years.
    for(int y = 1; y < 11; y++){
      tuition = tuition * 1.05;
    }

    // Compute cost for 4 years of tuition after 10 years.
    double year10 = tuition * 4;

    System.out.println("The tuition for one year after 10 years is $" + tuition);
    System.out.println("The cost of 4 year tuition then would be $" + year10);
  }
}