  
import java.io.*;
import java.util.*;


public class Driver {
  public static void main(String[] args) {
	  BSTree t = new BSTree();
    /*

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
    */ 
    /*

    t.insert(10);
    t.insert(20);
    t.insert(5);
    t.insert(7);
    t.insert(8);
    t.insert(3); 
    t.insert(25); 
    t.insert(4);
    */

    t.insert(26);
    t.insert(20);
    t.insert(15);
    t.insert(22);
    t.insert(7);
    t.insert(16); 
    t.insert(17); 
    t.insert(19);
    t.insert(18);

    System.out.print("Pre-Order Traverse: ");
    t.preorderTraverse();

    System.out.print("Post-Order Traverse: ");
    t.postorderTraverse();

    System.out.print("In-Order Traverse: ");
    t.inorderTraverse();

    t.delete(20);
    System.out.print("Deleted 20: ");
    t.preorderTraverse();
    /*

    t.delete(7);
    System.out.print("Deleted 7: ");
    t.preorderTraverse();
    System.out.print("In-Order Traverse: ");
    t.inorderTraverse();

    t.delete(4);
    System.out.print("Deleted 4: ");
    t.preorderTraverse();
    */

    
  }//end main
}//end class