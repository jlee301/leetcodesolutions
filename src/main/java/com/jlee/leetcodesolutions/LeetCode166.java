package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode166 {
  /*
   * Given two integers representing the numerator and denominator of a fraction,
   * return the fraction in string format.
   * 
   * If the fractional part is repeating, enclose the repeating part in
   * parentheses.
   * 
   * For example,
   * Given numerator = 1, denominator = 2, return "0.5".
   * Given numerator = 2, denominator = 1, return "2".
   * Given numerator = 2, denominator = 3, return "0.(6)".
   * 
   * https://leetcode.com/problems/fraction-to-recurring-decimal/description/
   */
  public String fractionToDecimal(int numerator, int denominator) {
    if(numerator == 0)
      return "0";
    StringBuilder sb = new StringBuilder();
    if(numerator < 0 && denominator >= 0 || numerator >= 0 && denominator < 0)
      sb.append("-");
    
    // Since leetcode test cases uses Integer.MIN_VALUE, we need to convert to long
    // to reserve the value.
    long num = Math.abs((long) numerator);
    long dom = Math.abs((long) denominator);
    sb.append(num / dom);
    long remainder = num % dom;
    if(remainder == 0) 
      return sb.toString();
    else
      sb.append(".");
    
    HashMap<Long,Integer> map = new HashMap<>();
    map.put(remainder, sb.length());
    while(remainder != 0) {
      sb.append((remainder*10) / dom);
      remainder = (remainder*10) % dom;
      // If we encounter a remainder we already seen, we insert open parenthesis at
      // the index where we first seen it and append closing parenthesis
      if(map.containsKey(remainder)) {
        sb.insert(map.get(remainder), "(");
        sb.append(")");
        break;
      }
      map.put(remainder, sb.length());
    }
    return sb.toString();
  }
}
