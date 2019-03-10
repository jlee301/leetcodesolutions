package com.jlee.leetcodesolutions;

import java.util.PriorityQueue;

public class LeetCode1005 {
  /*
   * https://leetcode.com/contest/weekly-contest-127/problems/maximize-sum-of-array-after-k-negations/
   */
  public int largestSumAfterKNegations(int[] A, int K) {
    int sum = 0;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int n : A) {
      sum += n;
      pq.add(n);
    }
    
    while(K > 0) {
      int n = pq.poll();
      sum -= n;
      n *= -1;
      sum += n;
      pq.add(n);
      K--;
    }
    return sum;
  }
}
