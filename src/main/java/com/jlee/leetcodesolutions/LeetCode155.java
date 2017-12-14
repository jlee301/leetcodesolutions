package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode155 {
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
}

class MinStack {
  private int min;
  private Stack<Stack<Integer>> stack;

  public MinStack() {
    stack = new Stack<Stack<Integer>>();
  }

  public void push(int x) {
    int prevMin = min;
    if (stack.isEmpty() || x < min) {
      min = x;
    }
    Stack<Integer> entry = new Stack<Integer>();
    // Store entry[0] = value
    // Store entry[1] = previous min value
    entry.push(x);
    entry.push(prevMin);
    stack.push(entry);
  }

  public void pop() {
    if (stack.isEmpty())
      return;
    // Set the min value to the previous min value on top of the stack.
    min = stack.peek().get(1);
    stack.pop();
  }

  public int top() {
    if(stack.isEmpty())
      return 0;
    return stack.peek().get(0);
  }

  public int getMin() {
    return min;
  }
}
