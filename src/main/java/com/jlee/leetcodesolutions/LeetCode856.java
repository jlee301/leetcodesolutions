package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode856 {
  /*
   * Given a balanced parentheses string S, compute the score of the string based
   * on the following rule:
   * 
   * 1. () has score 1
   * 2. AB has score A + B, where A and B are balanced parentheses strings.
   * 3. (A) has score 2 * A, where A is a balanced parentheses string.
   */
  public int scoreOfParentheses(String S) {
    Stack<Integer> stack = new Stack<>();
    stack.add(0);
    
    for(char ch : S.toCharArray()) {
      if(ch == '(') {
        // Store initial value of this enclosed parentheses
        stack.add(0);
      }
      else {
        // Pop last two values
        int B = stack.pop();
        int A = stack.pop();
        // Value will either B == 0 --> () --> 1
        // or B > 0 --> 2*B
        stack.push(A + Math.max(1, 2*B));
      }
    }
    return stack.pop();
  }
}
