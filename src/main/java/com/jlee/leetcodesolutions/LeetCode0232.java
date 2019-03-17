package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode0232 {
  /*
   * Implement the following operations of a queue using stacks:
   * push(x) -- Push element x to the back of queue.
   * pop() -- Removes the element from in front of queue.
   * peek() -- Get the front element.
   * empty() -- Return whether the queue is empty.
   * 
   * Notes:
   * You must use only standard operations of a stack -- which means only push to
   * top, peek/pop from top, size, and is empty operations are valid.
   * 
   * Depending on your language, stack may not be supported natively. You may
   * simulate a stack by using a list or deque (double-ended queue), as long as
   * you use only standard operations of a stack.
   * 
   * You may assume that all operations are valid (for example, no pop or peek
   * operations will be called on an empty queue).
   * 
   * https://leetcode.com/problems/implement-queue-using-stacks/description/
   */
  private Stack<Integer> stackA;
  private Stack<Integer> stackB;
  
  /** Initialize your data structure here. */
  public LeetCode0232() {
    stackA = new Stack<>();
    stackB = new Stack<>();
  }
    
  /** Push element x to the back of queue. */
  public void push(int x) {
    while(!stackA.isEmpty())
      stackB.push(stackA.pop());
    stackA.push(x);
    
    while(!stackB.isEmpty())
      stackA.push(stackB.pop());
  }
    
  /** Removes the element from in front of queue and returns that element. */
  public int pop() {
    return stackA.pop();
  }
    
  /** Get the front element. */
  public int peek() {
    return stackA.peek();
  }
    
  /** Returns whether the queue is empty. */
  public boolean empty() {
    return stackA.isEmpty();
  }
}
