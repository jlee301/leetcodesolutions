package com.jlee.leetcodesolutions;

public class LeetCode775 {
  /*
   * We have some permutation A of [0, 1, ..., N - 1], where N is the length of A.
   * 
   * The number of (global) inversions is the number of i < j with 0 <= i < j < N
   * and A[i] > A[j].
   * 
   * The number of local inversions is the number of i with 0 <= i < N and A[i] >
   * A[i+1].
   * 
   * Return true if and only if the number of global inversions is equal to the
   * number of local inversions.
   * 
   * Example 1:
   * Input: A = [1,0,2]
   * Output: true
   * Explanation: There is 1 global inversion, and 1 local inversion.
   * 
   * Example 2:
   * Input: A = [1,2,0]
   * Output: false
   * Explanation: There are 2 global inversions, and 1 local inversion.
   * 
   * Note:
   * 1. A will be a permutation of [0, 1, ..., A.length - 1].
   * 2. A will have length in range [1, 5000].
   * 3. The time limit for this problem has been reduced.
   * 
   * https://leetcode.com/problems/global-and-local-inversions/description/
   */
  public boolean isIdealPermutation(int[] A) {
    for(int i = 0; i < A.length; i++) {
      // If the diff between the actual to expected element at position i
      // |A[i] - i| == 0, then order is exact (0,1,2), local == global
      // |A[i] - i| == 1, then order could be (1,0,2), local == global
      // |A[i] - i|  > 1, then order could be (1,2,0), local  < global
      // |A[i] - i|  > 1, then order could be (2,0,1), local  > global
      if(Math.abs(A[i] - i) > 1)
        return false;
    }
    return true;
  }
}
