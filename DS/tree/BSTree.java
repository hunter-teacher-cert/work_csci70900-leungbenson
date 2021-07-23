  
import java.io.*;
import java.util.*;

public class BSTree {
  private TreeNode root;

  public BSTree(){
	  root = null;
  }//end BSTree()

  public int search(int key){
    TreeNode current = root;

    while(current != null){
      int currentValue = current.getData(); //initalize current currentValue

      if (currentValue == key){//if the data matches
          return currentValue;
      } 
      else if (currentValue < key){ //if search number is greater than current value
        current = current.getRight();
      } 
      else {
        current = current.getLeft();
      }//end else

    }//end while
    throw new NullPointerException();

 
  }//end search

  public void seed(){
    TreeNode t;

    t = new TreeNode(10);
    root = t;
    t = new TreeNode(5);
    root.setLeft(t);
    t = new TreeNode(20);
    root.setRight(t);

    root.getLeft().setRight( new TreeNode(8));

    t = new TreeNode(15);
    root.getRight().setLeft(t);

    t = new TreeNode(22);
    root.getRight().setRight(t);
	
	}//end seed()
    
    
}//end class