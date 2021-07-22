//ds/sort1/SortDemoDriver.java
//Collaborators: mlaks23	twong-cs	Skabanakis, leungbenson	MichCS

import java.io.*;
import java.util.*;

/*
Setup:
 1.Make a folder under your work repo named: ds
 2. Make another folder under that named sort1
 3. Copy this file and SortDemoDriver.java into the ds/sort1 folder

Lab:
Part 1:
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortDemoDriver.java and SortDemo.java) and confirm
   the behavior of the constructors.
Part 2:
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortDemoDriver to test.
Part 3:
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortDemoDriver to test.
*/

public class SortDemo{

    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    private Random r;
    
    //default
    public SortDemo(){
	  data = new ArrayList<Integer>();
	  r = new Random();
  	for (int i=0;i<15;i++){ //default size of list is 15
	    data.add(r.nextInt(20)); //picks random num from 0-19
	}

    }
    //constructor with parameter the size will vary depending on user or programmer choice
    public SortDemo(int size){
	  data = new ArrayList<Integer>();
	  r = new Random();
	  for (int i=0;i<size;i++){
	    data.add(r.nextInt(20)); //picks random num from 0-19
	}

    }

    /*
      return the index of the ArrayList data from index start to the end
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it woudl return 3 which is the index of the value
      6 which is the index with the smallest value from start to end
    */
    //this method is finding the smallest index based on the parameter index number that we provoid. It will include that index #  and go to the right. It will NOT include any values prior to that index number.
    public int findSmallestIndex(int start){
	    int smallIndex = start;
      // start a variable at the one after start


	    // loop from that variable to end and update smallIndex as needed
      for (int i = start+1; i < data.size(); i++){
        if (data.get(smallIndex) < data.get(i)) {
          smallIndex = smallIndex;
        }
        else{
          smallIndex = i;
        }
      }

	    return smallIndex;
      //if repeats of smallest number occur, will return last instance of smallest number

    }// end of findSmallestIndex

  public int get(int index) {
    // define get()
    return this.data.get(index);
  }

  public void sort(){
  	int smallestIndex;

	  for (int j=0;j < data.size()-1; j++){
	    // find the smallet index from i to end

      smallestIndex = findSmallestIndex(j);

      // swap the item at that index and i

      int valSmallIndex = data.get(smallestIndex);
      data.set(smallestIndex, data.get(j));
      data.set(j, valSmallIndex);

      }
  }


    /* If you finish the lab early you can get started on this */
    //Based on code from Liam Baum and Peter Tsun

    public int linearSearch(int value){
	// loop through the ArrayList data

    for (int i = 0; i < data.size(); i++) {
    // and if the value you're searchign for is in the ArrayList, return it.

      if(data.get(i) == value) {
        System.out.println("Your value " + value + " is in the data set. ");
        return value;
      }
    }
	// return -1 if it isn't there.
    System.out.println ("Your value " + value + " is not in the data set. ");
	   return -1; // replace this return
    }

    /* If you finish the lab early you can get started on this */

    //I watched the two videos and looked at Liam and Jiyoon's code, but made my
    //own modifications.
    public int binarySearch(int value){

       //boolean isUpperLessThanLower = false;  //I couldn't get this to work
	     int lowerIndex = 0;
	     int upperIndex =  data.size() - 1;
	     int middleIndex = data.size()/2;


	/* if upper crosses lower it's not there and the lop should exit the loop
	   and if the item is at middle you should exit the loop

           you have to replace the "replacethiswithrealexpression" boolean
           with a correct expression based on lowerIndex and upperIndex
	*/
      //while (!isUpperLessThanLower) { //I took this out when I removed the boolean statement
	   while (lowerIndex <= upperIndex) {
       if (value < data.get(middleIndex)) {
         upperIndex = middleIndex - 1;
         middleIndex = (upperIndex + lowerIndex)/2;
       } else if (value > data.get(middleIndex)) {
         lowerIndex = middleIndex + 1;
         middleIndex = (upperIndex + lowerIndex)/2;
       } else if (value == data.get(middleIndex)) {
         System.out.println("Your value " + value + " is in the data set. ");
         return value;
       }

		// update lower and upper.
		// remember if value is less than data.get(middleIndex) you want to search next time
		// from lower to the middle and otherwise from the middle to the upper.
		//
		// then update middleIndex based on new lowerIndex and upperIndex.

	    }

	/* replace this return to either return the value if it was found and -1
	   if upperIndex and lowerIndex crossed
	*/

    System.out.println ("Your value " + value + " is not in the data set. ");
	  return -1; // replace this return
      }


    public String toString(){
	  return ""+data;
    };

    /*------------------------- MERGESORT STUFF -----------------*/


        // Preconditions: a and b are ArrayLists of Integers and
        //                both are in increasing order
        // Return: a new ArrayList of Integers that is the result
        //         of merging a and b. The new ArrayList
        //         should be in increasing order
        private ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
          ArrayList<Integer> result = new ArrayList<Integer>();
         
          int countA = 0;
          int countB = 0;

          while (result.size() < (a.size() + b.size())){
            if (countA == a.size()){
              result.add(b.get(countB));
              countB++;
            }
            else if (countB == b.size()){
              result.add(a.get(countA));
              countA++;
            }
            else if (a.get(countA) <= b.get(countB)){
              result.add(a.get(countA));
              countA++;
            }
            else {
              result.add(b.get(countB));
              countB++;
            }

          } //end of while loop


          return result;
        }//end merge

        
        private ArrayList<Integer> fillForMerge(int size){
          ArrayList<Integer> a = new ArrayList<Integer>();
          int lastVal = r.nextInt(10);
          for (int i = 0 ; i < size ; i=i+1){
            a.add(lastVal);
            lastVal = lastVal + r.nextInt(10);
          }
          return a;

        }//end fillForMerge
        
         /*
      Parameters: l - an ArrayList
      
      Returns: a new, sorted ArrayList
      This routine should implement the mergesort algorithm.
    */
    public ArrayList<Integer> msort(ArrayList<Integer> l){
	
      ArrayList<Integer> left = new ArrayList<Integer>() ;
      ArrayList<Integer> right = new ArrayList<Integer>();

      // base case - if the input ArrayList is smaller than 2 elements
      
      if (l.size()<2){
        return l;
      }

      // split l into left and right halves
      else {        
          for (int i = 0; i < l.size()/2; i++){ // split into left side
            left.add(l.get(i)); 
          }

          for (int j = l.size()/2; j < l.size(); j++){ // split into right side
            right.add(l.get(j));  
          }
          //System.out.println(left + " ----" + right);

          //msort(left); // sort the left half
          //msort(right); // sort the right half

          // return the result
          // merge the two halves that have been sorted

          return merge(msort(left), msort(right));

      }// end else
           
    }// end msort

       public void msortTest(){
	      data = msort(data);
     }// end msortTest


        public void testMerge(){

          ArrayList<Integer> a = new ArrayList<Integer>();
          ArrayList<Integer> b = new ArrayList<Integer>();
          a = fillForMerge(20);
          b = fillForMerge(20);
          System.out.println("Array a: " + a);
          System.out.println("Array b: " + b);
          ArrayList<Integer> result = merge(a,b);
          System.out.println("Array result: " + result);

        }//end testMerge

}
