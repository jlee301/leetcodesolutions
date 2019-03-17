package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode0066 {
  /*
   * Given a non-negative integer represented as a non-empty array of digits, plus
   * one to the integer. You may assume the integer do not contain any leading
   * zero, except the number 0 itself. The digits are stored such that the most
   * significant digit is at the head of the list.
   * 
   * Input: [ 1, 2, 3, 4 ] 
   * Output: [ 1, 2, 3, 5 ]
   * 
   * https://leetcode.com/problems/plus-one/description/
   */
  public int[] plusOne(int[] digits) {
    Stack<Integer> stack = new Stack<>();
    // Start the carry with 1 as the plus One
    int carry = 1;
    for(int i = digits.length-1; i >= 0; i--) {
      int temp = digits[i] + carry;
      stack.add(temp % 10);
      carry = temp / 10;
    }
    if(carry != 0)
      stack.add(carry);
    
    int[] result = new int[stack.size()];
    int i = 0;
    while(!stack.isEmpty())
      result[i++] = stack.pop();
    
    return result;
  }
}
