package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode150 {
  /*
   * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
   * 
   * Valid operators are +, -, *, /. Each operand may be an integer or another
   * expression.
   * 
   * Some examples:
   * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
   * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
   * 
   * https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
   */
  public int evalRPN(String[] tokens) {
    if(tokens == null || tokens.length == 0)
      return 0;
    
    Stack<Integer> operands = new Stack<>();
    int op1 = 0, op2 = 0;
    for(String op : tokens) {
      if(op.equals("+")) {
        op2 = operands.pop();
        op1 = operands.pop();
        operands.push(op1+op2);
      } else if(op.equals("-")) {
        op2 = operands.pop();
        op1 = operands.pop();
        operands.push(op1-op2);        
      } else if(op.equals("*")) {
        op2 = operands.pop();
        op1 = operands.pop();
        operands.push(op1*op2);
      } else if(op.equals("/")) {
        op2 = operands.pop();
        op1 = operands.pop();
        operands.push(op1/op2);
      } else {
        operands.push(Integer.valueOf(op));
      }
    }
    return operands.pop();
  }
}
