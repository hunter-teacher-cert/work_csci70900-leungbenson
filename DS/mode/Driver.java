import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {
	Mode m = new Mode();
  int minimum = m.findSmallestValue();
  int freqVal = m.frequency(2);

	System.out.println("Array list " + m);
  System.out.println("Minimum value: " + minimum);
  //System.out.println("Frequency of " + value + " is " + freqVal);
  System.out.println("The mode is  " + m.calcMode());
  }//end main
    
}//end class