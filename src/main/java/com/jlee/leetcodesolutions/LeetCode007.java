package com.jlee.leetcodesolutions;

public class LeetCode007 {
  /*
   * Assume we are dealing with an environment which could only hold integers
   * within the 32-bit signed integer range. For the purpose of this problem,
   * assume that your function returns 0 when the reversed integer overflows.
   * 
   * Input: 123 
   * Output: 321
   * 
   * Input: -123 
   * Output: -321
   * 
   * Input: 120 
   * Output: 21
   * 
   * https://leetcode.com/problems/reverse-integer/description/
   */
  public int reverse(int x) {
    // Convert to string and reverse it
    StringBuilder sb = new StringBuilder(""+x);
    sb.reverse();
    
    // If the number is negative, remove the '-' at the end
    if(x < 0)
      sb.deleteCharAt(sb.length()-1);
    
    // Convert the string into a long and check to see if it is within Integer limits
    long result = Long.valueOf((x < 0 ? "-" : "") + sb.toString());
    return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int) result;
  }
}
