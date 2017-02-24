/**
  * file: TemperatureConversion.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 4
  * due date: February 28, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 6.8 from
  * the Introduction to Java Programming textbook
  */

/**
  * Write a class that contains the following two methods:
  * public static double celsiusToFahrenheit(double celsius)
  * public static double fahrenheitToCelsius(double fahrenheit)
  *
  * The formula for the conversion is
  * fahrenheit = (9.0 / 5) * celsius + 32
  * celsius = (5.0 / 9) * (fahrenheit - 32)
  */

import java.text.DecimalFormat;

public class TemperatureConversion{
  public static void main(String[] args){

    // Table header
    System.out.println("Celsius      Fahrenheit      |      Fahrenheit      Celsius");
    System.out.println("---------------------------------------------------------------");

    // Terminate number after 2 decimal places.
      DecimalFormat df = new DecimalFormat("#.00");

    //  Display conversions starting at 40C and 120F
    for(double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0; celsius--, fahrenheit =+ 10){
      System.out.println(
        celsius + "         " + df.format(celsiusToFahrenheit(celsius)) + "          |        " + 
        fahrenheit + "         " + df.format(fahrenheitToCelsius(fahrenheit)));
    }

  }

  public static double celsiusToFahrenheit(double celsius){
    // Celsius to Fahrenheit conversion
    return (9.0 / 5) * celsius + 32;
  }

  public static double fahrenheitToCelsius(double fahrenheit){
    // Fahrenheir to Celsius conversion
    return (5.0 / 9) * (fahrenheit - 32);
  }
}