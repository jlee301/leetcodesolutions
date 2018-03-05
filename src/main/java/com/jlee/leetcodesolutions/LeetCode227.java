package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode227 {
  /*
   * Implement a basic calculator to evaluate a simple expression string.
   * 
   * The expression string contains only non-negative integers, +, -, *, /
   * operators and empty spaces . The integer division should truncate toward
   * zero.
   * 
   * You may assume that the given expression is always valid.
   * 
   * Some examples: 
   * "3+2*2" = 7 
   * " 3/2 " = 1 
   * " 3+5 / 2 " = 5
   * 
   * https://leetcode.com/problems/basic-calculator-ii/description/
   */
  public int calculate(String s) {
    if(s == null || s.length() == 0)
      return 0;
    
    Stack<Integer> stack = new Stack<>();
    int num = 0;
    char op = '+';
    for(int i = 0; i < s.length(); i++) {
      if(Character.isDigit(s.charAt(i)))
        num = (num*10) + s.charAt(i)-'0';
      
      if((!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ') || i == s.length()-1) {
        if(op == '+')
          stack.push(num);
        else if(op == '-')
          stack.push(-num);
        else if(op == '*')
          stack.push(stack.pop()*num);
        else
          stack.push(stack.pop()/num);
        
        op = s.charAt(i);
        num = 0;
      }
    }
    for(int n : stack)
      num += n;
    return num;
  }
}
