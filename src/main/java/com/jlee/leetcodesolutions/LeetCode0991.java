package com.jlee.leetcodesolutions;

public class LeetCode0991 {
  /*
   * https://leetcode.com/contest/weekly-contest-123/problems/broken-calculator/
   */
  public int brokenCalc(int X, int Y) {
    // Instead of multiplying X by 2 or X - 1
    // We divide Y by 2 or Y + 1 to avoid possible overflow
    int count = 0;
    while(X < Y) {
      Y = Y % 2 == 0 ? Y / 2 : Y + 1;
      count++;
    }
    
    // Once X >= Y, the only choice is Y + 1, so we take the diff of X and Y
    return count + X - Y;
  }  
}
