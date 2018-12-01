package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode205 {
  /*
   * Given two strings s and t, determine if they are isomorphic.
   * 
   * Two strings are isomorphic if the characters in s can be replaced to get t.
   * 
   * All occurrences of a character must be replaced with another character while
   * preserving the order of characters. No two characters may map to the same
   * character but a character may map to itself.
   * 
   * Input: "egg", "add"
   * Output: true
   * 
   * Input: "eGg", "add"
   * Output: false
   * 
   * Input: "foo", "bar"
   * Output: false
   * 
   * Input: "paper", "title"
   * Output: true
   * 
   * Note: You may assume both s and t have the same length.
   * 
   * https://leetcode.com/problems/isomorphic-strings/description/
   */
  public boolean isIsomorphic(String s, String t) {
    // Map every char of s to t at the same index
    HashMap<Character,Character> map = new HashMap<>();
    for(int i = 0; i < s.length(); i++) {
      char a = s.charAt(i);
      char b = t.charAt(i);
      
      if(map.containsKey(a)) {
        // Does not match what is already mapped
        if(map.get(a) != b)
          return false;
      }
      else {
        // Cannot map because it already exist
        if(map.containsValue(b))
          return false;
        else
          map.put(a, b);
      }
    }    
    return true;
  }
}
