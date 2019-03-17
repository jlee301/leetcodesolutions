package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode0020 {
  /*
   * Given a string containing just the characters '(', ')', '{', '}', '[' and
   * ']', determine if the input string is valid. The brackets must close in the
   * correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
   * 
   * https://leetcode.com/problems/valid-parentheses/description/
   */
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if(ch == ')' || ch == '}' || ch == ']') {
        // If next char is a closing bracket, 
        // then the top of the stack must be the corresponding opening bracket
        if(stack.isEmpty())
          return false;
        
        char prev = stack.pop();
        if(ch == ')' && prev != '(')
          return false;
        
        if(ch == '}' && prev != '{')
          return false;
        
        if(ch == ']' && prev != '[')
          return false;
      }
      else
        stack.push(ch);
    }
    // There should be nothing in the stack for this to be valid
    return stack.isEmpty();
  }
}
