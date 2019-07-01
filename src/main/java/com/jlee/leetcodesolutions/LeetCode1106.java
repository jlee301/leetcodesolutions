package com.jlee.leetcodesolutions;

public class LeetCode1106 {
  /*
   * https://leetcode.com/problems/parsing-a-boolean-expression/
   */
  public boolean parseBoolExpr(String expression) {
    if(expression.equals("t"))
      return true;
    if(expression.equals("f"))
      return false;
    
    // start keeps track of the starting index position of the expression
    int start = 2;
    // count == 0 means you found the end of the expression
    int count = 0;
    char op = expression.charAt(0);
    boolean result = op != '|';
    
    for(int i = 1; i < expression.length(); i++) {
      char ch = expression.charAt(i);
      if(ch == '(')
        count++;
      if(ch == ')')
        count--;
      
      // Conditions to evaluate the expression
      // 1. Reached the end of an expression
      // 2. Reached a comma separation
      if(ch == ')' && count == 0 || ch == ',' && count == 1) {
        boolean next = parseBoolExpr(expression.substring(start, i));
        start = i + 1;
        
        if(op == '&')
          result &= next;
        else if(op == '|')
          result |= next;
        else
          result = !next;
      }
    }    
    return result;
  }
}
