package com.jlee.leetcodesolutions;

public class LeetCode390 {
  /*
   * There is a list of sorted integers from 1 to n. Starting from left to right,
   * remove the first number and every other number afterward until you reach the
   * end of the list.
   * 
   * Repeat the previous step again, but this time from right to left, remove the
   * right most number and every other number from the remaining numbers.
   * 
   * We keep repeating the steps again, alternating left to right and right to
   * left, until a single number remains.
   * 
   * Find the last number that remains starting with a list of length n.
   * 
   * Example:
   * Input:
   * n = 9,
   * 1 2 3 4 5 6 7 8 9
   * 2 4 6 8
   * 2 6
   * 6
   * 
   * Output:
   * 6
   * 
   * https://leetcode.com/problems/elimination-game/description/
   */
  public int lastRemaining(int n) {
    int curr = 1, cycleCountDoubled = 1;
    boolean leftToRight = true;
    while(n > 1) {
      // If cycle is left to right --> move to next available number
      // If cycle is right to left --> if odd numbers left, move to next available number
      if(leftToRight || n % 2 != 0)
        // When moving to the next available number, you add it with 2^cycleCount. This
        // is because we are essentially dividing by 2 per cycle.
        curr += cycleCountDoubled;
      n /= 2;
      cycleCountDoubled *= 2;
      leftToRight = !leftToRight;
    }
    return curr;
  }
}
