package com.jlee.leetcodesolutions;

public class LeetCode877 {
  /*
   * Alex and Lee play a game with piles of stones. There are an even number of
   * piles arranged in a row, and each pile has a positive integer number of
   * stones piles[i].
   * 
   * The objective of the game is to end with the most stones. The total number of
   * stones is odd, so there are no ties.
   * 
   * Alex and Lee take turns, with Alex starting first. Each turn, a player takes
   * the entire pile of stones from either the beginning or the end of the row.
   * This continues until there are no more piles left, at which point the person
   * with the most stones wins.
   * 
   * Assuming Alex and Lee play optimally, return True if and only if Alex wins
   * the game.
   * 
   * https://leetcode.com/contest/weekly-contest-95/problems/stone-game/
   */
  public boolean stoneGame(int[] piles) {
    // 1. The number of piles is ALWAYS even
    // 2. The sum of stones is odd
    // 3. If you sum all odd piles or all even piles, one will be larger than the
    // other
    //
    // Now if Alex goes first, Alex can force Lee to either pick all odds or all
    // even piles (eg):
    // 1. piles[0], piles[1], piles[2], piles[3]
    // 2. Alex can choose piles[0] (even) or piles[3] (odd).  Alex chooses piles[0]
    // 3. Lee can now choose piles[1] or piles[3] (only odds). 
    // 4. If Lee picked piles[1], then Alex's choices are piles[2] or piles[3]
    // 5. If Lee picked piles[3], then Alex's choices are piles[1] or piles[2]
    //
    // Either cases, Alex will be able to continue picking only even piles, still
    // forcing Lee to pick only odd.  Alex will always win in this condition.
    return true;
  }  
}
