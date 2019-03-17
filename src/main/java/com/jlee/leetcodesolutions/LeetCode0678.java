package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode0678 {
  /*
   * Given a string containing only three types of characters: '(', ')' and '*',
   * write a function to check whether this string is valid. We define the
   * validity of a string by these rules:
   * 1. Any left parenthesis '(' must have a corresponding right parenthesis ')'.
   * 2. Any right parenthesis ')' must have a corresponding left parenthesis '('.
   * 3. Left parenthesis '(' must go before the corresponding right parenthesis
   * ')'.
   * 4. '*' could be treated as a single right parenthesis ')' or a single left
   * parenthesis '(' or an empty string.
   * 5. An empty string is also valid.
   * 
   * Note: The string size will be in the range [1, 100].
   * 
   * https://leetcode.com/problems/valid-parenthesis-string/description/
   */
  public boolean checkValidString(String s) {
    if(s == null)
      return false;
    
    // Store positions of left parenthesis and asterisks into stack
    Stack<Integer> leftStack = new Stack<>(), wildStack = new Stack<>();
    for(int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if(ch == '(')
        leftStack.push(i);
      else if(ch == ')') {
        if(!leftStack.isEmpty())
          leftStack.pop();
        else if(!wildStack.isEmpty())
          wildStack.pop();
        else
          // There are no left parenthesis or asterisks left to compensate a ')'
          return false;
      }
      else
        wildStack.push(i);
    }
    // Now check what is remaining
    // 1. Do you have enough asterisks to cover left parenthesis that are left
    // 2. If the asterisks is before the left position, then it is not possible
    while(!leftStack.isEmpty()) {
      int leftPos = leftStack.pop();
      if(wildStack.isEmpty() || wildStack.pop() < leftPos)
        return false;
    }
    // If there are any asterisks left at this point, they are all treated as empty space.
    return true;
  }
}
