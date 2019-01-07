package com.jlee.leetcodesolutions;

public class LeetCode972 {
  /*
   * https://leetcode.com/problems/equal-rational-numbers/
   */
  public boolean isRationalEqual(String S, String T) {
    return buildNumber(S) == buildNumber(T);
  }
  
  private double buildNumber(String str) {
    // Check to see if there is a repeating part
    int idx = str.indexOf("(");
    if(idx != -1) {
      String num = str.substring(0, idx);
      String repeat = str.substring(idx+1, str.length()-1);
      
      // double can hold maximum of 16 digits after the decimal, 
      // so assume worst case, the repeat part is 1 digit and there is no value after the decimal
      for(int i = 0; i < 16; i++)
        num += repeat;
      
      return Double.valueOf(num);
    }
    return Double.valueOf(str);
  }
}
