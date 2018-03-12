package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode313 {
  /*
   * Write a program to find the nth super ugly number.
   * 
   * Super ugly numbers are positive numbers whose all prime factors are in the
   * given prime list primes of size k. For example, [1, 2, 4, 7, 8, 13, 14, 16,
   * 19, 26, 28, 32] is the sequence of the first 12 super ugly numbers given
   * primes = [2, 7, 13, 19] of size 4.
   * 
   * Note:
   * 1. 1 is a super ugly number for any given primes.
   * 2. The given numbers in primes are in ascending order.
   * 3. 0 < k ≤ 100, 0 < n ≤ 106, 0 < primes[i] < 1000.
   * 4. The nth super ugly number is guaranteed to fit in a 32-bit signed integer.
   * 
   * https://leetcode.com/problems/super-ugly-number/description/
   */
  public int nthSuperUglyNumber(int n, int[] primes) {
    if(n < 1) return 0;
    
    // memo[i] stores the ith ugly number.
    int[] memo = new int[n+1];
    memo[1] = 1;
    
    // indexes[i] stores the associated index for memo[indexes[i]] for the primes[i].
    int[] indexes = new int[primes.length];
    Arrays.fill(indexes, 1);
    
    for(int i = 2; i <= n; i++) {
      // Find ith ugly number. We will use memo[i] to store the value until the min
      // is found by checking all instances of prime.
      memo[i] = Integer.MAX_VALUE;
      for(int j = 0; j < primes.length; j++)
        memo[i] = Math.min(memo[i], memo[indexes[j]] * primes[j]);
      
      // If any of the products equal memo[i], then we increment its index
      for(int j = 0; j < primes.length; j++) {
        if(memo[indexes[j]] * primes[j] == memo[i])
          indexes[j]++;
      }
    }
    return memo[n];
  }
}
