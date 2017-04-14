/**
  * file: Rectangle.java
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
  * Design a class named Rectangle to represent a rectangle. The class contains:
  * - 2 double data fields named width and height that specify the width and height
  * of the rectangle.  The defualts values are 1 for both width and height.
  * - A no-arg constructor that creates a default rectangle.
  * - A constructor that creates a rectangle with the specified width and height.
  * - A method named GetArea() that returns the area of this rectangle.
  * - A method named getPerimeter() that returns the perimeter.
  *
  * Draw the UML diagram for the class and then implement the class.
  */

class Rectangle{

  double height = 1;
  double width = 1;

  Rectangle(){
    // no-arg constructor
  }

  // constructor with specified width and height
  Rectangle(double newH, double newW){
    height = newH;
    width = newW;
  }

  // method which returns area of rectangle
  double getArea(){
    return width * height;
  }

  // method that returns perimeter of rectangle
  double getPerimeter(){
    return (2 * height) + (2 * width);
  }
  
}