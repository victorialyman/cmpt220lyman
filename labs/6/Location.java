/**
  * file: Location.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 6
  * due date: April 18, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 9.13 from
  * the Introduction to Java Programming textbook
  */

/**
  * Design a class named Location for locating a maximal value 
  * and its lovation in a two-dimensional array.  The class contains public
  * data fields row, column, and maxValue that store the maximal value and
  * its indices in a two-dimensional array with row and column as int types
  * and maxValue as a double type.
  */

class Location{
  int row;
  int column;
  double maxValue;

  Location(double[][] a){

    // Set max at first element
    maxValue = a[0][0];

    // Set row and column to match
    row = 0;
    column = 0;

    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[i].length; j++){
        if(a[i][j] > maxValue){ //If the current element is larger than saved Max

          // Save current element as new Max
          maxValue = a[i][j];

          // Save the location of the new Max
          row = i;
          column = j;
        }
      }
    }
    
  }
}