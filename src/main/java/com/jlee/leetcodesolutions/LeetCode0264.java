package com.jlee.leetcodesolutions;

public class LeetCode0264 {
  /*
   * Write a program to find the n-th ugly number.
   * 
   * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
   * For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10
   * ugly numbers.
   * 
   * Note that 1 is typically treated as an ugly number, and n does not exceed
   * 1690.
   */
  public int nthUglyNumber(int n) {
    if(n < 1)
      return 0;
    /*
     * 1*2=2   2*2=4    3*2=6    4*2=8    5*2=10
     * 1*3=3   2*3=6    3*3=9    4*3=12   5*3=15
     * 1*5=5   2*5=10   3*5=15   4*5=20   5*5=25
     */
    int[] memo = new int[n+1];
    memo[1] = 1;
    int ind2 = 1, ind3 = 1, ind5 = 1;
    int fac2 = 2, fac3 = 3, fac5 = 5;
    for(int i = 2; i <= n; i++) {
      // Take the lowest of the product as the next ugly number.
      int next = Math.min(Math.min(fac2, fac3), fac5);
      memo[i] = next;
      // If any of the products equal the next ugly entry, then we increment them and
      // get its next product
      if(fac2 == next)
        fac2 = memo[++ind2] * 2;
      if(fac3 == next)
        fac3 = memo[++ind3] * 3;
      if(fac5 == next)
        fac5 = memo[++ind5] * 5;
    }
    return memo[n];
  }
}
