/**
  * file: TestQueue.java
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
  * Write a test program that adds 20 numbers from 1 to 20 into the queue 
  * and removes these numbers and displays them.
  */

public class TestQueue{
  public static void main(String[] args){
    Queue queue = new Queue();

    // Adds 1 - 20 to the queue
    for(int i = 1; i < 21; i++){
      queue.Enqueue(i);
    }

    // Removes and displays the number 
    while(!queue.empty()){
      System.out.print(queue.Dequeue() + " ");
    }
  }
}