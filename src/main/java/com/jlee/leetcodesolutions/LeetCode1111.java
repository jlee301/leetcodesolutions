package com.jlee.leetcodesolutions;

public class LeetCode1111 {
  /*
   * https://leetcode.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/
   */
  public int[] maxDepthAfterSplit(String seq) {
    int[] result = new int[seq.length()];
    int count = 0;
    for(int i = 0; i < seq.length(); i++) {
      char ch = seq.charAt(i);
      if(ch == '(')
        result[i] = ++count % 2 > 0 ? 0 : 1;
      else
        result[i] = count-- % 2 > 0 ? 0 : 1;      
    }
    return result;
  }
}
