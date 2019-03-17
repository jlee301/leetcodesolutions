package com.jlee.leetcodesolutions;

public class LeetCode0488 {
  /*
   * Think about Zuma Game. You have a row of balls on the table, colored red(R),
   * yellow(Y), blue(B), green(G), and white(W). You also have several balls in
   * your hand.
   * 
   * Each time, you may choose a ball in your hand, and insert it into the row
   * (including the leftmost place and rightmost place). Then, if there is a group
   * of 3 or more balls in the same color touching, remove these balls. Keep doing
   * this until no more balls can be removed.
   * 
   * Find the minimal balls you have to insert to remove all the balls on the
   * table. If you cannot remove all the balls, output -1.
   * 
   * https://leetcode.com/problems/zuma-game/description/
   */
  public int findMinStep(String board, String hand) {
    // Count available balls in your hand
    int[] count = new int[26];
    for(char ch : hand.toCharArray())
      count[ch - 'A']++;
    
    int moves = findMinStep(board, count);
    return moves == 6 ? -1 : moves;
  }
  
  private int findMinStep(String board, int[] count) {
    // Remove any >= 3 consecutive balls
    board = removeBalls(board);
    if(board.equals(""))
      return 0;
    
    int moves = 6, need = 0;
    int i = 0, j = 1;
    while(i < board.length()) {
      char ch = board.charAt(i);
      // Advance j pointer to next non-matching character of i
      while(j < board.length() && ch == board.charAt(j)) j++;

      // how many moves do I need to make this 3 consecutive
      // do I have enough characters in hand to do this?
      need = 3 - (j-i);
      if(count[ch - 'A'] >= need) {
        count[ch - 'A'] -= need;
        moves = Math.min(moves, findMinStep(board.substring(0, i) + board.substring(j), count) + need);
        count[ch - 'A'] += need;        
      }
      i = j;
    }
    return moves;
  }
  
  // If three or more consecutive same character, remove from string
  private String removeBalls(String board) {
    int i = 0, j = 1;
    while(i < board.length()) {
      char ch = board.charAt(i);
      // Advance j pointer to next non-matching character of i
      while(j < board.length() && ch == board.charAt(j)) j++;
      
      if(j-i >= 3)
        return removeBalls(board.substring(0, i) + board.substring(j));
      else
        i = j;
    }
    return board;
  }
}
