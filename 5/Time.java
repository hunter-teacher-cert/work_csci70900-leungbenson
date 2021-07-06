//Collaborators: mlaks23	leungbenson	MichCS
// GOAL: Gain familiarity with basics of classes in Java.

import java.io.*;
import java.util.*;


/*Your driver file should contain code to (in suggested development order)


assign a Time var the value null
assign a Time var the value of an existing Time var
print all of the above (See multiple ways to do this? Try all -- and document in comments!)
test for equality of each of the Time instances above. Print results.
add two Time objects and print results
add two Time objects and save the result in another Time object
Your Time class definition file should contain code to
tell a Time object how to do the tasks necessary to achieve the above */


  // your implementation of class Time here

public class Time {
    public int hour;
    public int minute;
    public double second;

    //instantiate a newly-created Time object (aka "instance of class Time") with default value(s)
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }//end of public Time()

//instantiate a newly-created Time object with specified value(s)
/*
        this.hour = 13;
        this.minute = 51;
        this.second = 30.2;
        */

    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }//end of public Time



}//end class Time





