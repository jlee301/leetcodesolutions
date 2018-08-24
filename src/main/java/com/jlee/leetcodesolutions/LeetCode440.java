package com.jlee.leetcodesolutions;

public class LeetCode440 {
  /*
   * Given integers n and k, find the lexicographically k-th smallest integer in
   * the range from 1 to n.
   * 
   * Note: 1 ≤ k ≤ n ≤ 109.
   * 
   * https://leetcode.com/problems/k-th-smallest-in-lexicographical-order/description/
   */
  public int findKthNumber(int n, int k) {
    int curr = 1;
    k--;
    while(k > 0) {
      int count = helper(n, curr, curr+1);
      if(count <= k) {
        curr++;
        k -= count;
      }
      else {
        curr *= 10;
        k--;
      }
    }
    return curr;
  }
  
  private int helper(int n, long n1, long n2) {
    // Find how many numbers are between n1(inclusive) and n2 (exclusive)
    // ie n=103, n1=1, n2=2 --> 15 total integers
    // First loop will find: 1
    // Second loop will find: 10, 11, 12, 13, 14, 15, 16, 17, 18, 19
    // Third loop will find: 100, 101, 102, 103
    int count = 0;
    while(n1 <= n) {
      count += Math.min(n+1, n2) - n1;
      n1 *= 10;
      n2 *= 10;
    }
    return count;
  }
}
