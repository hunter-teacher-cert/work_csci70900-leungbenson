import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    Queue n = new Queue();
    System.out.println("Is list empty? " + n.isEmpty());
    n.enqueue("Ian");
    System.out.println("The first person in queue is: " + n.front());
    n.enqueue("Julian");
    n.enqueue("Steph");

    System.out.println("Queue: " + n);
    System.out.println("The number of people in queue is: " + n.size());
    System.out.println("Is list empty? " + n.isEmpty());
    
    n.dequeue();
    System.out.println("Queue: " + n);
    n.dequeue();
    System.out.println("Queue: " + n);
    n.dequeue();
    System.out.println("Queue: " + n);
    n.dequeue();
    System.out.println("Queue: " + n);
    System.out.println("Is list empty? " + n.isEmpty());

    n.enqueue("Julian");
    n.enqueue("Steph");
    n.enqueue("Benson");
    n.enqueue("Vick");
    n.enqueue("Ian");
    n.enqueue("Peter");
    
    System.out.println("Queue: " + n);
    System.out.println("The number of people in queue is: " + n.size());
    System.out.println("The first person in queue is: " + n.front());

  }//end of main
}//end of QDriver
