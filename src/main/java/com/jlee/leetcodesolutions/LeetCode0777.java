package com.jlee.leetcodesolutions;

public class LeetCode0777 {
  /*
   * In a string composed of 'L', 'R', and 'X' characters, like "RXXLRXRXL", a
   * move consists of either replacing one occurrence of "XL" with "LX", or
   * replacing one occurrence of "RX" with "XR". Given the starting string start
   * and the ending string end, return True if and only if there exists a sequence
   * of moves to transform one string to the other.
   * 
   * Example:
   * Input: start = "RXXLRXRXL", end = "XRLXXRRLX"
   * Output: True
   * Explanation:
   * We can transform start to end following these steps:
   * RXXLRXRXL ->
   * XRXLRXRXL ->
   * XRLXRXRXL ->
   * XRLXXRRXL ->
   * XRLXXRRLX
   * 
   * Note:
   * 1. 1 <= len(start) = len(end) <= 10000.
   * 2. Both start and end will only consist of characters in {'L', 'R', 'X'}.
   * 
   * https://leetcode.com/problems/swap-adjacent-in-lr-string/description/
   */
  public boolean canTransform(String start, String end) {
    // If start and end are not the same without 'X', not possible to transform
    if(!start.replace("X", "").equals(end.replace("X", "")))
      return false;
    
    // Perform char comparisons not 'X'
    int ptr1 = 0, ptr2 = 0;
    while(ptr1 < start.length()) {
      // Advance ptr1 and ptr2 to char not 'X'
      while(ptr1 < start.length() && start.charAt(ptr1) == 'X') ptr1++; 
      while(ptr2 < end.length() && end.charAt(ptr2) == 'X') ptr2++;
      
      // If both reached the end, then you can transform
      if(ptr1 == start.length())
        continue;
      
      char ch = start.charAt(ptr1);
      // XL --> LX can only move backwards, so ptr1 >= ptr2 to be valid
      if(ch == 'L' && ptr1 < ptr2)
        return false;

      // RX --> XR can only move forwards, so ptr1 =< ptr2 to be valid
      if(ch == 'R' && ptr1 > ptr2)
        return false;
      
      ptr1++;
      ptr2++;
    }
    return true;
  }
}
