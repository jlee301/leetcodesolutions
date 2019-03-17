package com.jlee.leetcodesolutions;

public class LeetCode0629 {
  /*
   * Given two integers n and k, find how many different arrays consist of numbers
   * from 1 to n such that there are exactly k inverse pairs.
   * 
   * We define an inverse pair as following: For ith and jth element in the array,
   * if i < j and a[i] > a[j] then it's an inverse pair; Otherwise, it's not.
   * 
   * Since the answer may be very large, the answer should be modulo 10^9 + 7.
   * 
   * Note:
   * The integer n is in the range [1, 1000] and k is in the range [0, 1000].
   * 
   * https://leetcode.com/problems/k-inverse-pairs-array/description/
   */  
  public int kInversePairs(int n, int k) {
    return kInversePairs(n, k, new Integer[n+1][k+1]);
  }
  
  private int kInversePairs(int n, int k, Integer[][] memo) {
    // Base cases
    // k == 0, the only ordering is ascending order
    // n == 0, there is no possible inverse pairs
    if(k == 0) return 1;
    if(n == 0) return 0;
    
    if(memo[n][k] != null)
      return memo[n][k];
    
    // Summing inverse pairs of n-1 from k == [0:k]
    // equals the number of inverse pairs for n with k inverse pairs
    int count = 0;
    for(int i = 0; i <= Math.min(n-1, k); i++) {
      count = (count + kInversePairs(n-1, k-i, memo)) % 1000000007;
    }
    memo[n][k] = count;
    return count;
  }
}
