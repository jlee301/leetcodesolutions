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
    // Map each char in pattern to a word in str
    HashMap<Character,String> map = new HashMap<>();
    String[] sData = str.trim().split(" ");
    pattern = pattern.trim();
    if(pattern.length() != sData.length)
      return false;
    
    for(int i = 0; i < pattern.length(); i++) {
      char ch = pattern.charAt(i);
      if(!map.containsKey(ch)) {
        // The word is already associated to another char
        if(map.containsValue(sData[i]))
          return false;
        else
          map.put(ch, sData[i]);
      }
      else {
        // The ch doesn't match the expected word
        if(!map.get(ch).equals(sData[i]))
          return false;
      }
    }
    return true;
  }
}
