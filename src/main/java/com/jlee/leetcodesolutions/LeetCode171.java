package com.jlee.leetcodesolutions;

public class LeetCode171 {
  /*
   * Given a column title as appear in an Excel sheet, return its corresponding
   * column number.
   * 
   * For example:
   * A -> 1 
   * B -> 2 
   * C -> 3 
   * ... 
   * Z -> 26 
   * AA -> 27 
   * AB -> 28
   */
  public int titleToNumber(String s) {
    int result = 0;
    // i == index of the char evaluating, j == power
    for(int i = s.length()-1, j = 0; i >= 0; i--, j++)
      result += (int) (s.charAt(i) - 'A' + 1) * Math.pow(26, j);
    return result;
  }
}
