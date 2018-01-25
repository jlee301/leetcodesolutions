package com.jlee.leetcodesolutions;

import java.lang.StringBuilder;

public class LeetCode012 {
  /*
   * Given an integer, convert it to a roman numeral.
   * 
   * Input is guaranteed to be within the range from 1 to 3999.
   * 
   * https://leetcode.com/problems/integer-to-roman/description/
   */
  public String intToRoman(int num) {
    if(num < 1 || num > 3999)
      return "";
    
    // Create a mapping of every roman letter changes
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < values.length; i++) {
      while(num >= values[i]) {
        num -= values[i];
        sb.append(romans[i]);
      }
    }
    return sb.toString();
  }
}
