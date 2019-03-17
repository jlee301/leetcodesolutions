package com.jlee.leetcodesolutions;

public class LeetCode0242 {
  /*
   * Given two strings s and t, write a function to determine if t is an anagram
   * of s.
   * 
   * For example, 
   * s = "anagram", t = "nagaram", return true. 
   * s = "rat", t = "car", return false.
   * 
   * Note: You may assume the string contains only lowercase alphabets.
   * 
   * Follow up: What if the inputs contain unicode characters? How would you adapt
   * your solution to such case?
   * 
   * https://leetcode.com/problems/valid-anagram/description/
   */
  public boolean isAnagram(String s, String t) {
    if(s.length() != t.length())
      return false;
    
    int[] count = new int[26];
    for(int i = 0; i < s.length(); i++) {
      count[s.charAt(i) - 'a']++;
      count[t.charAt(i) - 'a']--;
    }
    
    for(int cnt : count) {
      if(cnt != 0)
        return false;
    }
    return true;
  }
}
