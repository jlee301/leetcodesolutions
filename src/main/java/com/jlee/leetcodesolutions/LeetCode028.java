package com.jlee.leetcodesolutions;

public class LeetCode028 {

  /*
   * Return the index of the first occurrence of needle in haystack, or -1 if
   * needle is not part of haystack.
   * 
   * Input: haystack = "hello", needle = "ll" 
   * Output: 2
   * 
   * Input: haystack = "aaaaa", needle = "bba" 
   * Output: -1
   * 
   * https://leetcode.com/problems/implement-strstr/description/
   */
  public int strStr(String haystack, String needle) {
    if(needle.equals(""))
      return 0;
    
    char ch = needle.charAt(0);
    for(int i = 0; i <= haystack.length()-needle.length(); i++) {
      // Find needle[0] in haystack
      if(haystack.charAt(i) == ch) {
        // Check to see if the remaining chars of needle are there
        boolean found = true;
        for(int j = 1, k = i+1; j < needle.length(); j++, k++) {
          if(needle.charAt(j) != haystack.charAt(k)) {
            found = false;
            break;
          }
        }
        if(found)
          return i;
      }
    }
    return -1;
  }
}
