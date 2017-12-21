package com.jlee.leetcodesolutions;

public class LeetCode326 {
  /*
   * Given an integer, write a function to determine if it is a power of three.
   * 
   * Follow up: 
   * Could you do it without using any loop / recursion?
   * 
   * 3^0 = 1
   * 3^1 - 3
   * 3^2 = 9
   * 3^3 = 27
   * 3^4 = 81
   * 
   * https://leetcode.com/problems/power-of-three/description/
   */
  public boolean isPowerOfThree(int n) {
    if(n <= 0)
      return false;
    
    while(n % 3 == 0)
      return isPowerOfThree(n / 3);
    
    return n == 1;
  }
}
