package com.jlee.leetcodesolutions;

public class LeetCode0441 {
  /*
   * You have a total of n coins that you want to form in a staircase shape, where
   * every k-th row must have exactly k coins.
   * 
   * Given n, find the total number of full staircase rows that can be formed.
   * 
   * n is a non-negative integer and fits within the range of a 32-bit signed
   * integer.
   * 
   * Example 1:
   * n = 5
   * The coins can form the following rows: 
   * ¤ 
   * ¤ ¤
   * ¤ ¤
   * 
   * Because the 3rd row is incomplete, we return 2. 
   * 
   * Example 2:
   * n = 8
   * The coins can form the following rows: 
   * ¤ 
   * ¤ ¤ ¤
   * ¤ ¤
   * ¤ ¤
   * 
   * Because the 4th row is incomplete, we return 3.
   * 
   * https://leetcode.com/problems/arranging-coins/description/
   */
  public int arrangeCoins(int n) {
    //            x: 1 + 2 + 3 + 4 + 5 + 6
    // sum of coins: 1   3   6  10  15  21
    // x(x+1) / 2 = sum of coins
    long low = 0, high = (long) n;
    while(low <= high) {
      long mid = low + (high - low) / 2L;
      long sumOfCoins = (mid * (mid + 1L)) / 2L;
      if(sumOfCoins == n)
        return (int) mid;
      else if(sumOfCoins > n)
        high = mid - 1L;
      else
        low = mid + 1L;
    }
    return (int) (low - 1L);
  }
}
