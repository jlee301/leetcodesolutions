package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode225 {
  /*
   * Implement the following operations of a stack using queues:
   * push(x) -- Push element x onto stack.
   * pop() -- Removes the element on top of the stack.
   * top() -- Get the top element.
   * empty() -- Return whether the stack is empty.
   * 
   * Notes: 
   * You must use only standard operations of a queue -- which means only
   * push to back, peek/pop from front, size, and is empty operations are valid.
   * 
   * Depending on your language, queue may not be supported natively. You may
   * simulate a queue by using a list or deque (double-ended queue), as long as
   * you use only standard operations of a queue.
   * 
   * You may assume that all operations are valid (for example, no pop or top
   * operations will be called on an empty stack).
   * 
   * https://leetcode.com/problems/implement-stack-using-queues/description/
   */
}

class MyStack {
  private Queue<Integer> queue;
  
  /** Initialize your data structure here. */
  public MyStack() {
    // Stack = LIFO
    // Queue = FIFO
    queue = new LinkedList<Integer>();
  }

  /** Push element x onto stack. */
  public void push(int x) {
    // int=4 --> 4
    // int=3 --> 4, 3 --> 3, 4
    // int=2 --> 3, 4, 2 --> 2, 3, 4
    // int=1 --> 2, 3, 4, 1 --> 1, 2, 3, 4

    // This add puts value to the bottom of the FIFO queue
    queue.add(x);
    for(int i = 0; i < queue.size() - 1; i++) {
      // Now this takes from the top of the FIFO queue and puts it to the bottom up
      // until the entry inserted above is now on the top.
      queue.add(queue.poll());
    }
  }

  /** Removes the element on top of the stack and returns that element. */
  public int pop() {
    return queue.poll();
  }

  /** Get the top element. */
  public int top() {
    return queue.peek();
  }

  /** Returns whether the stack is empty. */
  public boolean empty() {
    return queue.isEmpty();
  }
}