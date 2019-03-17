package com.jlee.leetcodesolutions;

public class LeetCode0091 {
  /*
   * A message containing letters from A-Z is being encoded to numbers using the
   * following mapping:
   * 'A' -> 1 
   * 'B' -> 2 
   * ... 
   * 'Z' -> 26
   * 
   * Given an encoded message containing digits, determine the total number of
   * ways to decode it.
   * 
   * For example,
   * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
   * The number of ways decoding "12" is 2.
   * 
   * https://leetcode.com/problems/decode-ways/description/
   */
  public int numDecodings(String s) {
    if(s == null || s.length() == 0)
      return 0;
    
    int len = s.length();
    int[] noOfDec = new int[len+1];
    noOfDec[len] = 1;
    noOfDec[len-1] = s.charAt(len-1) == '0' ? 0 : 1;
    
    for(int i = len - 2; i >= 0; i--) {
      // If the char is a '0' then it must belong to the next number if valid (<= 26).
      if(s.charAt(i) == '0') continue;
      
      if(Integer.valueOf("" + s.charAt(i) + s.charAt(i+1)) <= 26)
        noOfDec[i] = noOfDec[i+1] + noOfDec[i+2];
      else
        noOfDec[i] = noOfDec[i+1];
    }
    return noOfDec[0];
  }
}
