package com.jlee.leetcodesolutions;

public class LeetCode0917 {
  /*
   * Given a string S, return the "reversed" string where all characters that are
   * not a letter stay in the same place, and all letters reverse their positions.
   * 
   * https://leetcode.com/contest/weekly-contest-105/problems/reverse-only-letters/
   */
  public String reverseOnlyLetters(String S) {
    int left = 0;
    String strReversed = new StringBuilder(S).reverse().toString();
    StringBuilder ans = new StringBuilder(S);
    
    for(int i = 0; i < ans.length(); i++) {
      // Find next available letter from origin string
      if(!Character.isLetter(ans.charAt(i)))
        continue;
      
      // Find next available letter from reverse string
      while(!Character.isLetter(strReversed.charAt(left)))
        left++;
      
      ans.replace(i, i+1, "" + strReversed.charAt(left++));
    }
    return ans.toString();
  }
}
