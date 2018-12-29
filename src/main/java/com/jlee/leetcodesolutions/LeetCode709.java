package com.jlee.leetcodesolutions;

public class LeetCode709 {
  /*
   * Implement function ToLowerCase() that has a string parameter str, and returns
   * the same string in lowercase.
   * 
   * https://leetcode.com/problems/to-lower-case/
   */
  public String toLowerCase(String str) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < str.length(); i++) {
      int ch = str.charAt(i);
      if(ch >= 65 && ch <= 90)
        sb.append((char) (ch + 32));
      else
        sb.append((char) ch);
    }
    return sb.toString();
  }
}
