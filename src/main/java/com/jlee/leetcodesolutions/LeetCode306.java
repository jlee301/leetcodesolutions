package com.jlee.leetcodesolutions;

public class LeetCode306 {
  /*
   * Additive number is a string whose digits can form additive sequence.
   * 
   * A valid additive sequence should contain at least three numbers. Except for
   * the first two numbers, each subsequent number in the sequence must be the sum
   * of the preceding two.
   * 
   * For example: "112358" is an additive number because the digits can form an
   * additive sequence: 1, 1, 2, 3, 5, 8.
   * 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
   * 
   * "199100199" is also an additive number, the additive sequence is: 1, 99, 100,
   * 199.
   * 1 + 99 = 100, 99 + 100 = 199
   * 
   * Note: Numbers in the additive sequence cannot have leading zeros, so sequence
   * 1, 2, 03 or 1, 02, 3 is invalid.
   * 
   * Given a string containing only digits '0'-'9', write a function to determine
   * if it's an additive number.
   * 
   * https://leetcode.com/problems/additive-number/description/
   */
  public boolean isAdditiveNumber(String num) {
    if(num == null)
      return false;
    int len = num.length();
    // i and j are the length of num1 and num2 respectively
    for(int i = 1; i <= len/2; i++) {
      // num1 begins with a zero and is more than one digit, then there is no way for
      // this to be an Additive Number.
      if(num.charAt(0) == '0' && i > 1) 
        return false;
      
      // Since the length of the sum is at least max(i, j), we can stop iterating when
      // max(i, j) exceeds len-i-j.
      for(int j = 1; Math.max(i, j) <= len-i-j; j++) {
        // num2 begins with a zero and is more than one digit, break out of loop and use
        // the zero with num1
        if(num.charAt(i) == '0' && j > 1) break;
        long num1 = Long.valueOf(num.substring(0, i));
        long num2 = Long.valueOf(num.substring(i, i+j));
        if(isValid(num1, num2, num.substring(i+j))) 
          return true;
      }
    }
    return false;
  }
  
  private boolean isValid(long num1, long num2, String num) {
    if(num.length() == 0)
      return true;
    long sum = num1 + num2;
    String temp = "" + sum;
    // If the remaining string does not begin with the sum of num1+num2, then it is
    // not possible to be an Additive Number.
    if(!num.startsWith(temp))
      return false;
    return isValid(num2, sum, num.substring(temp.length()));
  }
}
