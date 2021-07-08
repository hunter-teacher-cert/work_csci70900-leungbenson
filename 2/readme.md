Notes:
https://docs.google.com/document/d/1ks9N8TMVxPjaKKTev912LsJO6Jy7_7cxlmerwg7dKSs/edit


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