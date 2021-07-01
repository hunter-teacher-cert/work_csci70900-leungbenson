// Pre-Work 7 - Arrays

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Array{
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
    System.out.println("Choose either to run Exercise 1,4, or 5: ");
    int choice = in.nextInt();
    if (choice == 1) {
      Exercise1();}
    else if (choice == 4) {
      Exercise4();}
    else if (choice == 5) {
      Exercise5();}
    else {
      System.out.println("You have made an invalid choice.");
      Exercise();
    }
  }
  
  //Exercise 1   The goal of this exercise is to practice encapsulation with some of the examples in this chapter.
  public static void Exercise1() {
    System.out.println("Exercise 1");  
    double[] numbers = {1.3, 6.4, 7.8, 10.4}; 
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(powArray(numbers)));
    int numValues = 8;
    int[] ranNum = randomArray(numValues);
    System.out.println(Arrays.toString(ranNum));
  }
  
  public static double[] powArray(double[] a){
    System.out.println("What power would you like to raise your array to: ");
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    for (int i = 0; i < a.length; i++) {
    a[i] = Math.pow(a[i], x);
    }
    return a;
  }
  /*
  public static int[] histogram(int[] b){
    
    
    int[] counts = new int[100];
    for (int score : scores) {
      counts[score]++;
    }
  }
  */
  
  
public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(100);
    }
    return a;
}
  /*Exercise 4  
   *Write a method called indexOfMax that takes an array of integers and returns the index of the largest element. 
   * Can you write this method using an enhanced for loop? Why or why not?
   * 
   * You can not write this method as an enhanced for loop because we need to refer to an index.
   * */

  public static void Exercise4() {
    System.out.println("Exercise 4");
    int numValues = 8;
    int[] ex4 = randomArray(numValues);
    System.out.println(Arrays.toString(ex4));
    System.out.println("The index of the highest number is the array is: " + indexOfMax(ex4));
    
    
  }
  
  public static int indexOfMax(int arr[]){
    int max = arr[0];
    int index = 0;
    for (int i=1; i<arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
            index = i;
        }
    }
    return index;
    
  }
  
  
  /*Exercise 5
   * Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, 
   * for each number from 0 to n - 1, whether the number is prime.
   * */
  public static void Exercise5() {
    System.out.println("Exercise 5");
    System.out.println("Pick a number: ");
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int[] arr = numbers(x);
    boolean[] prime = sieve(arr);
    // Print integere and whether they are prime or not
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(prime));
  }
  
  // Stores integers into array
  public static int[] numbers (int x){
    int num[] = new int[x];
    for (int i = 0; i<=x-1; i++){
      num[i]=i;
    }
    return num;
    
  }
  
  // Check for prime
   public static boolean isPrime(int n) 
   {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
   
   
 // Store integers into true/false on prime
   public static boolean[] sieve(int num[]){
     boolean[] p = new boolean[num.length];
     for (int i = 0; i < num.length; i++)
     {
       p[i] = isPrime(i);
     }
     return p;
  }
    
}