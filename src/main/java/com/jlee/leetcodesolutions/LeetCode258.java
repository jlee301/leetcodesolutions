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
    while(num > 9) {
      // Sum up each digit
      int sum = 0;
      while(num > 0) {
        sum += num % 10;
        num /= 10;
      }      
      num = sum;
    }
    return num;
  }
}
