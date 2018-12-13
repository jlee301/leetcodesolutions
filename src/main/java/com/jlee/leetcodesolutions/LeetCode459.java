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
    int N = s.length();
    for(int i = 1; i <= N/2; i++) {
      // If the substring cannot evenly divide, then skip
      if(N % i == 0) {
        int multiple = N / i;
        StringBuilder sb = new StringBuilder();
        String str = s.substring(0, i);
        for(int j = 0; j < multiple; j++)
          sb.append(str);
        
        if(sb.toString().equals(s))
          return true;
      }
    }
    return false;
  }
}
