package com.jlee.leetcodesolutions;

public class LeetCode0829 {
  /*
   * Given a positive integer N, how many ways can we write it as a sum of
   * consecutive positive integers?
   * 
   * Example 1:
   * Input: 5
   * Output: 2
   * Explanation: 5 = 5 = 2 + 3
   * 
   * Example 2:
   * Input: 9
   * Output: 3
   * Explanation: 9 = 9 = 4 + 5 = 2 + 3 + 4
   * 
   * Example 3:
   * Input: 15
   * Output: 4
   * Explanation: 15 = 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5
   * 
   * Note: 1 <= N <= 10 ^ 9.
   * 
   * https://leetcode.com/problems/consecutive-numbers-sum/description/
   */
  public int consecutiveNumbersSum(int N) {
    // sum = ( i ∗ (i+1) ) / 2
    // sum of first 200 integers = (200 ∗ 201) / 2 = 20100
    // sum of first 10 integers = (10 ∗ 11) / 2 = 55
    int result = 1;
    for(int i = 2; i*(i+1) / 2 <= N; i++) {
      // N = k*i + (i*(i+1) / 2)
      // N=15, i=3
      // 15 = k*3 + (3*4) / 2)
      // 9 = k*3
      int sum = i*(i+1) / 2;
      if((N - sum) % i == 0) 
        result++;
    }
    return result;
  }
}
