package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode232 {
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
}

class MyQueue {
  // Queue (FIFO) but using Stack (LIFO)
  private Stack<Integer> stack;
  
  /** Initialize your data structure here. */
  public MyQueue() {
    stack = new Stack<Integer>();
  }
  
  /** Push element x to the back of queue. */
  public void push(int x) {
    Stack<Integer> tempStack = new Stack<Integer>();
    // Dump everything into temp stack
    // stack = 1   -->   tempStack 2
    //         2                   1
    //
    // Then add x=3 into stack and move tempStack back into stack.
    // stack = 3   <--   tempStack 2
    //                             1
    //
    // stack = 1         tempStack
    //         2
    //         3
    while(!stack.isEmpty())
      tempStack.add(stack.pop());
    
    stack.add(x);
    while(!tempStack.isEmpty())
      stack.add(tempStack.pop());
  }
  
  /** Removes the element from in front of queue and returns that element. */
  public int pop() {
      return stack.pop();
  }
  
  /** Get the front element. */
  public int peek() {
      return stack.peek();
  }
  
  /** Returns whether the queue is empty. */
  public boolean empty() {
      return stack.isEmpty();
  }
}
