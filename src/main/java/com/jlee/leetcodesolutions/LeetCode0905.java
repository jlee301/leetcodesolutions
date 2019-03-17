package com.jlee.leetcodesolutions;

public class LeetCode0905 {
  /*
   * Given an array A of non-negative integers, return an array consisting of all
   * the even elements of A, followed by all the odd elements of A.
   * 
   * You may return any answer array that satisfies this condition.
   * 
   * https://leetcode.com/contest/weekly-contest-102/problems/sort-array-by-parity/
   */
  public int[] sortArrayByParity(int[] A) {
    if(A == null || A.length < 2)
      return A;
    
    int N = A.length;
    int[] result = new int[N];
    int left = 0, right = N-1;
    for(int num : A) {
      if(num % 2 == 0) {
        // even
        result[left++] = num;
      }
      else {
        // odd
        result[right--] = num;
      }
    }
    return result;
  }
}
