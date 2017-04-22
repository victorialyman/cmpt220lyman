/**
  * file: TestBMI.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 7
  * due date: April 25, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 10.2 from
  * the Introduction to Java Programming textbook
  */

/**
  * The problem did not ask for this but here is a test program
  * for the new BMI class.
  */

public class TestBMI{
  public static void main(String[] args){

    // Same example from textbook but 70 inches converted to 5foot10
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 5, 10);
    System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " 
      + bmi1.getStatus());

    // Just for fun ;)
    // I don't know my actual weight this is a guess
    BMI myBMI = new BMI("Victoria Lyman", 20, 115, 5, 1);
    System.out.println("The BMI for " + myBMI.getName() + " is " + myBMI.getBMI() + " "
      + myBMI.getStatus());
  }
}