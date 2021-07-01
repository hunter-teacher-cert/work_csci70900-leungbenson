//Exercise 2 - Display date

import java.io.*;
import java.util.*;

public class Date {
  public static void main(String[] args){
    String day = "Thursday";
    int date = 17;
    String month = "June";
    int year = 2021;

    String American = "American format: \n"+ day +", "+ month + " " + date + ", " + year;
    String European = "European format: \n"+ day + " " + date + " " + month + " " + year;

    System.out.println(American + "\n" + European);

  }
}