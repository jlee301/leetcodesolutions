package com.jlee.leetcodesolutions;

public class LeetCode402 {
  /*
   * Given a non-negative integer num represented as a string, remove k digits
   * from the number so that the new number is the smallest possible.
   * 
   * Note:
   * The length of num is less than 10002 and will be ≥ k.
   * The given num does not contain any leading zero.
   * 
   * Example 1:
   * Input: num = "1432219", k = 3
   * Output: "1219"
   * Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219
   * which is the smallest.
   * 
   * Example 2:
   * Input: num = "10200", k = 1
   * Output: "200"
   * Explanation: Remove the leading 1 and the number is 200. Note that the output
   * must not contain leading zeroes.
   * 
   * Example 3:
   * Input: num = "10", k = 2
   * Output: "0"
   * Explanation: Remove all the digits from the number and it is left with
   * nothing which is 0.
   * 
   * https://leetcode.com/problems/remove-k-digits/description/
   */
  public String removeKdigits(String num, int k) {
    // Any time we find a peak, we remove it.  Continue k times.
    while(k > 0) {
      int i = 0;
      while(i < num.length()-1) {
        if(Character.getNumericValue(num.charAt(i)) <= Character.getNumericValue(num.charAt(i+1)))
          i++;
        else
          break;
      }
      num = num.substring(0,i) + num.substring(i+1, num.length());
      k--;
    }
    
    // Get rid of any leading zeros.
    int i = 0;
    while(i < num.length()) {
      if(num.charAt(i) == '0')
        i++;
      else
        break;
    }
    num = num.substring(i, num.length());
    return num.isEmpty() ? "0" : num;
  }
}
