package com.jlee.leetcodesolutions;

public class LeetCode258 {
  /*
   * Given a non-negative integer num, repeatedly add all its digits until the
   * result has only one digit.
   * 
   * For example:
   * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only
   * one digit, return it.
   * 
   * Follow up: Could you do it without any loop/recursion in O(1) runtime?
   * 
   * https://leetcode.com/problems/add-digits/description/
   */
  public int addDigits(int num) {
    while(num > 10) {
      int result = 0;
      while(num != 0) {
        result += num % 10;
        num /= 10;
      }
      num = result;
    }
    return num;
  }
  
  public int addDigitsNoLoops(int num) {
    if(num <= 0)
      return num;
    else if(num % 9 == 0)
      return 9;
    else
      return num % 9;
  }
}
