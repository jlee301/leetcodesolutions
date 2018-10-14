package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode923 {
  /*
   * Given an integer array A, and an integer target, return the number of tuples
   * i, j, k such that i < j < k and A[i] + A[j] + A[k] == target.
   * 
   * As the answer can be very large, return it modulo 10^9 + 7.
   * 
   * https://leetcode.com/contest/weekly-contest-106/problems/3sum-with-multiplicity/
   */
  public int threeSumMulti(int[] A, int target) {
    long result = 0L;
    int MOD = 1_000_000_007;
    Arrays.sort(A);
    
    // Go through each integer assuming that number is A[i]
    for(int i = 0; i < A.length; i++) {
      // Now we must find A[j] and A[k] while maintaining i < j < k
      int j = i+1, k = A.length-1;
      while(j < k) {
        if(A[i] + A[j] + A[k] < target) {
          j++;
        }
        else if(A[i] + A[j] + A[k] > target) {
          k--;
        }
        else {
          // A[i] + A[j] + A[k] = target
          if(A[j] != A[k]) {
            // 1. Check if A[j] and A[k] have of multiples of itself
            int jMulti = 1, kMulti = 1;
            while(A[j] == A[j+1]) {
              jMulti++;
              j++;
            }
            
            while(k-1 > j && A[k] == A[k-1]) {
              kMulti++;
              k--;
            }
            
            result += jMulti * kMulti;
            result %= MOD;
            j++;
            k--;
          }
          else {
            // 2. The remaining entries A[j] thru A[k] are the same
            // M * (M-1) / 2 = # of pairs when all values are the same
            // [4, 4, 4] -> (3 * 2) / 2 = 3 pairs
            result += (k-j+1) * (k-j) / 2;
            result %= MOD;
            break;
          }
        }
      }
    }
    return (int) result;
  }  
}
