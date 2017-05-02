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

  // All of the available options throughout the order
  static String[] fullorder = {"0 - Size", "1 - Regular or Decaf", "2 - Flavor",
    "3 - Coffee Type", "4 - Creamer/Milk", "5 - Sugar"};

  static String[] types = {"1 - Hot Coffee", "2 - Iced Coffee", "3 - Latte",
    "4 - Iced Latte", "5 - Macchiato", "6 - Iced Macchiato"};

  static String[] sizes = {"1 - Small", "2 - Medium", "3 - Large"};

  static String[] rOrD = {"1 - Regular", "2 - Decaf"};

  static String[] creamer = {"0 - No Creamer", "1 - Cream", "2 - Milk",
    "3 - Almond Milk", "4 - Skim Milk"};

  static String[] milk = {"1 - Whole Milk", "2 - Almond Milk", "3 - Skim Milk"};

  static String[] flavors = {"1 - French Vanilla", "2 - Hazelnut", "3 - Caramel",
    "4 - Mocha"};

  static String[] noyes = {"0 - No", "1 - Yes"};


  public static void main(String[] args){

    String[] order = new String[6];
    /*
     * order[0] = size
     * order[1] = reg or decaf
     * order[2] = flavor
     * order[3] = type
     * order[4] = creamer
     * order[5] = sugar
     */
  
    System.out.println("Hello welcome to the Coffee Shop!");
    System.out.println("What would you like to order?");    

    // Brings you through the ordering process in a series of methods
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

    int t = validInput(1, 6, types);

    // Insert coffee type into the order
    switch(t){
      case 1: order[3] = "Hot Coffee";
        break;
      case 2: order[3] = "Iced Coffee";
        break;
      case 3: order[3] = "Latte";
        break;
      case 4: order[3] = "Iced Latte";
        break;
      case 5: order[3] = "Macchiato";
        break;
      case 6: order[3] = "Iced Macchiato";
        break;
      default: order[3] = "Hot Coffee";
        break;
    }
    
    return order;
  }

  // Selecting a size
  public static String[] sizeSelection(String[] order){

    System.out.println(" ");
    System.out.println("Select a size");
    printArray(sizes);

    int s = validInput(1, 3, sizes);

    // Insert size into the order
    switch(s){
      case 1: order[0] = "Small";
        break;
      case 2: order[0] = "Medium";
        break;
      case 3: order[0] = "Large";
        break;
      default: order[0] = "Medium";
        break;
    }

    return order;
  }

  // Selecting Regular or Decaf
  public static String[] regDecaf(String[] order){

    System.out.println(" ");
    System.out.println("Would you like 1 - Regular or 2 - Decaf?");

    int rd = validInput(1, 2, rOrD);

    // Insert regular or decaf into the order
    switch(rd){
      case 1: order[1] = "Regular";
        break;
      case 2: order[1] = "Decaf";
        break;
      default: order[1] = "Regular";
        break;
    }

    return order;
  }

  // Selecting a creamer option
  public static String[] creamSelection(String[] order){
    
    // Create a double to store the measurement size
    double cmeasurement = 0;
    int c;

    /*
     * String is used to check if Hot/Iced Coffee is selected as cream options are 
     * different for those compared to a Latte or Macchiato 
     */
    String orderString = Arrays.toString(order);
    
    // Creamer selection only for Hot/Iced Coffee
    if(orderString.contains("Coffee")){
      System.out.println(" ");
      System.out.println("Would you like to add a creamer?");
      printArray(creamer);

      c = validInput(0, 4, creamer);

      // If creamer is chosen
      if(c > 0){
        System.out.println(" ");
        System.out.println("How many tablespoons would you like? (Limit 10)");
        System.out.println("Feel free to use decimals to be exact.");
      
        cmeasurement = validDouble(0.0, 10.0);

        // Insert creamer and measurement into order
        switch(c){
        case 1: order[4] = cmeasurement + " tablespoons of Cream";
          break;
        case 2: order[4] = cmeasurement + " tablespoons of Milk";
          break;
        case 3: order[4] = cmeasurement + " tablespoons of Almond Milk";
          break;
        case 4: order[4] = cmeasurement + " tablespoons of Skim Milk";
          break;
        default: order[4] = null;
          break;
        }
      }
    }

    // Creamer selection for Latte or Macchiato
    else{
      System.out.println(" ");
      System.out.println("What kind of milk would you like?");
      printArray(milk);

      c = validInput(1, 3, milk);

      switch(c){
        case 1: order[4] = "Whole Milk";
          break;
        case 2: order[4] = "Almond Milk";
          break;
        case 3: order[4] = "Skim Milk";
          break;
        default: order[4] = "Whole Milk";
          break;
      }
    }

    return order;
  }

  // Selecting sugar option
  public static String[] sugarSelection(String[] order){

    // First time selecting sugar or no sugar is selected
    if(order[5] == null){
      System.out.println(" ");
      System.out.println("Would you like any sugar?");
      System.out.println("0 - No or 1 - Yes");
    }

    // When editing order and sugar is already in use
    else{
      System.out.println(" ");
      System.out.println("Would you like to change your measurement of sugar?");
      System.out.println("0 - No (Remove Sugar) or 1 - Yes (Change measurement)");
    }

    int su = validInput(0, 1, noyes);

    // If sugar is chosen
    if(su == 1){
      System.out.println(" ");
      System.out.println("How many teaspoons of sugar would you like? (Limit 10)");
      System.out.println("Feel free to use decimals to be exact.");
      
      double smeasurement = validDouble(0, 10);

      // Insert sugar and measurement into order
      order[5] = smeasurement + " teaspoons of sugar";
    }

    // If sugar isn't chosen
    else{
      order[5] = null;
    }

    return order;
  }

  // Selecting a flavor
  public static String[] flavorSelection(String[] order){

    // First time selecting flavor or no flavor is selected
    if(order[2] == null){
      System.out.println(" ");
      System.out.println("Would you like to add a flavor?");
      System.out.println("0 - No or 1 - Yes");
    }

    // When editing order and a flavor is already selected
    else{
      System.out.println(" ");
      System.out.println("Would you like to change your flavor?");
      System.out.println("0 - No (Remove Flavor)");
      System.out.println("1 - Yes (Change Flavor)");
    }

    int af = validInput(0, 1, noyes);

    // If flavor is chosen
    if(af == 1){
      System.out.println(" ");
      System.out.println("Select a flavor");
      printArray(flavors);
      
      int f = validInput(1, 4, flavors);

      // Insert flavor into order
      switch(f){
      case 1: order[2] = "French Vanilla";
        break;
      case 2: order[2] = "Hazelnut";
        break;
      case 3: order[2] = "Caramel";
        break;
      case 4: order[2] = "Mocha";
        break;
      default: order[2] = null;
        break;
      }
    }

    // If flavor is not chosen
    else{
      order[2] = null;
    }

    return order;
  }

  // Finalize order
  public static void finalizeOrder(String[] order){

    // Output final order for confirmation
    System.out.println(" ");
    System.out.println("Your final order is:");
    printArray(order);

    System.out.println(" ");
    System.out.println("Is that correct?");
    System.out.println("0 - No or 1 - Yes");

    int finalize = validInput(0, 1, noyes);

    if(finalize == 1){
      System.out.println(" ");
      System.out.println("Thank you for choosing the Coffee Shop!");
      System.out.println("Enjoy your drink!");
      // Program ends
    }

    else{
      editOrder(order);
    }
  }

  // A method to check that user input is a valid option
  public static int validInput(int low, int high, String[] options){
    
    // While input is not an integer
    while(!input.hasNextInt()){
      System.out.println(" ");
      printArray(options);
      System.out.println("Please enter a valid number from the options provided above.");
      input.next();
    }

    int good = input.nextInt();

    // While int is not an available option
    while(good < low || good > high){
      System.out.println(" ");
      printArray(options);
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

    System.out.println(" ");
    System.out.println("What would you like to change?");
    printArray(fullorder);

    int edit = validInput(0, 5, fullorder);

    System.out.println(" ");

    // Output if there is user has nothing for that option currently
    if(order[edit] == null){
      System.out.println("You currently do not have anything selected for this.");
    }

    // Output to tell user what their current option
    else{
      System.out.println("Your current selection is " + order[edit]);
    }

    /*
     * order[0] = size
     * order[1] = reg or decaf
     * order[2] = flavor
     * order[3] = type
     * order[4] = creamer
     * order[5] = sugar
     */

    switch(edit){
      case 0: sizeSelection(order);
        break;
      case 1: regDecaf(order);
        break;
      case 2: flavorSelection(order);
        break;
      case 3: coffeeType(order);
        break;
      case 4: creamSelection(order);
        break;
      case 5: sugarSelection(order);
        break;
      default: finalizeOrder(order);
        break;
    }

    /*
     * String is used to check if Hot/Iced Coffee is selected as cream options are 
     * different for those compared to a Latte or Macchiato 
     */
    String orderString = Arrays.toString(order);

    if((orderString.contains("Coffee") && !(orderString.contains("tablespoons")) && !(order[4] == null))
      || (orderString.contains("Latte") && orderString.contains("tablespoons"))
      || (orderString.contains("Latte") && order[4] == null)
      || (orderString.contains("Macchiato") && orderString.contains("tablespoons"))
      || (orderString.contains("Macchiato") && order[4] == null)){

      System.out.println("You selected a new coffee type that has different cream specifications.");
      creamSelection(order);
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