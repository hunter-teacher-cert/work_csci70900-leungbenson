// Pre-Work 6 - Loops

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Loops{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    char run = 'y';
    while(run == 'y')
    {
    Exercise();
    System.out.print("Would you like to run the program again? <y/n>");
    run = in.nextLine().charAt(0);
    }
  }
  
  public static void Exercise(){
    Scanner in = new Scanner(System.in);
    System.out.println("Choose either to run Exercise 3,4, or 5: ");
    int choice = in.nextInt();
    if (choice == 3) {
      Exercise3();}
    else if (choice == 4) {
      Exercise4();}
    else if (choice == 5) {
      Exercise5();}
    else {
      System.out.println("You have made an invalid choice.");
      Exercise();
    }
  }
  
  /*Exercise 3
   * In Exercise 9 we wrote a recursive version of power, which takes a double x and an integer n and returns x^n. 
   * Now write an iterative method to perform the same calculation.
   * */
  
  public static void Exercise3() {
    Scanner in = new Scanner(System.in);
    System.out.println("Choose a number, x, and an integer, n, to receive x^n: ");
    double x = in.nextDouble();
    int n = in.nextInt();
    double pow = 1.0;
    for (int i = 1;i <= n; i++){
      pow *= x;
    }
    System.out.printf("The answer is : %.2f", pow);
    System.out.println();
    
      
  }
  /* Exercise 4
   * Section 6.7 presents a recursive method that computes the factorial function. 
   * Write an iterative version of factorial.
   * */
  
  public static void Exercise4() {
    System.out.println("Exercise 4");
    Scanner in = new Scanner(System.in);
    System.out.println("Choose an integer, n, to receive n!: ");
    int n = in.nextInt();
    System.out.println(n + "! is " + fact(n));
  }
  
  //Factorial Method
  public static int fact (int n){
    int ans = 1;
    for (int i = 1;i <= n; i++){
      ans = ans*i;
    }
    return ans;
  }
    
  // Exercise 5 - Calculate e^x
  public static void Exercise5() {
    System.out.println("Choose a number, x, and an integer, n, to add the first n terms of e^x: ");
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int n = in.nextInt();
    System.out.println(myexp(x,n));
    
  }
  
  public static double myexp (int x, int n){
    int sol;
    for (int i=0; i<=n; i++){
      sol = fact(x^i)/fact(i);
      sol+= x;
      System.out.println(sol);
    }
    return 1;
  }
      
      
    
}
  
    

    
    
    
 
