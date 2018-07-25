package com.jlee.leetcodesolutions;

public class LeetCode600 {
  /*
   * Given a positive integer n, find the number of non-negative integers less
   * than or equal to n, whose binary representations do NOT contain consecutive
   * ones.
   * 
   * Note: 1 <= n <= 10^9
   * 
   * https://leetcode.com/problems/non-negative-integers-without-consecutive-ones/description/
   */
  public int findIntegers(int num) {
    String data = Integer.toBinaryString(num);
    int N = data.length();
    
    // ones = number of integers with non-consecutive 1's with 1 MSB
    // ie 5 bits, 10000-10111
    // zeros = number of integers with non-consecutive 1's with 0 MSB
    // ie 5 bits, 00000-01111
    int[] ones = new int[N];
    int[] zeros = new int[N];
    
    ones[0] = zeros[0] = 1;
    for(int i = 1; i < N; i++) {
      ones[i] = ones[i-1] + zeros[i-1];
      zeros[i] = ones[i-1];
    }
    
    // This result is the count of all integers of non-consecutive 1's is assuming
    // max of ie 5 bits (00000-11111)
    // We need to do some deductions to reach num.
    int result = ones[N-1] + zeros[N-1];
    for(int i = 1; i < N; i++) {
      if(data.charAt(i) == '1' && data.charAt(i-1) == '1') break;
      if(data.charAt(i) == '0' && data.charAt(i-1) == '0')
        result -= zeros[N-i-1];
    }
    return result;
  }
}
