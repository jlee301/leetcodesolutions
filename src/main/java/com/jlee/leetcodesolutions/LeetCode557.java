package com.jlee.leetcodesolutions;

import java.lang.StringBuilder;

public class LeetCode557 {
  /*
   * Given a string, you need to reverse the order of characters in each word
   * within a sentence while still preserving whitespace and initial word order.
   * 
   * Example 1:
   * Input: "Let's take LeetCode contest"
   * Output: "s'teL ekat edoCteeL tsetnoc"
   * 
   * Note: In the string, each word is separated by single space and there will
   * not be any extra space in the string.
   * 
   * https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
   */
  public String reverseWords(String s) {
    if(s == null)
      return "";
    
    String[] sSplit = s.trim().split(" ");
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < sSplit.length; i++) {
      sb.append(new StringBuilder(sSplit[i]).reverse());
      if(i != sSplit.length - 1)
        sb.append(" ");
    }
    return sb.toString();
  }
}
