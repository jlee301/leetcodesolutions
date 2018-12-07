package com.jlee.leetcodesolutions;

import java.util.PriorityQueue;

public class LeetCode414 {
  /*
   * Given a non-empty array of integers, return the third maximum number in this
   * array. If it does not exist, return the maximum number. The time complexity
   * must be in O(n).
   * 
   * Example 1: 
   * Input: [3, 2, 1]
   * Output: 1
   * Explanation: The third maximum is 1. 
   * 
   * Example 2: 
   * Input: [1, 2]
   * Output: 2
   * Explanation: The third maximum does not exist, so the maximum (2) is returned
   * instead. 
   * 
   * Example 3: 
   * Input: [2, 2, 3, 1]
   * Output: 1
   * Explanation: Note that the third maximum here means the third maximum
   * distinct number. Both numbers with value 2 are both considered as second
   * maximum.
   * 
   * https://leetcode.com/problems/third-maximum-number/description/
   */
  public int thirdMax(int[] nums) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int n : nums) {
      // n is already in the queue
      if(pq.contains(n))
        continue;
      
      // There is 3 numbers in the queue, and n is greater than the current third max
      if(pq.size() == 3 && n > pq.peek()) {
        pq.poll();
        pq.add(n);
      }
      else if(pq.size() < 3)
        pq.add(n);
    }
    
    if(pq.size() == 3)
      return pq.peek();
    else {
      // Empty the queue except for the max value
      while(pq.size() > 1)
        pq.poll();
      
      return pq.peek();
    }
  }
}
