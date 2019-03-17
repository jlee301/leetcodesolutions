package com.jlee.leetcodesolutions;

public class LeetCode0387 {
  /*
   * Given a string, find the first non-repeating character in it and return it's
   * index. If it doesn't exist, return -1.
   * 
   * Examples:
   * s = "leetcode" return 0.
   * s = "loveleetcode", return 2. 
   * 
   * Note: You may assume the string contain only lowercase letters.
   * 
   * https://leetcode.com/problems/first-unique-character-in-a-string/description/
   */
  public int firstUniqChar(String s) {
    // find frequency of each char
    int[] count = new int[26];
    for(int i = 0; i < s.length(); i++)
      count[s.charAt(i) - 'a']++;
    
    // find first char with frequency of 1
    for(int i = 0; i < s.length(); i++) {
      if(count[s.charAt(i) - 'a'] == 1)
        return i;
    }
    return -1;
  }
}
