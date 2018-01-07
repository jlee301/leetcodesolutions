package com.jlee.leetcodesolutions;

import java.lang.StringBuilder;

public class LeetCode541 {
  /*
   * Given a string and an integer k, you need to reverse the first k characters
   * for every 2k characters counting from the start of the string. If there are
   * less than k characters left, reverse all of them. If there are less than 2k
   * but greater than or equal to k characters, then reverse the first k
   * characters and left the other as original.
   * 
   * Example:
   * Input: s = "abcdefg", k = 2
   * Output: "bacdfeg"
   * 
   * Restrictions:
   * 1. The string consists of lower English letters only.
   * 2.Length of the given string and k will in the range [1, 10000]
   * 
   * https://leetcode.com/problems/reverse-string-ii/description/
   */
  public String reverseStr(String s, int k) {
    if(s == null || s.length() == 0 || k <= 0)
      return "";
    
    if (k == 1)
      return s;
    
    int sLen = s.length();
    int begin = 0;
    int end = 2 * k;
    StringBuilder sb = new StringBuilder();
    
    // Using loop for blocks of 2*k
    while(end <= sLen) {
      sb.append(new StringBuilder(s.substring(begin, begin+k)).reverse());
      begin += k;
      
      sb.append(new StringBuilder(s.substring(begin, end)));
      begin += k;
      end += 2 * k;
    }
    
    // This logic is if the string or remaining part of the string is less than 2*k
    if(begin < sLen && begin+k <= sLen) {
      sb.append(new StringBuilder(s.substring(begin, begin+k)).reverse());
      sb.append(new StringBuilder(s.substring(begin+k, sLen)));
    } else if(begin < sLen && begin+k > sLen) {
      sb.append(new StringBuilder(s.substring(begin, sLen)).reverse());
    }
    
    return sb.toString();
  }
}
