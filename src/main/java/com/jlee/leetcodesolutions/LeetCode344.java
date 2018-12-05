package com.jlee.leetcodesolutions;

public class LeetCode344 {
  /*
   * Write a function that takes a string as input and returns the string
   * reversed.
   * 
   * Example: 
   * Given s = "hello", return "olleh".
   * 
   * https://leetcode.com/problems/reverse-string/description/
   */
  public String reverseString(String s) {
    StringBuilder sb = new StringBuilder();
    for(int i = s.length()-1; i >= 0; i--)
      sb.append(s.charAt(i));
    
    return sb.toString();
  }
}
