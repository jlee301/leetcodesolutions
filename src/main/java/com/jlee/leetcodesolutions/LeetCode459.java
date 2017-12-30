package com.jlee.leetcodesolutions;

public class LeetCode459 {
  /*
   * Given a non-empty string check if it can be constructed by taking a substring
   * of it and appending multiple copies of the substring together. You may assume
   * the given string consists of lowercase English letters only and its length
   * will not exceed 10000. 
   * 
   * Example 1: 
   * Input: "abab"
   * Output: True
   * 
   * Explanation: It's the substring "ab" twice. 
   * 
   * Example 2: 
   * Input: "aba"
   * Output: False 
   * 
   * Example 3: 
   * Input: "abcabcabcabc"
   * Output: True
   * 
   * Explanation: It's the substring "abc" four times. (And the substring "abcabc"
   * twice.)
   * 
   * https://leetcode.com/problems/repeated-substring-pattern/description/
   */
  public boolean repeatedSubstringPattern(String s) {
    if(s == null || s.length() == 0)
      return false;
    
    int sLen = s.length();
    // The pattern must be at least half of the entire string. If it was greater
    // than half then the pattern could not exist.  So we'll work backwards from 
    // this point.
    for(int i = sLen / 2; i >= 1; i--) {
      // The pattern can only work if its an equal divisor of the length. No need to
      // check if it is not.
      if(sLen % i == 0) {
        int multiple = sLen / i;
        String pattern = s.substring(0, i);
        String result = "";
        // Construct string based against multiple times
        for(int j = 0; j < multiple; j++) {
          result += pattern;
        }
        if(result.equals(s))
          return true;
      }
    }
    return false;
  }
}
