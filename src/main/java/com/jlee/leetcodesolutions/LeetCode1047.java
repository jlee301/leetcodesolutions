package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode1047 {
  /*
   * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
   */
  public String removeDuplicates(String S) {
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < S.length(); i++) {
      char ch = S.charAt(i);
      if(!stack.isEmpty() && stack.peek() == ch) {
        stack.pop();
        continue;
      }
      stack.push(ch);
    }
    
    // Construct final output
    String result = "";
    while(!stack.isEmpty())
      result = stack.pop() + result;
    
    return result;
  }
}
