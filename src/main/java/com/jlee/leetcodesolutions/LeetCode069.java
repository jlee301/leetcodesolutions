package com.jlee.leetcodesolutions;

public class LeetCode069 {
  /*
   * Compute and return the square root of x. 
   * x is guaranteed to be a non-negative integer.
   * 
   * Input: 4 
   * Output: 2
   * 
   * Input: 8 
   * Output: 2 
   * Explanation: The square root of 8 is 2.82842..., and since we want to return
   * an integer, the decimal part will be truncated.
   * 
   * https://leetcode.com/problems/sqrtx/description/
   */
  public int mySqrt(int x) {
    if(x == 0)
      return 0;
    if(x == 1)
      return 1;
    
    // Binary search
    int low = 2, high = x / 2;
    while(low <= high) {
      int mid = low + (high - low) / 2;
      long sq = (long) mid * (long) mid;
      if(sq == x)
        return mid;
      else if(sq < x)
        low = mid + 1;
      else
        high = mid - 1;
    }
    return low - 1;
  }
}
