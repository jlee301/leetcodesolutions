package com.jlee.leetcodesolutions;

public class LeetCode0779 {
  /*
   * On the first row, we write a 0. Now in every subsequent row, we look at the
   * previous row and replace each occurrence of 0 with 01, and each occurrence of
   * 1 with 10.
   * 
   * Given row N and index K, return the K-th indexed symbol in row N. (The values
   * of K are 1-indexed.) (1 indexed).
   * 
   * https://leetcode.com/problems/k-th-symbol-in-grammar/description/
   */
  public int kthGrammar(int N, int K) {
    // Base case
    if(N == 1) return 0;
    
    // N=1        0
    //          /   \
    // N=2     0     1
    //        / \   / \
    // N=3   0   1 1   0
    
    if(K % 2 == 0) // Right child of parent N-1
      return kthGrammar(N-1, K/2) == 0 ? 1 : 0;
    else // Left child of parent N-1
      return kthGrammar(N-1, (K+1)/2) == 0 ? 0 : 1;
  }
}
