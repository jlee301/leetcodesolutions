package com.jlee.leetcodesolutions;

public class LeetCode0844 {
  /*
   * Given two strings S and T, return if they are equal when both are typed into
   * empty text editors. # means a backspace character.
   * 
   * Note:
   * 1. 1 <= S.length <= 200
   * 2. 1 <= T.length <= 200
   * 3. S and T only contain lowercase letters and '#' characters.
   * 
   * https://leetcode.com/problems/backspace-string-compare/description/
   */
  public boolean backspaceCompare(String S, String T) {
    String str1 = simulate(S);
    String str2 = simulate(T);
    
    return str1.equals(str2);
  }
  
  private String simulate(String str) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < str.length(); i++){
      char ch = str.charAt(i);
      if(ch != '#')
        sb.append(ch);
      else {
        if(sb.length() != 0)
          sb.deleteCharAt(sb.length()-1);
      }
    }
    return sb.toString();
  }
}
