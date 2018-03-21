package com.jlee.leetcodesolutions;

import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode378 {
  /*
   * Given a n x n matrix where each of the rows and columns are sorted in
   * ascending order, find the kth smallest element in the matrix.
   * 
   * Note that it is the kth smallest element in the sorted order, not the kth
   * distinct element.
   * 
   * Example:
   * 
   * matrix = [ [ 1,  5,  9],     k = 8
   *            [10, 11, 13], 
   *            [12, 13, 15] ] 
   * return 13. 
   * 
   * Note: You may assume k is always valid, 1 ≤ k ≤ n^2.
   * 
   * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/
   */
  public int kthSmallest(int[][] matrix, int k) {
    if(matrix == null || matrix.length == 0)
      return Integer.MAX_VALUE;
    
    // PriorityQueue will naturally order the elements
    PriorityQueue<Integer> queue = new PriorityQueue<>(k, Collections.reverseOrder());
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        if(queue.size() < k)
          queue.add(matrix[i][j]);
        else {
          if(queue.peek() > matrix[i][j]) {
            queue.poll();
            queue.add(matrix[i][j]);
          }
        }
      }
    }
    return queue.peek();
  }
}
