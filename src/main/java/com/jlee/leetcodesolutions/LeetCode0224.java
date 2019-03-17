package com.jlee.leetcodesolutions;

import java.util.Stack;
public class LeetCode0224 {
  /*
   * Implement a basic calculator to evaluate a simple expression string.
   * 
   * The expression string may contain open ( and closing parentheses ), the plus
   * + or minus sign -, non-negative integers and empty spaces.
   * 
   * https://leetcode.com/problems/basic-calculator/description/
   */
  public int calculate(String s) {
    // The use of stack is to store the previous result and sign when we encounter
    // an open parenthesis
    Stack<Integer> stack = new Stack<>();
    int result = 0;
    int sign = 1;
    int num = 0;
    
    // Iterate through the entire string
    for(int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if(Character.isDigit(ch)) {
        num = num * 10 + Character.getNumericValue(ch);
      }
      else if(ch == '+') {
        // apply previous sign to the number, add to the result
        result += sign * num;
        sign = 1;
        num = 0;
      }
      else if(ch == '-') {
        // apply previous sign to the number, add to the result
        result += sign * num;
        sign = -1;
        num = 0;
      }
      else if(ch == '(') {
        // store the current result and previous sign into the stack
        stack.push(result);
        stack.push(sign);
        // reset values for calculating inside the parenthesis
        result = 0;
        sign = 1;
        num = 0;
      }
      else if(ch == ')') {
        // finish off the calculation of the parenthesis
        result += sign * num;
        // now include the sign and result leading up to the open parenthesis
        result *= stack.pop();
        result += stack.pop();
        // reset the sign and num
        sign = 1;
        num = 0;
      }
    }
    result += sign * num;
    return result;
  }
}
