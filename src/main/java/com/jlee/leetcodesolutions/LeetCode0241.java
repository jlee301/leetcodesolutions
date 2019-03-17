package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0241 {
  /*
   * Given a string of numbers and operators, return all possible results from
   * computing all the different possible ways to group numbers and operators. The
   * valid operators are +, - and *.
   * 
   * Example 1
   * Input: "2-1-1".
 
   * ((2-1)-1) = 0
   * (2-(1-1)) = 2
   * Output: [0, 2]
   * 
   * Example 2
   * Input: "2*3-4*5"
   * 
   * (2*(3-(4*5))) = -34
   * ((2*3)-(4*5)) = -14
   * ((2*(3-4))*5) = -10
   * (2*((3-4)*5)) = -10
   * (((2*3)-4)*5) = 10
   * Output: [-34, -14, -10, -10, 10]
   * 
   * https://leetcode.com/problems/different-ways-to-add-parentheses/description/
   */
  public List<Integer> diffWaysToCompute(String input) {
    List<Integer> list = new ArrayList<>();
    if(input == null || input.length() == 0)
      return list;
    
    /*
     * input = "2*3-4*5"
     * recursive(2) * recursive(3-4*5)
     * recursive(2*3) - recursive(4*5)
     * recursive(2*3-4) * recursive(5)
     */
    for(int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if(ch == '+' || ch == '-' || ch == '*') {
        List<Integer> leftOperands = diffWaysToCompute(input.substring(0, i));
        List<Integer> rightOperands = diffWaysToCompute(input.substring(i+1));
        for(int left : leftOperands) {
          for(int right: rightOperands) {
            if(ch == '+')
              list.add(left+right);
            else if(ch == '-')
              list.add(left-right);
            else // ch == '*'
              list.add(left*right);
          }
        }
      }
    }
    if(list.size() == 0) // no operator, just a number
      list.add(Integer.valueOf(input));
    
    return list;
  }
}
