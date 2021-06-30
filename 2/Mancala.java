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
    System.out.println(Arrays.toString(board));

    // Print Board
    printBoard(board);
  }

  public static void printBoard (int[] board){
    for (int i = 0; i < 7; i++){
    System.out.print(board[i] + " " );
    }
  }
  
} 