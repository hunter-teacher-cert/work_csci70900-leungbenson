  
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

  public void insert(int key){

    TreeNode newNode = new TreeNode(key);

    //if the tree is empty
    //manually insert the new node as the root

    if (root == null){
      root = newNode;
      return;
    }

    TreeNode front = root;
    TreeNode trailer = root;

    while(front != null){
      int frontValue = front.getData(); 

      if (frontValue == key){ //key is already in tree
          return ;
      } 
      else if (frontValue < key){ 
        trailer = front;
        front = front.getRight();
      } 
      else {
        trailer = front;
        front = front.getLeft();
      }//end else

    }//end while
    // at this point, front points to trailer, but trailer points to the node that's 
    // before (above) where the new node goes
    
    if (key > trailer.getData()){
      trailer.setRight(newNode); //insert on right
    }
    else {
      trailer.setLeft(newNode); //insert on left
    }


 
  }//end insert

  public void delete(int key){

    //if empty tree, nothing to delete
    if (root == null){
      return;
    }

    //find the node that we want to delete
    //and the node above it using piggybacking
    TreeNode front = root;
    TreeNode trailer = root;

    //do piggyback loop until we either find the node or null
    //if the key isn't present
    while(front != null  && front.getData() != key){

      if (front.getData() < key){ 
        trailer = front;
        front = front.getRight();
      } 
      else {
        trailer = front;
        front = front.getLeft();
      }//end else

    }//end while

    // if the key wasn't in the tree
    if (front == null){
      return;
    }

    //front points to the node we want to delete
    //and trailer points to the one above it

    //case 1 -- the node we want to delete is a leaf
    if (front.getLeft() == null && 
        front.getRight() == null){
      //repoint front's parent to null
      if(front.getData() > trailer.getData()){
        trailer.setRight(null);
      }
      else if (front.getData() < trailer.getData()){
        trailer.setLeft(null);
      }
      else {
        root = null; //if root is being deleted with no children
      }
    }

    //case 2 -- front has one child

    //when left is not empty and right is empty
    else if (front.getLeft() != null  && front.getRight() == null){
      //repoint front's parent to front's child
      //if (front.getRight().getData() > front.getData())
      //if(front.getLeft() > trailer.getData())
        trailer.setRight(front.getLeft());
      //else  
        //trailer.setLeft(front.getLeft());
    }

    //when right is not empty and left is empty
    else if (front.getRight() != null  && front.getLeft() == null){
      //repoint front's parent to front's child
      //if (front.getRight().getData() > front.getData())
        //trailer.setRight(front.getRight());
      //else
        trailer.setRight(front.getLeft());
    }

    //case 3 -- front has two children
    else{
      //find the node with the largest value on front's left subtree
      TreeNode max = front.getLeft();
      
      // While there is a greater number (something on the right)
      while (max.getRight() != null){
        max = max.getRight();
      }
      
      //and replace front with it
      delete(max.getData()); //delete the data
      front.setData(max.getData()); //sets front to new value




      
     
        
      }
       

 
  }//end delete
  
  private void preorderTraverse(TreeNode current){
    if (current == null){
      return;
    }

    //process current node
    //current.setData(2*current.getData()); //doubles the tree 
    System.out.print(current.getData() + ", ");

    //recursively print out left subtree
    preorderTraverse(current.getLeft());

    //recursively print out right subtree
    preorderTraverse(current.getRight());

  }//end preorderTraverse(Node)

  public void preorderTraverse(){
    preorderTraverse(root);
    System.out.println();

  }//end preorderTraverse

  private void postorderTraverse(TreeNode current){
    if (current == null){
      return;
    }

    //recursively print out left subtree
    postorderTraverse(current.getLeft());

    //recursively print out right subtree
    postorderTraverse(current.getRight());

    //process current node
    System.out.print(current.getData() + ", ");

  }//end postorderTraverse(Node)

  public void postorderTraverse(){
    postorderTraverse(root);
    System.out.println();

  }//end postorderTraverse

  private void inorderTraverse(TreeNode current){
    if (current == null){
      return;
    }

    //recursively print out left subtree
    inorderTraverse(current.getLeft());

    //process current node
    System.out.print(current.getData() + ", ");

    //recursively print out right subtree
    inorderTraverse(current.getRight());

  }//end inorderTraverse(Node)

  public void inorderTraverse(){
    inorderTraverse(root);
    System.out.println();

  }//end inorderTraverse

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