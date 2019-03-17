package com.jlee.leetcodesolutions;

public class LeetCode0292 {
  /*
   * You are playing the following Nim Game with your friend: There is a heap of
   * stones on the table, each time one of you take turns to remove 1 to 3 stones.
   * The one who removes the last stone will be the winner. You will take the
   * first turn to remove the stones.
   * 
   * Both of you are very clever and have optimal strategies for the game. Write a
   * function to determine whether you can win the game given the number of stones
   * in the heap.
   * 
   * For example, if there are 4 stones in the heap, then you will never win the
   * game: no matter 1, 2, or 3 stones you remove, the last stone will always be
   * removed by your friend.
   * 
   * https://leetcode.com/problems/nim-game/description/
   */
  public boolean canWinNim(int n) {
    // 1. If you pick 1,2,3 stones leaving a pile divisible by 4, then you can win
    // because you can continue to keep picking just enough stones to keep is
    // divisble by 4.
    // 2. Now if it is your turn and it is divisble by 4, then your opponent and
    // keep it this way for you to lose.
    return n % 4 != 0;      
  }
}
