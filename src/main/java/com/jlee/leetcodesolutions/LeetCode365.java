package com.jlee.leetcodesolutions;

public class LeetCode365 {
  /*
   * You are given two jugs with capacities x and y litres. There is an infinite
   * amount of water supply available. You need to determine whether it is
   * possible to measure exactly z litres using these two jugs.
   * 
   * If z liters of water is measurable, you must have z liters of water contained
   * within one or both buckets by the end.
   * 
   * Operations allowed:
   * 1. Fill any of the jugs completely with water.
   * 2. Empty any of the jugs.
   * 3. Pour water from one jug into another till the other jug is completely full
   * or the first jug itself is empty.
   * 
   * Example 1: (From the famous "Die Hard" example)
   * Input: x = 3, y = 5, z = 4 
   * Output: True 
   * 
   * Example 2:
   * Input: x = 2, y = 6, z = 5 
   * Output: False
   * 
   * https://leetcode.com/problems/water-and-jug-problem/description/
   */
  public boolean canMeasureWater(int x, int y, int z) {
    // Jugs x,y are not enough to measure z
    if(x + y < z) 
      return false;
    // If z is zero, then we are done
    if(z == 0)
      return true;

    // Find the GCD (Greatest Common Divisor) between x and y
    // If z is a multiple of the GCD, then it is possible
    int gcd = Math.min(x, y);
    if(gcd == 0)
      return false;
    
    while(gcd > 1) {
      if(x % gcd == 0 && y % gcd == 0) break;
      gcd--;
    }
    return z % gcd == 0;
  }
}
