package com.jlee.leetcodesolutions;

public class LeetCode168 {
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
    String result = null;
    if(n < 0)
      return result;
    
    // char c = 'A' + 25 = 'Z'
    // Using 'A' as the reference point, adding 0 will make it 'A'
    // Using 'A' as the reference point, adding 1 will make it 'B'
    // Using 'A' as the reference point, adding 25 will make it 'Z'
    //
    // n = 78 --> BZ
    // (n - 1) % 26 = 25  --> 'A' + 25 = 'Z'
    // n = (n - 1) / 26 = 2
    //
    // n = 2
    // (n - 1) % 26 = 1 --> 'A' + 1 = 'B'
    // n = (n - 1) / 26 = 0
    result = "";
    while(n != 0) {
      n--;
      result = (char)('A' + (n % 26)) + result;
      n = n / 26;
    }
    return result;
  }
}
