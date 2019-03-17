package com.jlee.leetcodesolutions;

public class LeetCode0367 {
  /*
   * Given a positive integer num, write a function which returns True if num is a
   * perfect square else False.
   * 
   * Note: 
   * Do not use any built-in library function such as sqrt.
   * 
   * Example 1:
   * Input: 16 
   * Returns: True 
   * 
   * Example 2:
   * Input: 14 
   * Returns: False
   * 
   * https://leetcode.com/problems/valid-perfect-square/description/
   */
  public boolean isPerfectSquare(int num) {
    long low = 0, high = num;
    while(low <= high) {
      long mid = low + (high - low) / 2;
      long sq = mid * mid;
      if(sq == num)
        return true;
      else if(sq < num)
        low = mid + 1;
      else
        high = mid - 1;
    }
    return false;
  }
}
