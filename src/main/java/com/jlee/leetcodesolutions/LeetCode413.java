package com.jlee.leetcodesolutions;

public class LeetCode413 {
  /*
   * A sequence of number is called arithmetic if it consists of at least three
   * elements and if the difference between any two consecutive elements is the
   * same.
   * 
   * Example:
   * A = [1, 2, 3, 4]
   * return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3,
   * 4] itself.
   * 
   * https://leetcode.com/problems/arithmetic-slices/description/
   */
  public int numberOfArithmeticSlices(int[] A) {
    if(A == null)
      return 0;
    
    int result = 0;
    for(int i = 0; i < A.length-2; i++) {
      int diff = A[i+1] - A[i];
      for(int j = i + 2; j < A.length; j++) {
        if(A[j] - A[j-1] == diff)
          result++;
        else 
          break;
      }
    }
    return result;
  }
}
