package com.jlee.leetcodesolutions;

public class LeetCode0622 {
  /*
   * https://leetcode.com/problems/design-circular-queue/
   */
  private int[] queue;
  private int limit;
  private int size;
  private int head;
  private int tail;
  private int curr;
  
  /** Initialize your data structure here. Set the size of the queue to be k. */
  public LeetCode0622(int k) {
    queue = new int[k];
    limit = k;
    size = 0;
    head = 0; // first element of the queue
    tail = 0; // last element of the queue
    curr = 0; // next location to insert into the queue
  }
    
  /** Insert an element into the circular queue. Return true if the operation is successful. */
  public boolean enQueue(int value) {
    if(size == limit)
      return false;

    queue[curr] = value;
    tail = curr;
    curr = nextIndex(curr, limit);
    size++;
    return true;
  }
    
  /** Delete an element from the circular queue. Return true if the operation is successful. */
  public boolean deQueue() {
    if(size == 0)
      return false;

    head = nextIndex(head, limit);
    size--;
    return true;
  }
    
  /** Get the front item from the queue. */
  public int Front() {
    return size == 0 ? -1 : queue[head];
  }
    
  /** Get the last item from the queue. */
  public int Rear() {
    return size == 0 ? -1 : queue[tail];  
  }
    
  /** Checks whether the circular queue is empty or not. */
  public boolean isEmpty() {
    return size == 0 ? true : false;    
  }
    
  /** Checks whether the circular queue is full or not. */
  public boolean isFull() {
    return size == limit ? true : false;  
  }
  
  private int nextIndex(int i, int limit) {
    return i == limit-1 ? 0 : i+1;
  }
}
