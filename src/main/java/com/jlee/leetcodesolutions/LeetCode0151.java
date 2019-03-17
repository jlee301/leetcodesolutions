package com.jlee.leetcodesolutions;

public class LeetCode0151 {
  /*
   * Given an input string, reverse the string word by word.
   * 
   * For example, 
   * Given s = "the sky is blue", 
   * return "blue is sky the".
   * 
   * https://leetcode.com/problems/reverse-words-in-a-string/description/
   */
  public String reverseWords(String s) {
    if(s == null || s.length() == 0)
      return s;
    
    String[] words = s.split(" ");
    String result = "";
    for(String word : words) {
      if(word.equals(""))
        continue;
      else
        result = " " + word + result;
    }
    return result.length() == 0 ? result : result.substring(1, result.length());
  }
}
