package com.jlee.leetcodesolutions;

import java.lang.StringBuilder;

public class LeetCode008 {
  /*
   * Implement atoi to convert a string to an integer.
   * 
   * Hint: Carefully consider all possible input cases. If you want a challenge,
   * please do not see below and ask yourself what are the possible input cases.
   * 
   * Notes: It is intended for this problem to be specified vaguely (ie, no given
   * input specs). You are responsible to gather all the input requirements up
   * front.
   */
  public int myAtoi(String str) {
    if(str == null)
      return 0;
    
    // Trim any whitespaces
    str = str.trim();
    if(str.length() == 0)
      return 0;
    
    // Check if first character is + or -, if -, then set neg = true
    boolean neg = false;
    if(str.charAt(0) == '-' || str.charAt(0) == '+') {
      if(str.charAt(0) == '-')
        neg = true;

      // If the length is just 1, then the value is just the sign.
      if(str.length() == 1)
        return 0;
      str = str.substring(1, str.length());
    }
    
    // If first character is not a sign or numeric, then we are done
    if(str.charAt(0) < '0' || str.charAt(0) > '9')
      return 0;
    
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < str.length(); i++) {
      // Anything besides a number, then we are done.
      if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
        sb.append(str.charAt(i));
      else
        break;
    }
    
    try {
      return neg ? Integer.parseInt("-" + sb.toString()) : Integer.parseInt(sb.toString());
    } catch(NumberFormatException e) {
      // If the NumerFormatException is thrown, then we know the value exceeds the 32
      // bit limit.
      return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    }
  }
}
