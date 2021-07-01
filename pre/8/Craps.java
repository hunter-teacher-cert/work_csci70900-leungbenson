// Pre-Work 8 - Game of Craps

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Craps{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    char run = 'y';
    while(run == 'y')
    {
    Game();
    System.out.print("Would you like to run the program again? <y/n>");
    run = in.nextLine().charAt(0);
    }
  }
  
  public static void Game(){
    
  }
  /*
  public static int roll (int n){
    
  }
  
  public static String shoot (){
    
  }
  
  public static String round (){
    
  }
  */
}
  