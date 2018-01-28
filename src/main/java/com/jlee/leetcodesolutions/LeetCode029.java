package com.jlee.leetcodesolutions;

import java.lang.StringBuilder;

public class LeetCode029 {
  /*
   * Divide two integers without using multiplication, division and mod operator.
   * 
   * If it is overflow, return MAX_INT.
   * 
   * https://leetcode.com/problems/divide-two-integers/description/
   */
  public int divide(int dividend, int divisor) {
    if(dividend == 0 || divisor == 0)
      return 0;
    
    boolean neg = false;
    if((dividend < 0 && divisor >= 0) || (dividend >= 0 && divisor < 0))
      neg = true;
    
    long longDividend = Math.abs((long) dividend);
    long longDivisor = Math.abs((long) divisor);
    
    String sDividend = Long.toString(longDividend);
    StringBuilder sb = new StringBuilder();
    long carry = 0;
    for(int i = 0; i < sDividend.length(); i++) {
      String sSubDividend = "" + carry + sDividend.charAt(i);
      int count = 0;
      long sum = 0, subDividend = Long.valueOf(sSubDividend);
      while(sum+longDivisor <= subDividend) {
        count++;
        sum += longDivisor;
      }
      carry = subDividend - sum;
      sb.append(count);
    }
    try {
      return neg ? Integer.valueOf("-" + sb.toString()) : Integer.valueOf(sb.toString());
    } catch(NumberFormatException e) {
      return Integer.MAX_VALUE;
    }
  }
}
