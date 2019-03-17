package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode0032 {
  /*
   * Given a string containing just the characters '(' and ')', find the length of
   * the longest valid (well-formed) parentheses substring.
   * 
   * https://leetcode.com/problems/longest-valid-parentheses/
   */
  public int longestValidParentheses(String s) {
    int max = 0, N = s.length();
    
    // stack is used to store indexes of invalid parentheses
    Stack<Integer> stack = new Stack<>();
    for(int i = 0; i < N; i++) {
      if(s.charAt(i) == '(')
        stack.push(i);
      else {
        if(stack.isEmpty())
          stack.push(i);        
        else {
          // Match ')' with a '('
          if(s.charAt(stack.peek()) == '(')
            stack.pop();
          else
            stack.push(i);
        }
      }
    }
    
    // Length between adjacent invalid parentheses is the length of valid parenthesis
    int a = N;
    while(!stack.isEmpty()) {
      int b = stack.pop();
      max = Math.max(max, a - b - 1);
      a = b;
    }
    // Last check from zero to last adjacent invalid parenthesis
    max = Math.max(max, a);
    return max;
  }
}
