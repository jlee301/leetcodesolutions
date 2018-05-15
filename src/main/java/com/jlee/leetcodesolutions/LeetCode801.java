package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode801 {
  /*
   * We have two integer sequences A and B of the same non-zero length.
   * 
   * We are allowed to swap elements A[i] and B[i]. Note that both elements are in
   * the same index position in their respective sequences.
   * 
   * At the end of some number of swaps, A and B are both strictly increasing. (A
   * sequence is strictly increasing if and only if A[0] < A[1] < A[2] < ... <
   * A[A.length - 1].)
   * 
   * Given A and B, return the minimum number of swaps to make both sequences
   * strictly increasing. It is guaranteed that the given input always makes it
   * possible.
   * 
   * Note:
   * 1. A, B are arrays with the same length, and that length will be in the range
   * [1, 1000].
   * 2. A[i], B[i] are integer values in the range [0, 2000].
   * 
   * https://leetcode.com/problems/minimum-swaps-to-make-sequences-increasing/description/
   */
  public int minSwap(int[] A, int[] B) {
    int N = A.length;
    int[] keep = new int[N];
    int[] swap = new int[N];
    
    Arrays.fill(keep, Integer.MAX_VALUE);
    Arrays.fill(swap, Integer.MAX_VALUE);
    
    // Base conditions
    keep[0] = 0;
    swap[0] = 1;
    
    for(int i = 1; i < N; i++) {
      // Check the four possibilities of swapping
      if(A[i-1] < A[i] && B[i-1] < B[i]) {
        // A[i-1] B[i-1] not swapped
        // A[i] B[i] not swapped
        keep[i] = keep[i-1];
        
        // A[i-1] B[i-1] swapped
        // A[i] B[i] swapped
        swap[i] = swap[i-1] + 1;
      }
      
      if(A[i-1] < B[i] && B[i-1] < A[i]) {
        // A[i-1] B[i-1] swapped
        // A[i] B[i] not swapped
        keep[i] = Math.min(keep[i], swap[i-1]);

        // A[i-1] B[i-1] not swapped
        // A[i] B[i] swapped
        swap[i] = Math.min(swap[i], keep[i-1] + 1);        
      }
    }
    return Math.min(keep[N-1], swap[N-1]);
  }
}
