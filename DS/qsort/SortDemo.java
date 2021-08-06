//Helped by Brian

import java.io.*;
import java.util.*;

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
      }//end for
    }//end SortDemo()

    //constructor with parameter the size will vary depending on user or programmer choice
    public SortDemo(int size){
      data = new ArrayList<Integer>();
      r = new Random();
      for (int i=0;i<size;i++){
        data.add(r.nextInt(20)); //picks random num from 0-19
      }//end for
    }//end SortDemo(int)

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
      }//end for

	    return smallIndex;
      //if repeats of smallest number occur, will return last instance of smallest number
    }// end of findSmallestIndex

  public int get(int index) {
    // define get()
    return this.data.get(index);
  }//end get

  public String toString(){
	  return ""+data;
  }//end toString

  //Quick Sort

  //Find the pivot point (Median of first, middle, and last value)
  public int pivot(ArrayList<Integer> newAList){
    int first = newAList.get(0);
    int last = newAList.get(newAList.size() - 1);
    int middle = newAList.get(newAList.size()/2);
    int pivotIndex;

    //pivot is first value
    if ((first > last && first < middle) ||
        (first < last && first > middle)){
      pivotIndex = 0;
    }
    //pivot is last value
    else if ((last > middle && last < first) ||
        (last < middle && last > first)){
      pivotIndex = newAList.size() - 1;
    }
    //pivot is middle value
    else{
      pivotIndex = newAList.size()/2;
    }
    return pivotIndex;
  }


  public ArrayList<Integer> qsort(ArrayList<Integer> newAList){
    if (newAList.size() < 2){
      return newAList;
    }

    int pivotIndex = pivot(newAList);
    int pivotValue = newAList.get(pivotIndex);
    ArrayList<Integer> left = new ArrayList<Integer>();
    ArrayList<Integer> right = new ArrayList<Integer>();

       //Populate left and right arrays
      for (int i = 0; i < newAList.size(); i++){
      //As long as the index is not the pivot Index
        if (i != pivotIndex){
          if (newAList.get(i) < pivotValue){
          left.add(newAList.get(i));
          }//end if
          else{
          right.add(newAList.get(i));
          }//end else
        }//end if      
      }//end for

    //Recursivelty call qsort on left and right
    left = qsort(left);
    right = qsort(right);

    //combine left, pivot, and right
    ArrayList<Integer> result = new ArrayList<Integer>();
    result.addAll(left);
    result.add(pivotValue);
    result.addAll(right);
    return result;

  
  }

  public void qSortTest()
  {
    data = qsort(data);
  }

  
  
    

}
