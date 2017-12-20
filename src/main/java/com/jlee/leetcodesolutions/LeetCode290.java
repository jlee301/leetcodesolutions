package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode290 {
  /*
   * Given a pattern and a string str, find if str follows the same pattern.
   * 
   * Here follow means a full match, such that there is a bijection between a
   * letter in pattern and a non-empty word in str.
   * 
   * Examples:
   * pattern = "abba", str = "dog cat cat dog" should return true.
   * pattern = "abba", str = "dog cat cat fish" should return false.
   * pattern = "aaaa", str = "dog cat cat dog" should return false.
   * pattern = "abba", str = "dog dog dog dog" should return false.
   * 
   * Notes: You may assume pattern contains only lowercase letters, and str
   * contains lowercase letters separated by a single space.
   * 
   * https://leetcode.com/problems/word-pattern/description/
   */
  public boolean wordPattern(String pattern, String str) {
    if(pattern == null || str == null)
      return false;
    
    String[] data = str.split(" ");
    if(pattern.length() != data.length)
      return false;
    HashMap<Character, String> hash = new HashMap<Character, String>();
    for(int i = 0; i < pattern.length(); i++) {
      if(hash.containsKey((Character)pattern.charAt(i))) {
        if(!hash.get((Character)pattern.charAt(i)).equals(data[i]))
          // Key exist, but data does not match
          return false;
      } else {
        if(hash.containsValue(data[i]))
          // Key does not exist, but value already exist
          return false;
        
        // Key and value does not exist, so store
        hash.put((Character)pattern.charAt(i), data[i]);
      }
    }
    return true;
  }
}
