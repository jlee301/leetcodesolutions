package com.jlee.leetcodesolutions;

import java.util.PriorityQueue;

public class LeetCode703 {
  /*
   * Design a class to find the kth largest element in a stream. Note that it is
   * the kth largest element in the sorted order, not the kth distinct element.
   * 
   * Your KthLargest class will have a constructor which accepts an integer k and
   * an integer array nums, which contains initial elements from the stream. For
   * each call to the method KthLargest.add, return the element representing the
   * kth largest element in the stream.
   * 
   * https://leetcode.com/problems/kth-largest-element-in-a-stream/
   */
  private PriorityQueue<Integer> pq;
  private int limit;
  
  public LeetCode703(int k, int[] nums) {
    pq = new PriorityQueue<>();
    limit = k;
    
    for(int n : nums)
      add(n);
  }
    
  public int add(int val) {
    if(pq.size() == limit) {
      if(pq.peek() < val) {
        pq.poll();
        pq.add(val);
      }
    }
    else
      pq.add(val);
    
    return pq.peek();
  }
}
