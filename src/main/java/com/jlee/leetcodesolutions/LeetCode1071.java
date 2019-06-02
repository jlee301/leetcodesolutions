package com.jlee.leetcodesolutions;

public class LeetCode1071 {
  /*
   * https://leetcode.com/problems/greatest-common-divisor-of-strings/
   */
  public String gcdOfStrings(String str1, String str2) {
    int len = 0, len1 = str1.length(), len2 = str2.length();
    
    // Check every possible combination
    for(int i = 1; i <= Math.min(len1, len2); i++) {
      // Check to see if the length of the string is divisible
      if(len1 % i == 0 && len2 % i == 0) {
        String temp = str1.substring(0, i);
        String build1 = "", build2 = "";
        
        // Now build the string and see if it matches
        for(int j = 0; j < len1 / i; j++)
          build1 += temp;
        
        for(int j = 0; j < len2 / i; j++)
          build2 += temp;
        
        if(build1.equals(str1) && build2.equals(str2))
          len = i;
      }
    }    
    return str1.substring(0, len);
  }
}
