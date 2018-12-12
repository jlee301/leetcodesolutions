package com.jlee.leetcodesolutions;

public class LeetCode641 {
  /*
   * https://leetcode.com/problems/design-circular-deque/
   */
  private int[] queue;
  private int limit;
  private int size;
  private int head;
  private int tail;
  
  /** Initialize your data structure here. Set the size of the deque to be k. */
  public LeetCode641(int k) {
    queue = new int[k];
    limit = k;
    size = 0;
    head = 0;
    tail = 0;
  }
    
  /** Adds an item at the front of Deque. Return true if the operation is successful. */
  public boolean insertFront(int value) {
    if(size == limit)
      return false;
    
    if(size == 0) {
      queue[head] = value;
      tail = head;
    }
    else {
      head = prevIndex(head);
      queue[head] = value;
    }
    size++;
    return true;
  }
    
  /** Adds an item at the rear of Deque. Return true if the operation is successful. */
  public boolean insertLast(int value) {
    if(size == limit)
      return false;
    
    if(size == 0) {
      queue[tail] = value;
      head = tail;
    }
    else {
      tail = nextIndex(tail);
      queue[tail] = value;
    }
    size++;
    return true;
  }
    
  /** Deletes an item from the front of Deque. Return true if the operation is successful. */
  public boolean deleteFront() {
    if(size == 0)
      return false;
    
    head = nextIndex(head);
    size--;
    return true;
  }
    
  /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
  public boolean deleteLast() {
    if(size == 0)
      return false;
    
    tail = prevIndex(tail);
    size--;
    return true;
  }
    
  /** Get the front item from the deque. */
  public int getFront() {
    return size == 0 ? -1 : queue[head];
  }
    
  /** Get the last item from the deque. */
  public int getRear() {
    return size == 0 ? -1 : queue[tail];
  }
    
  /** Checks whether the circular deque is empty or not. */
  public boolean isEmpty() {
    return size == 0 ? true : false;      
  }
    
  /** Checks whether the circular deque is full or not. */
  public boolean isFull() {
    return size == limit ? true : false;      
  }
  
  private int nextIndex(int i) {
    return i == limit-1 ? 0 : i+1;
  }
  
  private int prevIndex(int i) {
    return i == 0 ? limit-1 : i-1;
  }
}
