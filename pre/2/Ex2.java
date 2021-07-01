/** 3.12 Exercise 2
  * Write a program that converts a temperature from Celsius to Fahrenheit.
  * It should (1) prompt the user for input, (2) read a double value from the keyboard, 
  * (3) calculate the result, and (4) format the output to one decimal place. 
  * For example, it should display "24.0 C = 75.2 F".*/

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Ex2{
  public static void main(String[] args){
    
    System.out.println("Enter a temperature in Celcius:");
    
    Scanner in = new Scanner(System.in);
    
    double celcius = in.nextDouble();
    
    final double fah = celcius * 9.0 / 5 + 32; //Formula to convert from C to F
    
    // Prints out conversion to one decimal place
    
    System.out.printf("%.1f C = %.1f F\n", celcius, fah);
        
  }
}