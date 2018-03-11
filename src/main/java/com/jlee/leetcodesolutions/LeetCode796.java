package com.jlee.leetcodesolutions;

public class LeetCode796 {
  /*
   * We are given two strings, A and B.
   * 
   * A shift on A consists of taking string A and moving the leftmost character to
   * the rightmost position. For example, if A = 'abcde', then it will be 'bcdea'
   * after one shift on A. Return True if and only if A can become B after some
   * number of shifts on A.
   * 
   * Example 1:
   * Input: A = 'abcde', B = 'cdeab'
   * Output: true
   * 
   * Example 2:
   * Input: A = 'abcde', B = 'abced'
   * Output: false
   * 
   * Note:
   * A and B will have length at most 100.
   * 
   * https://leetcode.com/problems/rotate-string/description/
   */
  public boolean rotateString(String A, String B) {
    if(A == null || B == null)
      return false;
    if(A.equals(B))
      return true;
    
    int len = A.length();
    for(int i = 0; i < len-1; i++) {
      // Rotate the first character to the back and check if it is same. Continue to
      // do this for the size of the string.
      A = A.substring(1) + A.charAt(0);
      if(A.equals(B))
        return true;
    }
    return false;
  }
}
