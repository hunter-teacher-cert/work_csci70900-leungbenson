/*
Eric Wilson and Benson Leung
Game of Mancala
6 5 4 3 2 1 0
M p p p p p p 
  p p p  p  p  p  M
  7 8 9 10 11 12 13

PPPPPPM AAAAAAM
One array - size 14
Not allowed to choose from M or the other side  
  6 - Player Mancala
  0-5 : Player's side
  7-12 : AI's side
  13: AI's Mancala

RULES:

1 - you can only move stones on your side
a move consists of collecting all stones in a pit and dropping them 1 by 1 into each consecutive pit in a counterclockwise direction

  Method - Player's Turn
    - choose a location on their side
      -check if empty or invalid choice
  - automatically deposit stones in order
  - if ends in player's mancala, play again
  - if ends in empty pit on other side, collect stones from both and put in player mancala
  - then start AI turn
  - how to choose location? scanner... assign user input value for each array?
    5 4 3 2 1 0
  M p p p p p p 
  p p p  p  p  p  M
  7 8 9 10 11 12 13

  Method - AI's Turn

2 - if last stone dropped is into your mancala, you go again

  If last stone is in own Mancala, then run Player's Turn again

3- if last stone dropped is into an empty pit on your side, you capture the stones in the opposite pit (store in mancala)
  if last stone is dropped in empty array (non mancala pit), player collects pits on opposite array/pit and adds to own mancala

  Print array at the end of each plaer's turn
  
*/

import java.io.*;
import java.util.*;
import java.util.Scanner; 
import java.util.Random;
import java.util.Arrays;

public class Mancala{
  public static void main(String[] args){
    // declares int array, declares size
    int[] board = {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
    boolean finished = gameFinished(board); // Game is finished.  One side has no more stones
    
    // Loop game until one side has no more stones
    while(!finished){
      // Print Board
      printBoard(board);

      // Player's Turn
      printBoard(playersTurn(board));

      // AI's Turn
      printBoard(aiTurn(board));

    }

  }


// Method prints the board
  public static void printBoard (int[] board){
    
    //Prints pit choices
    System.out.println("Pit selection: \nM 5 4 3  2  1  0 \n  7 8 9 10 11 12 M \n");

    //Prints Player side of board
    for (int i = 6; i>=0 ; i--){
    System.out.print(board[i] + " " );
    }
  
    System.out.print("\n  "); //adds space in front of ai's board

    //Prints AI side of board
    for (int i = 7; i<=13 ; i++){
    System.out.print(board[i] + " " );
    }
    System.out.println("\n");
  }
  
  //Method for Player's Turn
  public static int[] playersTurn (int[] board){
    // Ask for location of stones
    System.out.println("\nPlease choose a pit to pick up stones from 0-5: ");
    Scanner in = new Scanner(System.in);
    int pPit = in.nextInt();
    int pStones = board[pPit];

    //Check validity: Must be in pits 0-5 and has stones
    if (pPit<0 || pPit>5 || pStones < 1){
      System.out.println("Your choice is invalid. Please try again.");
      playersTurn(board);
    }
    else {
      //Print board after choice is made
      System.out.println("\n");
      stonesTracking(pPit, pStones, board);
    }  
    
    return board;
  }

// Method for Player and AI selection
  public static int[] stonesTracking (int pit, int stones, int[] board){
    
    board[pit]=0; //Remove stones from pit chosen
    int counter = stones; //Keeps track of number of stones left
  
    for (int i = pit + 1; i<=pit + stones;i++){
      
      counter --; //subtract a stone every time it is used
      // how to reset after ai mancala hits 13
      if (i > 13){
        for (i = 0; i<=counter;i++){
          board[i]++;
        } 
        break;
      }
      board[i] ++; //Each pit gets a stone

      // Play again if last stone ends in Mancala pit
      if (counter==0 && i==6 ){
        printBoard(board);
        playersTurn(board);
      }
      else if (counter==0 && i==13){
        printBoard(board);
        aiTurn(board);
      }
      
    }
    return board;
  }

  public static int[] aiTurn(int[] board){
    // Declare random variable
    Random rand = new Random();

    // AI chooses pit and stones
    int aPit = rand.nextInt(6) + 7;
    int aStones = board[aPit];
    System.out.println("\nAI has chosen to pick up stones from pit " + aPit);
    
    //Print board after choice is made
    System.out.println("\n");
    stonesTracking(aPit, aStones, board);
    
    return board;
  }

  public static boolean gameFinished(int[] board){
    if (board[0]==0 && board[1]==0 && board[2]==0 && board[3]==0 && board[4]==0 && board[5]==0){
      return true;
    }
    else if (board[7]==0 && board[8]==0 && board[9]==0 && board[10]==0 && board[11]==0 && board[12]==0){
      return true;
    }
    else{
      return false;
    }
  }
} 