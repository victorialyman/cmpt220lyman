/**
  * file: TestRectangle.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 6
  * due date: April 18, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 9.1 from
  * the Introduction to Java Programming textbook
  */

/**
  * Write a test program that creates two Rectangle objects
  * - one with width 4 and height 40
  * - the other with width 3.5 and height 35.9
  * Display the width, height, area, and perimeter of each rectangle in this order.
  */

public class TestRectangle{
  public static void main(String[] args){

    // Create two rectangles
    Rectangle rectangle1 = new Rectangle(40.0, 4.0);
    Rectangle rectangle2 = new Rectangle(35.9, 3.5);

    // Output width, height, area, and perimeter for each
    System.out.println("Rectangle #1:");
    System.out.println("Width of Rectangle #1 is " + rectangle1.width);
    System.out.println("Height of Rectangle #1 is " + rectangle1.height);
    System.out.println("Area of Rectangle #1 is " + rectangle1.getArea());
    System.out.println("Perimeter of Rectangle #1 is " + rectangle1.getPerimeter());

    System.out.println("Rectangle #2:");
    System.out.println("Width of Rectangle #2 is " + rectangle2.width);
    System.out.println("Height of Rectangle #2 is " + rectangle2.height);
    System.out.println("Area of Rectangle #2 is " + rectangle2.getArea());
    System.out.println("Perimeter of Rectangle #2 is " + rectangle2.getPerimeter());

  }
}