/**
  * file: SquareNumbers.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 7
  * due date: April 25, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 10.17 from
  * the Introduction to Java Programming textbook
  */

/**
  * Find the first ten square numbers that are greater than Long.MAX_VALUE.
  * A square number is a number in the form of n^2. For example, 4, 9, and 16
  * are square numbers. Find an efficient approach to run your program fast.
  */

import java.math.*;

public class SquareNumbers{
  public static void main(String[] args){

    // Create BigInteger to represent Long.MAX_VALUE
    BigInteger longMaxValue = new BigInteger("9223372036854775807");

    // how the heck do i square root a biginteger or a long
    // when u figure it out please put it here
    // ^ I was gonna get rid of those but I figured you would enjoy them
    long sqrtLongMax = (long) Math.sqrt(Long.MAX_VALUE);


    // Create BigIntegers to check against Long.MAX_VALUE
    BigInteger n;
    n = BigInteger.valueOf(sqrtLongMax);
    BigInteger nsquared = n.multiply(n);

    // Create BigInteger to increase n
    BigInteger increase = new BigInteger("1");

    // Compare the two values
    int compare = nsquared.compareTo(longMaxValue);

    while(compare < 1){ //While n^2 < Long.MAX_VALUE
      // Continually make n and n^2 larger
      n = n.add(increase);
      nsquared = n.multiply(n);
      compare = nsquared.compareTo(longMaxValue);
    }

    if(compare == 1){
      // Output n^2 > Long.MAX_VALUE and next 10
      for(int i = 1; i < 11; i++){
        System.out.println("#" + i + " " + nsquared);
        n = n.add(increase);
        nsquared = n.multiply(n);
      }
    }

  }
}