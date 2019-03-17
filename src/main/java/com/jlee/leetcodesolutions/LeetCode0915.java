package com.jlee.leetcodesolutions;

import java.util.PriorityQueue;

public class LeetCode0915 {
  /*
   * Given an array A, partition it into two (contiguous) subarrays left and right
   * so that:
   * 1. Every element in left is less than or equal to every element in right.
   * 2. left and right are non-empty.
   * 3. left has the smallest possible size.
   * 
   * Return the length of left after such a partitioning. It is guaranteed that
   * such a partitioning exists.
   * 
   * https://leetcode.com/problems/partition-array-into-disjoint-intervals/description/
   */
  public int partitionDisjoint(int[] A) {
    // Dump all integers into a priority queue with the numbers descending
    // We start with i = 1 because left is guaranteed to be non-empty
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i = 1; i < A.length; i++)
      pq.add(A[i]);
    
    // A = [5,0,3,8,6], maxLeft = 5, pq = [0,3,6,8]
    // i=1, maxLeft = 5, pq = [0,3,6,8]
    // i=2, maxLeft = 5, pq = [3,6,8]
    // i=3, maxLeft = 5, pq = [6,8]
    int i = 1, maxLeft = A[0];
    while(pq.peek() < maxLeft) {
      maxLeft = Math.max(maxLeft, A[i]);
      pq.remove(A[i++]);
    }
    return i;
  }
}
