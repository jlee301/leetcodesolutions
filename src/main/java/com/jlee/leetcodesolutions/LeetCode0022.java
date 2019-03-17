package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0022 {
  /*
   * Given n pairs of parentheses, write a function to generate all combinations
   * of well-formed parentheses.
   * 
   * For example, given n = 3, a solution set is:
   * [ "((()))", "(()())", "(())()", "()(())", "()()()" ]
   * 
   * https://leetcode.com/problems/generate-parentheses/description/
   */
  private List<String> list;
  private int max;
  
  public List<String> generateParenthesis(int n){
    list = new ArrayList<String>();
    max = n;
    if(n < 1)
      return list;
    
    generateParenthesis("", 0, 0);
    return list;
  }
  
  private void generateParenthesis(String value, int op, int cp) {
    if(value.length() == max * 2) {
      list.add(value);
      return;
    }
    
    if(op < max)
      generateParenthesis(value + "(", op + 1, cp);
    
    if(cp < op)
      generateParenthesis(value + ")", op, cp + 1);
  }
}
