//5/Fib.java
//Collaborators: mlaks23	leungbenson	MichCS

import java.util.Scanner;

public class Fib {

//This is a function to find the nth Fibonacci number using a recursive method.


  public static int fib (int n) {
    
    // Base Case 
    if (n == 0) {   //This is the 0th term
      return 0;
    } //end of 0th term

    else if (n == 1) { // 1st term
      return 1;
    }//end of 1st term

    //Recurssive Reduction

    else if (n > 1); {
      return (fib(n - 1) + fib(n - 2));
    }// end of n > 1

    

   
  } //end of fib method


public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Choose a term number: ");
  int n = in.nextInt();

  //nth term is less than 0 or not valid
  while (n < 0) {
    System.out.print("Your number must be greater than or equal to 0.");
    System.out.print("Choose a term greater than or equal to 0: ");
    n = in.nextInt();
  }
  
  
  System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
  }  

}



