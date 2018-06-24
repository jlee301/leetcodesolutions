package com.jlee.leetcodesolutions;

public class LeetCode858 {
  /*
   * There is a special square room with mirrors on each of the four walls. Except
   * for the southwest corner, there are receptors on each of the remaining
   * corners, numbered 0, 1, and 2.
   * 
   * The square room has walls of length p, and a laser ray from the southwest
   * corner first meets the east wall at a distance q from the 0th receptor.
   * 
   * Return the number of the receptor that the ray meets first. (It is guaranteed
   * that the ray will meet a receptor eventually.)
   * 
   * https://leetcode.com/problems/mirror-reflection/description/
   */
  public int mirrorReflection(int p, int q) {
    // Find the common multiplier of p and q
    int k = 1;
    while((p*k) % q != 0)
      k++;
    
    // If multiplier is even, direction is north --> south, only one outcome
    if(k % 2 == 0)
      return 0;
    
    // If multiplier is odd, direction is south -- north, there's two outcome
    // If even, direction is east --> west
    // If odd, directioni is west --> east;
    if(((p*k) / q) % 2 == 0)
      return 2;
    return 1;
  }
}
