package com.jlee.leetcodesolutions;

import java.util.ArrayList;

public class LeetCode0003 {
  /*
   * Given a string, find the length of the longest substring without repeating
   * characters.
   * 
   * Examples:
   * Given "abcabcbb", the answer is "abc", which the length is 3.
   * Given "bbbbb", the answer is "b", with the length of 1.
   * Given "pwwkew", the answer is "wke", with the length of 3.
   * 
   * Note that the answer must be a substring, "pwke" is a subsequence and not a
   * substring.
   * 
   * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
   */
  public int lengthOfLongestSubstring(String s) {
    if(s == null || s.length() == 0)
      return 0;
    
    ArrayList<Character> list = new ArrayList<Character>();
    int result = 0;
    for(int i = 0; i < s.length(); i++) {
      if(list.contains(s.charAt(i))) {
        while(s.charAt(i) != list.remove(0)) {}
      }
      list.add((char) s.charAt(i));
      result = Math.max(result, list.size());
    }
    return result;
  }
}
