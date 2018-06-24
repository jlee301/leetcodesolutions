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
    // Simulate the reflections
    boolean north = true, east = true;
    int diff = p;
    while(true) {
      diff -= q;

      // A receptor has been hit
      if(diff == 0) {
        if(north) {
          if(east) return 1;
          else return 2;
        }
        else {
          return 0;
        }
      }
      
      // Toggle direction west --> east or east --> west
      east = !east;
      // Reach border, direction changes south --> north, north --> south
      if(diff < 0) {
        diff += p;
        north = !north;
      }
    }    
  }
}
