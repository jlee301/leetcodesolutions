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
    if(x == 1)
      // sq = 1 / 2 = 0 != 1
      return 1;
    
    int sq = x / 2;
    while(sq >= 1) {
      int result = sq * sq;
      // System.out.println("x: " + x);
      // System.out.println("result: " + result);
      // System.out.println("sq:" + sq);
      
      if(result <= x) {
        // As soon as result <= x I know sq is the squareRoot.
        break;
      }
      sq--;
    }
    
    return sq;
  }
}
