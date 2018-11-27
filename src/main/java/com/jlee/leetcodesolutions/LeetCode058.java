package com.jlee.leetcodesolutions;

public class LeetCode058 {
  /*
   * Given a string s consists of upper/lower-case alphabets and empty space
   * characters ' ', return the length of last word in the string. If the last
   * word does not exist, return 0.
   * 
   * Note: A word is defined as a character sequence consists of non-space
   * characters only.
   * 
   * Input: "Hello World" 
   * Output: 5
   * 
   * https://leetcode.com/problems/length-of-last-word/description/
   */
  public int lengthOfLastWord(String s) {
    if(s == null)
      return 0;
    
    String[] sData = s.trim().split(" ");
    return sData[sData.length-1].length();
  }
}
