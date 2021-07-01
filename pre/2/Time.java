import java.io.*;
import java.util.*;

public class Time {
  public static void main(String[] args){
    int hour = 0;
    int minute = 21;
    int second = 32;

    System.out.println("The start time is " + hour + ":" + minute + ":"+ second + ".");

    int mn = hour*24*60 + minute*60 + second; //total seconds since midnight

    System.out.println("The number of seconds since midnight is " + mn + " seconds.");

    int total = 24*60*60; //total seconds in a day
    int remain = total - mn; //seconds remaining in day

    System.out.println("The number of seconds remaining in the day is " + remain + " seconds.");

    //Find the percentage of day passed

    double dtotal = total;
    double dmn = mn;
    double percent = dmn/dtotal*100.0;

    System.out.printf("The percentage of the day that has passed is  %.2f", percent);
    System.out.println(" %.");

    //Finished time

    hour = 0;
    minute = 52;
    second = 25;

    System.out.println("The finished time is " + hour + ":" + minute + ":"+ second + ".");
    
    int end = hour*60*60 + minute*60 + second;
    int elapsed = end - mn;

    System.out.println("The total time elapsed since working on this exercise is " + elapsed + " seconds.");


  }
}