package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode084 {
  /*
   * Given n non-negative integers representing the histogram's bar height where
   * the width of each bar is 1, find the area of largest rectangle in the
   * histogram.
   * 
   * https://leetcode.com/problems/largest-rectangle-in-histogram/
   */
  public int largestRectangleArea(int[] heights) {
    int i = 0, maxArea = 0, area = 0;
    if(heights == null || heights.length == 0)
      return maxArea;
    
    // stack is to keep track of the width
    Stack<Integer> stack = new Stack<>();
    while(i < heights.length) {
      if(stack.isEmpty() || heights[i] >= heights[stack.peek()])
        stack.push(i++);
      else {
        // clear previous higher entries
        int top = stack.pop();
        if(stack.isEmpty())
          area = heights[top] * i;
        else
          area = heights[top] * (i - stack.peek() - 1);
          
        maxArea = Math.max(maxArea, area);
      }
    }
    
    // clear remaining entries
    while(!stack.isEmpty()) {
      int top = stack.pop();
      if(stack.isEmpty())
        area = heights[top] * i;
      else
        area = heights[top] * (i - stack.peek() - 1);
        
      maxArea = Math.max(maxArea, area);      
    }
    return maxArea;
  }
}
