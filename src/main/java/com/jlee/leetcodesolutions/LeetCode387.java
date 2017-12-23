package com.jlee.leetcodesolutions;

public class LeetCode387 {
  /*
   * Given a string, find the first non-repeating character in it and return it's
   * index. If it doesn't exist, return -1.
   * 
   * Examples:
   * s = "leetcode" return 0.
   * s = "loveleetcode", return 2. 
   * 
   * Note: You may assume the string contain only lowercase letters.
   */
  public int firstUniqChar(String s) {
    if(s == null || s.length() == 0)
      return -1;
    
    // Loop through the string and increment the counts
    int[] counts = new int[26];
    for(int i = 0; i < s.length(); i++)
      counts[s.charAt(i) - 'a']++;
    
    // Loop through the string again looking for first count == 1 match
    for(int i = 0; i < s.length(); i++) {
      if(counts[s.charAt(i) - 'a'] == 1)
        return i;
    }
    return -1;
  }
}
