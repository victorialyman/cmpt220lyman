/**
  * file: Queue.java
  * author: Victoria Lyman 
  * course: CMPT 220
  * assignment: Lab 7
  * due date: April 25, 2017
  * version: 1
  *
  * This file contains a program to answer Problem 10.10 from
  * the Introduction to Java Programming textbook
  */

/**
  * Section 10.6 gives a class for Stack. Design a class named Queue for storing integers.
  * Like a stack, a queue holds elements. In a stack, the elements are retrieved in a
  * last-in first-out fashion. In a queue, the elements are retrieved in a first-in first-out fashion.
  * The class contains:
  * - An int[] data field named elements that stores the int values in the queue.
  * - A data field named size that stores the number of elements in the queue.
  * - A constructor that creates a Queue object with default capacity 8.
  * - The method enqueue(int v) that adds v into the queue.
  * - The method dequeue() that removes and returns the element from the queue.
  * - The method empty() that returns true if the queue is empty.
  * - The method getSize() that returns the size of the queue.
  *
  * Draw an UML diagram for the class. Implement the class with the initial array
  * size set to 8. The array size will be doubled once the number of the elements
  * exceeds the size. After an element is removed from the beginning of the array,
  * you need to shift all elements in the array one position the left.
  */

public class Queue{
  private int[] elements;
  private int size;
  public static final int capacity = 8;

  // Default constructor
  public Queue(){
    this (capacity);
  }

  // Constructor for given capacity
  public Queue(int capacity){
    elements = new int[capacity];
  }

  // Adds v into the queue
  public void Enqueue(int v){
    // Double the array size once the number of elements exceeds the size
    if (size >= elements.length){
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }

    elements[size++] = v;
  }

  // Removes and returns the element from the queue
  public int Dequeue(){

    // Save the first element before it is removed
    int removed = elements[0];

    // Create new array which removes the first element
    int[] temp = new int[elements.length - 1];
    System.arraycopy(elements, 1, temp, 0, elements.length-1);
    // Save new array as old array
    elements = temp;
    // Make size smaller
    size--;

    return removed;
  }

  // Returns true if the queue is empty
  public boolean empty(){
    return size == 0;
  }

  // Returns the size of the queue
  public int getSize(){
    return size;
  }
  
}