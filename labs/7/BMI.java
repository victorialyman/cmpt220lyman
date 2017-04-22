/**
  * file: BMI.java
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
  * Add the following new constructor in the BMI class:
  * * Construct  a BMI with the specified name, age, weight, feet, and inches *
  * public BMI(String name, int age, double weight, double feet, double inches)
  */

public class BMI{
  private String name;
  private int age;
  private double weight;
  private double feet;
  private double inches;
  // Feet and inches must eventually be combined to make complete height
  public static final double kilogramsPerPound = 0.45359237;
  public static final double metersPerInch = 0.0254;

  public BMI(String name, int age, double weight, double feet, double inches){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.feet = feet;
    this.inches = inches;
  }

  // Calculate and return BMI
  public double getBMI(){
    // Convert feet to inches and combine with inches to get full height
    double height = (feet * 12) + inches;
    double bmi = weight * kilogramsPerPound / ((height * metersPerInch) * (height * metersPerInch));

    return Math.round(bmi * 100) / 100.0;
  }

  // Display BMI status
  public String getStatus() {
    double bmi = getBMI();
    if(bmi < 18.5){
      return "Underweight";
    }
    else if(bmi < 25){
      return "Normal";
    }
    else if(bmi < 30){
      return "Overweight";
    }
    else{
      return "Obese";
    }
  }

  // Display name 
  public String getName(){
    return name;
  }

}