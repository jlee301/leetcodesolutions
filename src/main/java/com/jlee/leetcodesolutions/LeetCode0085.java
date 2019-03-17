package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode0085 {
  /*
   * Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle
   * containing only 1's and return its area.
   * 
   * https://leetcode.com/problems/maximal-rectangle
   */
  public int maximalRectangle(char[][] matrix) {
    int maxArea = 0;
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
      return maxArea;
    
    // Create histogram from matrix
    int[] hist = new int[matrix[0].length];    
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        if(matrix[i][j] == '0')
          hist[j] = 0;
        else
          hist[j]++;
      }
      maxArea = Math.max(maxArea, maxRectangleHistogram(hist));
    }
    return maxArea;
  }
  
  private int maxRectangleHistogram(int[] hist) {
    // {3,1,3,2,2}
    int maxArea = 0, area = 0, i = 0;
    // Stack is used as an aid to determine width of the rectangle
    Stack<Integer> stack = new Stack<>();
    
    // Populate stack with strictly same height or higher
    // If lower height appears, must perform calculation
    while(i < hist.length) {
      if(stack.isEmpty() || hist[i] >= hist[stack.peek()])
        stack.push(i++);
      else {
        int top = stack.pop();
        if(stack.isEmpty())
          area = hist[top] * i;
        else
          area = hist[top] * (i - stack.peek() - 1);
        
        maxArea = Math.max(maxArea, area);
      }
    }
    
    // Clear remaining entries in stack
    while(!stack.isEmpty()) {
      int top = stack.pop();
      if(stack.isEmpty())
        area = hist[top] * i;
      else
        area = hist[top] * (i - stack.peek() - 1);
      
      maxArea = Math.max(maxArea, area);
    }
    return maxArea;
  }
}
