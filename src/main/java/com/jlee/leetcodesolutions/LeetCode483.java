package com.jlee.leetcodesolutions;

import java.math.BigInteger;

public class LeetCode483 {
  /*
   * For an integer n, we call k>=2 a good base of n, if all digits of n base k
   * are 1.
   * 
   * Now given a string representing n, you should return the smallest good base
   * of n in string format.
   * 
   * Note:
   * 1. The range of n is [3, 10^18].
   * 2. The string representing n is always valid and will not have leading zeros.
   * 
   * https://leetcode.com/problems/smallest-good-base/description/
   */
  public String smallestGoodBase(String n) {
    // summation i=0 thru i = m-1 --> k^i = n
    //    k^m-1 + k^m-2 + ... + k^1 + k^0 = n
    //              ((k^m) - 1) / (k - 1) = n
    //                          (k^m) - 1 = n * (k-1)
    BigInteger N = new BigInteger(n);
    long K = Long.MAX_VALUE;
    
    // log2(10^18) ~ 60
    // so we try m = 2 thru 60 to solve for min base k using binary search
    for(int m = 2; m <= 60; m++) {
      // Binary search the value of the base k
      long left = 2, right = Long.MAX_VALUE;
      while(left <= right) {
        long mid = left + (right - left) / 2;
        // LHS = k^m - 1
        // RHS = n * (k-1)
        BigInteger LHS = BigInteger.valueOf(mid).pow(m).subtract(BigInteger.ONE);
        BigInteger RHS = N.multiply(BigInteger.valueOf(mid).subtract(BigInteger.ONE));
        
        int compare = LHS.compareTo(RHS);
        if(compare == 0) {
          K = Math.min(K, mid);
          break;
        }
        else if(compare < 0) {
          // RHS is larger, increase left
          left = mid + 1;
        }
        else {
          // LHS is larger, decrease right
          right = mid - 1;
        }
      }
    }
    return String.valueOf(K);
  }
}
