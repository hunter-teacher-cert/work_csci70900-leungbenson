// Chapter 6  Value methods

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Methods{
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    System.out.println("Choose either to run Exercise 2,3, or 8: ");
    int choice = in.nextInt();
    if (choice == 2) {
      Exercise2();}
    else if (choice == 3) {
      Exercise3();}
    else if (choice == 8) {
      Exercise8();}
    else {
      System.out.println("You have made an invalid choice.");
    }
  }
  
  /* Exercise 2  
   * Write a method named isDivisible that takes two integers, n and m, and that returns true 
   * if n is divisible by m, and false otherwise.
   */
  
  public static void Exercise2() {
    
    System.out.println("Enter two integers with a space in between: ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    boolean result = isDivisible (n,m);
    System.out.printf(n + " is ");
    if (result) {
      System.out.printf("divisible ");
    }
    else {
      System.out.printf("not divisible ");
    }
    System.out.printf("by " + m + ".");
         
  }
     
  public static boolean isDivisible(int n, int m){
    return n%m==0;
  }
  
  // Exercise 3 - Forming a Triangle
  
  public static void Exercise3() {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter 3 integer sides of a triangle with spaces in between each integer: ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    boolean result = isTriangle(a,b,c);
    System.out.printf("It is ");
    if (!result){
      System.out.printf("possible ");
    }
    else {
      System.out.printf("not possible ");
    }
    System.out.println("to form a triangle with sides of " + a + ", " + b + ", and " + c + ".");
  }
  
  public static boolean isTriangle(int a, int b, int c) {
    return a+b<c && a+c<b && b+c<a;
  }
  
  // Exercise 8 - Ackermann function  
  
  public static void Exercise8() {
    System.out.println("Choose 2 integers greater or equal to 0: ");
    Scanner in = new Scanner(System.in);
    int m = in.nextInt();
    int n = in.nextInt();
    
    if (n<0 || m<0){
      System.out.println("At least one of the numbers entered is invalid.");
      Exercise8();
    }
    else {
      int ans = ack(m,n); 
      System.out.println("The solution is: " + ans);
        }
  }
  
  public static int ack(int m, int n) {
    if (m==0){
      return n+1;
    }
    else if(n==0){      
      return ack(m-1,1);
    }
    else {
      return ack(m-1, ack(m,n-1));
    }
  }
}
  
  
  
    



  
    