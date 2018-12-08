package com.jlee.leetcodesolutions;

public class LeetCode434 {
  /*
   * Count the number of segments in a string, where a segment is defined to be a
   * contiguous sequence of non-space characters.
   * 
   * Please note that the string does not contain any non-printable characters.
   * 
   * Example:
   * Input: "Hello, my name is John" 
   * Output: 5
   * 
   * https://leetcode.com/problems/number-of-segments-in-a-string/description/
   */
  public int countSegments(String s) {
    int count = 0;
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) != ' ' && (i == s.length()-1 || s.charAt(i+1) == ' '))
        count++;
    }
    return count;
  }
}
