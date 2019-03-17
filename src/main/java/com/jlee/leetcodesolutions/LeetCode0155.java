package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode0155 {
  /*
   * Design a stack that supports push, pop, top, and retrieving the minimum
   * element in constant time.
   * 
   * push(x) -- Push element x onto stack. 
   * pop() -- Removes the element on top of the stack. 
   * top() -- Get the top element. 
   * getMin() -- Retrieve the minimum element in the stack.
   * 
   * https://leetcode.com/problems/min-stack/description/
   */
  private Stack<Integer> stack;
  private int min;
  
  /** initialize your data structure here. */
  public LeetCode0155() {
    stack = new Stack<>();
    min = Integer.MAX_VALUE;
  }
    
  public void push(int x) {
    if(x <= min) {
      // Push the previous min value onto the stack
      // This will be used to recover the previous value
      stack.push(min);
      min = x;
    }
    // Push actual value onto the stack afterwards
    stack.push(x);
  }
    
  public void pop() {
    if(stack.isEmpty())
      return;
    
    if(stack.pop() == min) {
      // Set previous min value
      min = stack.pop();
    }
  }
    
  public int top() {
    return stack.peek();
  }
    
  public int getMin() {
    return min;
  }
}


