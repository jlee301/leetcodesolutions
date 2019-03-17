package com.jlee.leetcodesolutions;

public class LeetCode0168 {
  /*
   * Given a positive integer, return its corresponding column title as appear in
   * an Excel sheet.
   * 
   * For example:
   * 1 -> A 
   * 2 -> B 
   * 3 -> C 
   * ... 
   * 26 -> Z 
   * 27 -> AA 
   * 28 -> AB
   * 52 -> AZ
   * 53 -> BA  * NOT AAA
   * https://leetcode.com/problems/excel-sheet-column-title/description/
   */
  public String convertToTitle(int n) {
    String result = "";
    while(n != 0) {
      // The n-- is to offset that 0 does not map to a letter, 1 starts with A
      n--;
      result = (char)('A' + n % 26) + result;
      n /= 26;
    }
    return result;
  }
}
