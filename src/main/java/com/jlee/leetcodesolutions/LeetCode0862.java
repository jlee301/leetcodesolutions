package com.jlee.leetcodesolutions;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode0862 {
  /*
   * Return the length of the shortest, non-empty, contiguous subarray of A with
   * sum at least K.
   * 
   * If there is no non-empty subarray with sum at least K, return -1.
   * 
   * Note:
   * 1. 1 <= A.length <= 50000
   * 2. -10 ^ 5 <= A[i] <= 10 ^ 5
   * 3. 1 <= K <= 10 ^ 9
   */
  public int shortestSubarray(int[] A, int K) {
    int size = Integer.MAX_VALUE;
    int N = A.length;

    // sum[i] = cumulative sum from A[0] + A[1] + ... + A[i-1]
    // sum[j] - sum[i] = contiguous sum A[i] thru A[j-1]
    int[] sum = new int[N+1];
    for(int i = 0; i < N; i++)
      sum[i+1] = sum[i] + A[i];

    Deque<Integer> dq = new LinkedList<>();
    for(int i = 0; i < N+1; i++) {
      // Check the front of queue if >= K
      // 1. We no longer need to check the element
      // 2. If it meets the criteria for further elements the distance will be larger
      while(!dq.isEmpty() && sum[i] - sum[dq.peekFirst()] >= K)
        size = Math.min(size, i - dq.pollFirst());
      
      // Check the back of the queue
      // 1. Keep queue increasing
      // 2. Keeps contiguous array shorter
      // 3. Makes possible sum bigger
      while(!dq.isEmpty() && sum[i] <= sum[dq.peekLast()])
        dq.pollLast();
      
      dq.addLast(i);
    }
    
    return size == Integer.MAX_VALUE ? -1 : size;
  }  
}
