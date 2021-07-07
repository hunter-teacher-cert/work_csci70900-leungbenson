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

    checkTime(t, var); //same time (t and var are same)

    t = new Time(12,50,30.2); //change t
    checkTime(t, var); //different time (t and var are different)

    //add two Time objects and print results
    Time t1 = new Time(9,20,25.1); //start time
    Time t2 = new Time(9,29,34.2); //finished time

    //add two Time objects and save the result in another Time object
    Time endTime = Time.add(t1, t2); //added start and finished time

    System.out.print("t1: ");
    printTime(t1);
    System.out.print("t2: ");
    printTime(t2);
    System.out.print("t1 + t2: ");
    printTime(endTime);


  }//end main()

//Method to print time
  public static void printTime(Time t) {
    System.out.printf("%02d:%02d:%04.1f\n",
        t.hour, t.minute, t.second);
  }//end of printTime Method


//Testing for equality (attributes) of the Time instance
  public static void checkTime(Time t, Time var){
    System.out.print("Time t is: " );
    printTime(t);
    System.out.print(" and time var is: " );
    printTime(var);
    if (t.hour == var.hour && t.minute == var.minute && t.second == var.second){
      System.out.println("Time t and time var are the same.");
    }
    else{
      System.out.println("Time t and time var are different.");
    }
  }
    
    
  //Adding two Time objects   
  /*public static Time add(Time t1, Time t2) {
    Time sum = new Time();
    sum.hour = t1.hour + t2.hour;
    sum.minute = t1.minute + t2.minute;
    sum.second = t1.second + t2.second;
    return sum;
  }//end of Time Method*/

}//end class