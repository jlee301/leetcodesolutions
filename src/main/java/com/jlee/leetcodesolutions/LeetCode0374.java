package com.jlee.leetcodesolutions;

public class LeetCode0374 {
  /*
   * We are playing the Guess Game. The game is as follows:
   * 
   * I pick a number from 1 to n. You have to guess which number I picked.
   * 
   * Every time you guess wrong, I'll tell you whether the number is higher or
   * lower.
   * 
   * You call a pre-defined API guess(int num) which returns 3 possible results
   * (-1, 1, or 0):
   * -1 : My number is lower 
   * 1 : My number is higher 
   * 0 : Congrats! You got it!
   * 
   * Example: 
   * n = 10, I pick 6.
   * Return 6.
   * 
   * https://leetcode.com/problems/guess-number-higher-or-lower/description/
   */
  private final int pick;

  public LeetCode0374(int x) {
    pick = x;
  }
  
  private int guess(int num) {
    if(num < pick)
      return 1;
    else if (num > pick)
      return -1;
    else 
      return 0;
  }
  
  public int guessNumber(int n) {
    int low = 1, high = n;
    while(low < high) {
      int mid = low + (high - low) / 2;
      int result = guess(mid);
      if(result == 0)
        return mid;
      else if(result > 0)
        low = mid + 1;
      else
        high = mid - 1;
    }
    return low;
  } 
}
