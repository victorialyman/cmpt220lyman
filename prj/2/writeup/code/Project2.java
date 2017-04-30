/**
  * file: Project2.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Project 2
  * due date: May 2, 2017
  * version: 1
  *
  * This file contains a program for Project 2.
  */

import java.util.Scanner;
import java.util.Arrays;

public class Project2{

  static Scanner input = new Scanner(System.in);

  // All of the available options
  static String[] types = {"1 - Hot Coffee", "2 - Iced Coffee", "3 - Latte",
    "4 - Iced Latte", "5 - Macchiato", "6 - Iced Macchiato"};

  static String[] sizes = {"1 - Small", "2 - Medium", "3 - Large"};

  static String[] rOrD = {"1 - Regular", "2 - Decaf"};

  static String[] creamer = {"0 - No Creamer", "1 - Cream", "2 - Milk",
    "3 - Almond Milk", "4 - Skim Milk"};

  static String[] milk = {"1 - Whole Milk", "2 - Almond Milk", "3 - Skim Milk"};

  static String[] flavors = {"1 - French Vanilla", "2 - Hazelnut", "3 - Caramel",
    "4 - Mocha"};


  public static void main(String[] args){

    String[] order = new String[6];
    /*
     * order[0] = type
     * order[1] = size
     * order[2] = reg or decaf
     * order[3] = creamer
     * order[4] = sugar
     * order[5] = flavor
     */
  
    System.out.println("Hello welcome to the Coffee Shop!");
    System.out.println("What would you like to order?");    

    coffeeType(order);
    sizeSelection(order);
    regDecaf(order);
    creamSelection(order);
    sugarSelection(order);
    flavorSelection(order);
    finalizeOrder(order);

  }

  // Selecting a coffee type
  public static String[] coffeeType(String[] order){

    printArray(types);
    System.out.println("Type a number corresponding to the drink you would like:");

    int t = validInput(1, 6);

    // Insert coffee type into the order
    switch(t){
      case 1: order[0] = "Hot Coffee";
        break;
      case 2: order[0] = "Iced Coffee";
        break;
      case 3: order[0] = "Latte";
        break;
      case 4: order[0] = "Iced Latte";
        break;
      case 5: order[0] = "Macchiato";
        break;
      case 6: order[0] = "Iced Macchiato";
        break;
      default: order[0] = null;
        break;
    }
    
    return order;
  }

  // Selecting a size
  public static String[] sizeSelection(String[] order){

    System.out.println(" ");
    System.out.println("Select a size");
    printArray(sizes);

    int s = validInput(1, 3);

    // Insert size into the order
    switch(s){
      case 1: order[1] = "Small";
        break;
      case 2: order[1] = "Medium";
        break;
      case 3: order[1] = "Large";
        break;
      default: order[1] = null;
        break;
    }

    return order;
  }

  // Selecting Regular or Decaf
  public static String[] regDecaf(String[] order){

    System.out.println(" ");
    System.out.println("Would you like 1 - Regular or 2 - Decaf?");

    int rd = validInput(1, 2);

    // Insert regular or decaf into the order
    switch(rd){
      case 1: order[2] = "Regular";
        break;
      case 2: order[2] = "Decaf";
        break;
      default: order[2] = null;
        break;
    }

    return order;
  }

  // Selecting a creamer option
  public static String[] creamSelection(String[] order){
    double cmeasurement = 0;
    int c;

    String orderString = Arrays.toString(order);
    
    // Selection only for Hot/Iced Coffee
    if(orderString.contains("Hot Coffee") || orderString.contains("Iced Coffee")){
      System.out.println(" ");
      System.out.println("Would you like to add a creamer?");
      printArray(creamer);

      c = validInput(0, 4);

      // If creamer is chosen
      if(c > 0){
        System.out.println(" ");
        System.out.println("How many tablespoons would you like? (Limit 10)");
        System.out.println("Feel free to use decimals to be exact.");
      
        cmeasurement = validDouble(0.0, 10.0);

        // Insert creamer and measurement into order
        switch(c){
        case 1: order[3] = cmeasurement + " tablespoons of Cream";
          break;
        case 2: order[3] = cmeasurement + " tablespoons of Milk";
          break;
        case 3: order[3] = cmeasurement + " tablespoons of Almond Milk";
          break;
        case 4: order[3] = cmeasurement + " tablespoons of Skim Milk";
          break;
        default: order[3] = null;
          break;
        }
      }
    }

    // Selection for Latte or Macchiato
    else{
      System.out.println(" ");
      System.out.println("What kind of milk would you like?");
      printArray(milk);

      c = validInput(1, 3);

      switch(c){
        case 1: order[3] = "Whole Milk";
          break;
        case 2: order[3] = "Almond Milk";
          break;
        case 3: order[3] = "Skim Milk";
          break;
        default: order[3] = null;
          break;
      }
    }

    return order;
  }

  // Selecting sugar option
  public static String[] sugarSelection(String[] order){
    System.out.println(" ");
    System.out.println("Would you like any sugar?");
    System.out.println("0 - No or 1 - Yes");

    int su = validInput(0, 1);

    // If sugar is chosen
    if(su == 1){
      System.out.println(" ");
      System.out.println("How many teaspoons of sugar would you like? (Limit 10)");
      System.out.println("Feel free to use decimals to be exact.");
      
      double smeasurement = validDouble(0, 10);

      // Insert sugar and measurement into order
      order[4] = smeasurement + " teaspoons of sugar";
    }

    // If sugar isn't chosen
    else{
      order[4] = null;
    }

    return order;
  }

  // Selecting a flavor
  public static String[] flavorSelection(String[] order){
    System.out.println(" ");
    System.out.println("Would you like to add a flavor?");
    System.out.println("0 - No or 1 - Yes");

    int af = validInput(0, 1);

    // If flavor is chosen
    if(af == 1){
      System.out.println("Select a flavor");
      printArray(flavors);
      
      int f = validInput(1, 4);

      // Insert flavor into order
      switch(f){
      case 1: order[5] = "French Vanilla";
        break;
      case 2: order[5] = "Hazelnut";
        break;
      case 3: order[5] = "Caramel";
        break;
      case 4: order[5] = "Mocha";
        break;
      default: order[5] = null;
        break;
      }
    }

    else{
      order[5] = null;
    }

    return order;
  }

  // Finalize order
  public static void finalizeOrder(String[] order){

    System.out.println(" ");
    System.out.println("Your final order is:");
    printArray(order);

    System.out.println(" ");
    System.out.println("Is that correct?");
    System.out.println("1 - Yes or 2 - No");

    int finalize = validInput(1, 2);

    if(finalize == 1){
      System.out.println("Thank you for choosing the Coffee Shop!");
      System.out.println("Enjoy your drink!");
    }

    else{
      editOrder(order);
    }
  }

  // A method to check that user input is a valid option
  public static int validInput(int low, int high){
    
    // While input is not an integer
    while(!input.hasNextInt()){
      System.out.println("Please enter a valid number from the options provided above.");
      input.next();
    }

    int good = input.nextInt();

    // While int is not an available option
    while(good < low || good > high){
      System.out.println("Please enter a valid number from the options provided above.");
      good = input.nextInt();
    }

    return good;
  }

  // Same as validInput method but to check against doubles for sugar/cream measurement
  public static double validDouble(double low, double high){
    
    // While input is not a double
    while(!input.hasNextDouble()){
      System.out.println("Please enter a measurement between 0 and 10.");
      input.next();
    }

    double good = input.nextDouble();

    // While double is negative or greater than 10
    while(good < low || good > high){
      System.out.println("Please enter a measurement between 0 and 10.");
      good = input.nextDouble();
    }

    return good;
  }

  // Method to edit order when user messed up
  public static void editOrder(String[] order){
    System.out.println("What would you like to change?");
    System.out.println("0 - Coffee Type");
    System.out.println("1 - Size");
    System.out.println("2 - Regular or Decaf");
    System.out.println("3 - Cream");
    System.out.println("4 - Sugar");
    System.out.println("5 - Flavor");

    int edit = validInput(0, 5);

    System.out.println(" ");

    if(order[edit] == null){
      System.out.println("You currently do not have anything selected for this.");
    }

    else{
      System.out.println("Your current selection is " + order[edit]);
    }

    switch(edit){
      case 0: coffeeType(order);
        break;
      case 1: sizeSelection(order);
        break;
      case 2: regDecaf(order);
        break;
      case 3: creamSelection(order);
        break;
      case 4: sugarSelection(order);
        break;
      case 5: flavorSelection(order);
        break;
      default: finalizeOrder(order);
        break;
    }

    finalizeOrder(order);
  }

  // Method to print various arrays of strings throughout the program
  public static void printArray(String[] array){

    for(int i = 0; i < array.length; i++){
      
      // Print nothing if there is no option
      if(array[i] == null){
        System.out.print("");
      }

      else{
        System.out.println(array[i]);
      }
    }
  }

}