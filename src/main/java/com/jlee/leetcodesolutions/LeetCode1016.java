package com.jlee.leetcodesolutions;

public class LeetCode1016 {
  /*
   * https://leetcode.com/problems/binary-string-with-substrings-representing-1-to-n/
   */
  public boolean queryString(String S, int N) {
    while(N > 0) {
      if(!S.contains(Integer.toBinaryString(N)))
        return false;
      
      N--;
    }
    return true;
  }
}
