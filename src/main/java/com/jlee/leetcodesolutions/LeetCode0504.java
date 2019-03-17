package com.jlee.leetcodesolutions;

public class LeetCode0504 {
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
    
    StringBuilder sb = new StringBuilder();
    boolean neg = num < 0 ? true : false;
    num = num < 0 ? -num : num;
    while(num != 0) {
      sb.append(num % 7);
      num /= 7;
    }
    if(neg)
      sb.append('-');
    return sb.reverse().toString();
  }
}
