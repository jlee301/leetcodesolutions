package com.jlee.leetcodesolutions;

public class LeetCode070 {
  /*
   * You are climbing a stair case. It takes n steps to reach to the top. Each
   * time you can either climb 1 or 2 steps. In how many distinct ways can you
   * climb to the top?
   * 
   * Note: Given n will be a positive integer.
   * 
   * Input: 2
   * Output:  2
   * Explanation:  There are two ways to climb to the top.
   * 1. 1 step + 1 step
   * 2. 2 step
   * 
   * Input: 3
   * Output:  3
   * Explanation:  There are three ways to climb to the top.
   * 1. 1 step + 1 step + 1 step
   * 2. 1 step + 2 step
   * 3. 2 step + 1 step
   * 
   * https://leetcode.com/problems/climbing-stairs/discuss/
   * 
   */
  
  /*
   * Input: 4
   * Output: 5
   * 1. 1 step + 1 step + 1 step + 1 step
   * 2. 1 step + 1 step + 2 step
   * 3. 1 step + 2 step + 1 step
   * 4. 2 step + 1 step + 1 step
   * 5. 2 step + 2 step
   * 
   * Input: 5
   * Output: 8
   * 1. 1 step + 1 step + 1 step + 1 step + 1 step
   * 2. 1 step + 1 step + 1 step + 2 step
   * 3. 1 step + 1 step + 2 step + 1 step
   * 4. 1 step + 2 step + 1 step + 1 step
   * 5. 2 step + 1 step + 1 step + 1 step
   * 6. 2 step + 2 step + 1 step
   * 7. 2 step + 1 step + 2 step
   * 8. 1 step + 2 step + 2 step
   * 
   * n  0 1 2 3 4 5
   *    0 1 2 3 5 8
   */
  public int climbStairs(int n) {
    if(n <= 0)
      return 0;
    if(n == 1)
      return 1;
    if(n == 2)
      return 2;
    
    // This is the initial data where the fibonacci sequence begins n=3
    int f = 0; // f = [f-1] + [f-2]  Add the last two steps
    int fMinus1 = 2; // f-1
    int fMinus2 = 1; // f-2
    
    for(int i = 2; i < n; i++) {
      f = fMinus1 + fMinus2;
      // Updating fMinus2 and fMinus1 if the loop continues
      fMinus2 = fMinus1;
      fMinus1 = f;
    }
    return f;
  }
}
