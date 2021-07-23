  
import java.io.*;
import java.util.*;


public class Driver {
  public static void main(String[] args) {
	  BSTree t = new BSTree();

    t.seed();
    int value; 
    
    value = t.search(10); //search for 10 in tree
    System.out.println(value);

    value = t.search(15); //search for 15 in tree
    System.out.println(value);

    try{
      value = t.search(17); //search for 17 in tree
      System.out.println(value);
    }//end try
    catch (NullPointerException e) {
      System.out.println("The number searched is not in tree.");
    }//end catch

    
  }//end main
}//end class