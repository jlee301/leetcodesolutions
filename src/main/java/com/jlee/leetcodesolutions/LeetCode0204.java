package com.jlee.leetcodesolutions;

public class LeetCode0204 {
  /*
   * Count the number of prime numbers less than a non-negative number, n.
   * 
   * https://leetcode.com/problems/count-primes/description/
   */
  public int countPrimes(int n) {
    // 1. Prime numbers are greater than 1 
    // 2. Only have factors of 1 and itself  
    boolean[] notPrime = new boolean[n];
    // notPrime[i] == false == i is a prime number
    // notPrime[i] == true == i is not a prime number
    
    int result = 0;
    for(int i = 2; i < n; i++) {
      if(!notPrime[i]) {
        result++;
        
        // Find all integers that have i as a factor
        for(int j = 2; i*j < n; j++)
          notPrime[i*j] = true;
      }
    }
    return result;
  }
}
