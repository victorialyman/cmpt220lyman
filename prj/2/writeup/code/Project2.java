/**
  * file: Project2.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Project 2
  * due date: May 2, 2017
  * version: 3
  *
  * This file contains a program for Project 2.
  */

/**
  * This program is a coffee ordering system which outputs a series of
  * strings with options for the user to select.  The user inputs integers
  * which correspond to option they would like.  The options are saved to
  * an array of strings to be displayed at the end of the ordering process.
  * The user has the option to edit their order before it is finalized.
  * When the user is happy with their order they can finalize it and the
  * program ends.
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

  static String[] creamer = {"1 - Cream", "2 - Milk",
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


  /**
    * coffeeType
    *
    * This function allows the user to select a coffee type from the options
    * outputted and saves the option to the order array.
    *
    * Parameters:
    *   order: used to save the user's coffee type for display later
    */
  public static void coffeeType(String[] order){

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
  }


  /**
    * sizeSelection
    *
    * This function allows the user to select a size from the options outputted
    * and saves the option to the order array.
    *
    * Parameters:
    *   order: used to save the user's size selection for display later
    */
  public static void sizeSelection(String[] order){

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
  }


  /**
    * regDecaf
    *
    * This function allows the user to select Regular or Decaf coffee
    * and saves the option to the order array.
    *
    * Parameters:
    *   order: used to save the user's selection of Regular or Decaf
    *   for display later
    */
  public static void regDecaf(String[] order){

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
  }


  /**
    * creamSelection
    *
    * This function allows the user to select a creamer from the options outputted
    * and saves the option to the order array.
    *
    * Parameters:
    *   order: used to save the user's creamer selection for display later
    */
  public static void creamSelection(String[] order){
    System.out.println(" ");
    
    /*
     * String is used to check if Hot/Iced Coffee is selected as cream options are 
     * different for those compared to a Latte or Macchiato 
     */
    String orderString = Arrays.toString(order);
    
    // Creamer selection only for Hot/Iced Coffee
    if(orderString.contains("Coffee")){

      // First time selecting cream or no cream selected
      if(order[4] == null){
        System.out.println("Would you like to add a creamer?");
        System.out.println("0 - No or 1 - Yes");
      }

      // User is changing creamer option
      else{
        System.out.println("Would you like to change your creamer and/or measurement size?");
        System.out.println("0 - No (Remove creamer) or 1 - Yes (Change)");
      }

      int ac = validInput(0, 1, noyes);

      // If creamer is chosen
      if(ac == 1){
        System.out.println(" ");
        System.out.println("Select a creamer: ");
        printArray(creamer);

        int c = validInput(1, 4, creamer);

        System.out.println(" ");
        System.out.println("How many tablespoons would you like? (Limit 10)");
        System.out.println("Feel free to use decimals to be exact.");
      
        // Create a double to store measurement
        double cmeasurement = validDouble(0.0, 10.0);

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

      // No creamer is selected
      else{
        order[4] = null;
      }
    }

    // Creamer selection for Latte or Macchiato
    else{
      System.out.println(" ");
      System.out.println("What kind of milk would you like?");
      printArray(milk);

      int c = validInput(1, 3, milk);

      // Insert milk selection into order
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
  }


   /**
    * sugarSelection
    *
    * This function allows the user to select the amount of sugar they would like
    * and saves the measurement to the order array.
    *
    * Parameters:
    *   order: used to save the user's sugar measurement for display later
    */
  public static void sugarSelection(String[] order){
    System.out.println(" ");

    // First time selecting sugar or no sugar is selected
    if(order[5] == null){
      System.out.println("Would you like any sugar?");
      System.out.println("0 - No or 1 - Yes");
    }

    // When editing order and sugar is already in use
    else{
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
  }


   /**
    * flavorSelection
    *
    * This function allows the user to select a flavor from the options outputted
    * and saves the option to the order array.
    *
    * Parameters:
    *   order: used to save the user's flavor selection for display later
    */
  public static void flavorSelection(String[] order){
    System.out.println(" ");

    // First time selecting flavor or no flavor is selected
    if(order[2] == null){
      System.out.println("Would you like to add a flavor?");
      System.out.println("0 - No or 1 - Yes");
    }

    // When editing order and a flavor is already selected
    else{
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
  }


   /**
    * finalizeOrder
    *
    * This function prints out the user's final order and allows for them
    * the option to edit it or finalize it.
    *
    * Parameters:
    *   order: used to display the user's full order
    */
  public static void finalizeOrder(String[] order){

    // Output final order for confirmation
    System.out.println(" ");
    System.out.println("Your order is:");
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

    // If order is not correct user is brought to edit options
    else{
      editOrder(order);
    }
  }


  /**
    * validInput
    *
    * This function takes the user's input and validates that it is an available
    * option from the current selections available.
    *
    * Parameters:
    *   low: the first option available for selection
    *   high: the last option available for selection
    *   options: displays the options the user currently has available for selection
    *
    * Return value: the user input that is a valid selection option
    */
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


  /**
    * validDouble
    *
    * This function takes the user's input and validates that it is an available
    * option from the current selections available.
    *
    * Parameters:
    *   low: the smallest option available
    *   high: the largest option available
    *
    * Return value: the user input that is a valid selection option
    */
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


  /**
    * editOrder
    *
    * This function allows the user to edit their current order if they
    * messed up while ordering or if they changed their mind.
    *
    * Parameters:
    *   order: used to display the user's current order selection
    */
  public static void editOrder(String[] order){
    int editing = 1;

    // Continues editing as long as user chooses to edit
    while(editing == 1){
      System.out.println(" ");
      System.out.println("What would you like to change?");
      printArray(fullorder);

      int edit = validInput(0, 5, fullorder);

      System.out.println(" ");

      // Output if the user has nothing for that option currently
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
       * String is used to check what coffee type is selected as cream options are 
       * different for Hot/Iced Coffee vs Latte/Macchiato
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

      System.out.println(" ");
      System.out.println("Would you like to change anything else?");
      System.out.println("0 - No or 1 - Yes");

      editing = validInput(0, 1, noyes);
    }

    finalizeOrder(order);
  }


  /**
    * printArray
    *
    * This functions prints out the current selection options or the user's
    * full order depending on where in the program it is being called.
    *
    * Parameters:
    *   array: the things that will be displayed for the user
    */
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