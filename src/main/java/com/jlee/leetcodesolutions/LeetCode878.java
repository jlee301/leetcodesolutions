package com.jlee.leetcodesolutions;

public class LeetCode878 {
  /*
   * A positive integer is magical if it is divisible by either A or B.
   * 
   * Return the N-th magical number. Since the answer may be very large, return it
   * modulo 10^9 + 7.
   * 
   * https://leetcode.com/contest/weekly-contest-95/problems/nth-magical-number/
   */
  public int nthMagicalNumber(int N, int A, int B) {
    int LCM = (A*B) / gcd(A, B);
    long low = 0;
    long high = (long) N * (long) Math.max(A, B);
    while(low < high) {
      long mid = low + ((high-low) / 2);
      // Calculate how many magical numbers exist for mid
      // 1. How many multiples of A
      // 2. How many multiples of B
      // 3. Deduct multiples of both as they are counted twice from 1 and 2
      long count = (mid / A) + (mid / B) - (mid / LCM);
      if(count < N)
        low = mid + 1;
      else
        high = mid;
    }
    return (int) (low % (long) 1000000007);
  }
  
  private int gcd(int a, int b) {
    if(a == 0)
      return b;
    return gcd(b % a, a);
  }
}
