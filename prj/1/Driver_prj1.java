/**
  * file: Driver_prj1.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Project 1
  * due date: March 28, 2017
  * version: 1
  *
  * This file contains a program for Project 1: Convolution.
  */

import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // write your code here

    // User enters the size of vector 1 and 2
    int v1 = input.nextInt();
    int v2 = input.nextInt();

    //Create two arrays with the new values
    double[] vFirst = new double[v1];
    double[] vSecond = new double[v2];

    // Add user given elements to the arrays
    int i = 0;
    while(i < vFirst.length){
      vFirst[i] = input.nextInt();
      i++;
    }
    int j = 0;
    while(j < vSecond.length){
      vSecond[j] = input.nextInt();
      j++;
    }

    convolveVectors(vFirst, vSecond);

    //double[] vResult = new double[(vFirst.length + vSecond.length) - 1];

    //printArray(vResult);
    
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    // write your code here

    for(int idx = 0; idx < vResult.length; idx++){
      
      int shift = 0;
      double sum = 0.0;
      vResult[idx] = 0;

      while(shift < vFirst.length){ //Avoids out of bounds index

        for(shift = 0; shift < vFirst.length; shift++){
        
          if((idx - shift > 0) && (idx - shift < vFirst.length)){
              sum = sum + (vFirst[idx - shift] * vSecond[shift]);
          }

          else{
            sum = sum + 0.0;
          }
        }

      }

      vResult[idx] = sum;
    }

    printArray(vResult);

    return vResult;  
  }

  // Method to print an array that I use in every program where I need to print an array
  public static void printArray(double[] array){

    for(int m = 0; m < array.length; m++){

      System.out.print(Math.round(array[m]) + " ");

    }
  }

}