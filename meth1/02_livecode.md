```java
//Part 1 - Live code through the use of video.
//https://www.youtube.com/watch?v=C3BSLx080aQ&t=1s

public class HelloWorld {
    public static void main(String[] args) { //Try to label end brackets before you start coding
        System.out.println("Hello, World!"); // Compile/Run 1
        //println prints next statement on the following line

        //Part 2: Live code using your name as a string variable

        String name; //Declare a String variable named name
        name = "Benson Leung"; //Don't forget the semi-colons.  Initialize name as your own name
        System.out.print("Hello, World!  My name is ");// Print statement on new line saying your name
        System.out.println(name); //Print name after previous statement
        //Compile/Run 2

        //Alternatively, you can simplify your code
        String name2 = "Benson Leung"; //Initialize and declare in one step
        //Make errors here on purpose, such as defining variable again and forgetting quotes/semi-colons
        //Have students explain what the error is
        System.out.println("Hello, World!  My name is " + name2 + ".");//This is called a concatenation

        //Compile/Run 3

        //Mad Libs Example
        String color = "(Fill in favorite color)";
        System.out.println("My favorite color is " + color + ".");

        //Compile/Run 3
        //Show how to change variable
        color = "blue";
        System.out.println("My favorite color is " + color + ".");

        
    }//end main
}//end class
```