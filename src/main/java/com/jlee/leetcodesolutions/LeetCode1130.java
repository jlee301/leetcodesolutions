package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode1130 {
  /*
   * https://leetcode.com/problems/minimum-cost-tree-from-leaf-values/
   */
  public int mctFromLeafValues(int[] arr) {
    Stack<Integer> stack = new Stack<>();
    stack.add(Integer.MAX_VALUE);
    
    int sum = 0;
    for(int n : arr) {
      // Maintain the largest leaf in the stack
      while(stack.peek() <= n) {
        int curr = stack.pop();
        sum += curr * Math.min(stack.peek(), n);
      }
      stack.add(n);
    }
    
    // If there are still leafs left in the stack, calculate their parent's product
    while(stack.size() > 2)
      sum += stack.pop() * stack.peek();
    
    return sum;
  }
}
