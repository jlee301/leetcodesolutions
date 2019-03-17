package com.jlee.leetcodesolutions;

import java.lang.StringBuilder;

public class LeetCode0557 {
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
    String[] sData = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < sData.length; i++) {
      for(int j = sData[i].length()-1; j >= 0; j--)
        sb.append(sData[i].charAt(j));
      
      if(i < sData.length-1)
        sb.append(' ');
    }
    return sb.toString();
  }
}
