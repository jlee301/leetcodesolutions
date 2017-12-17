package com.jlee.leetcodesolutions;

public class LeetCode204 {
  /*
   * Count the number of prime numbers less than a non-negative number, n.
   * 
   * https://leetcode.com/problems/count-primes/description/
   */
  public int countPrimes(int n) {
    int result = 0;
    if(n <= 1)
      return result;
    
    boolean[] isPrime = new boolean[n];
    // isPrime is not to be used as a reference at the end to count all that is
    // true -- this will be off by one because isPrime[2] is never set to true

    for (int i = 2; i < n; i++) {
      // We start at 2 because we know 2 is the first prime, and we start doing
      // deductions by the multiple of 2's, 3's, 5's, etc. We skip 4's because the
      // process of elimination using Sieve of Eratosthenes will have set isPrime[4] =
      // true during the multiple of 2's elimination.
      if (isPrime[i] == false) {
        result++;
        for (int j = 2; i * j < n; j++) {
          isPrime[i * j] = true;
        }
      }
    }
    return result;
  }
}
