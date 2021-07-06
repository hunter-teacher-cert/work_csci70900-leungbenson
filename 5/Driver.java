//Collaborators: mlaks23	leungbenson	MichCS
// GOAL: Gain familiarity with basics of classes in Java.

/*
Your driver file should contain code to (in suggested development order)



add two Time objects and print results
add two Time objects and save the result in another Time object
Your Time class definition file should contain code to
tell a Time object how to do the tasks necessary to achieve the above
*/



import java.io.*;
import java.util.*;

public class Driver {

  public static void main(String[] args) {

    //declare a var of appropriate type to assign an instance of Time to
    Time t;

    //assign var the address of a newly-apportioned Time object
    //instantiate a newly-created Time object (aka "instance of class Time") with default value(s)
    t = new Time();
    System.out.print("Default time = ");
    printTime(t); //Print default values
    
    
    //instantiate a newly-created Time object with specified value(s)
    t = new Time(13,51,30.2);
    System.out.print("Specified time = ");
    printTime(t); //Print specified values
    
    //assign a Time var the value null
    Time var = null;

    //assign a Time var the value of an existing Time var
    var = t;
    System.out.print("This is no longer null. The time is now: ");
    printTime(t);
    


    //test for equality of each of the Time instances above. Print results.
    
  //not fully working yet
    checkTime(t, var);
    //t = new Time(12,50,30.2); //how do we check if they are not equal?
   // checkTime(t, var);

  


  }//end main()

//Method to print time
  public static void printTime(Time t) {
    System.out.printf("%02d:%02d:%04.1f\n",
        t.hour, t.minute, t.second);
  }//end of printTime Method

  public static void checkTime(Time t, Time var){
    if (t == var){
      System.out.println("The times are the same.");
    }
    else{
      System.out.println("The times are different.");
    }
    
  }//end of checkTime

}//end class