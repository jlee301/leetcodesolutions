package com.jlee.leetcodesolutions;

public class LeetCode672 {
  /*
   * There is a room with n lights which are turned on initially and 4 buttons on
   * the wall. After performing exactly m unknown operations towards buttons, you
   * need to return how many different kinds of status of the n lights could be.
   * 
   * Suppose n lights are labeled as number [1, 2, 3 ..., n], function of these 4
   * buttons are given below:
   * 1. Flip all the lights.
   * 2. Flip lights with even numbers.
   * 3. Flip lights with odd numbers.
   * 4. Flip lights with (3k + 1) numbers, k = 0, 1, 2, ...
   * 
   * Note: n and m both fit in range [0, 1000].
   * 
   * https://leetcode.com/problems/bulb-switcher-ii/description/
   */
  public int flipLights(int n, int m) {
    if(n == 0 || m == 0)
      return 1;
    
    if(n == 1) return 2;
    else if(n == 2) return m == 1 ? 3 : 4;
    // A pattern occurs when there are n >= 3 lights
    else return m == 1 ? 4 : m == 2 ? 7 : 8;
  }  
}
