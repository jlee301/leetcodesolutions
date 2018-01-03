package com.jlee.leetcodesolutions;

public class LeetCode504 {
  /*
   * Given an integer, return its base 7 string representation.
   * 
   * Example 1: 
   * Input: 100 
   * Output: "202" 
   * 
   * Example 2: 
   * Input: -7 
   * Output: "-10" 
   * 
   * Note:
   * The input will be in range of [-1e7, 1e7].
   * 
   * https://leetcode.com/problems/base-7/description/
   */
  public String convertToBase7(int num) {
    if(num == 0)
      return "0";

    boolean neg = false;
    if(num < 0) {
      neg = true;
      num = Math.abs(num);
    }
    
    String result = "";
    while(num != 0) {
      int remainder = num % 7;
      result = remainder + result;
      num = num / 7;
    }
    
    if(neg)
      result = "-" + result;
    
    return result;
  }
}
