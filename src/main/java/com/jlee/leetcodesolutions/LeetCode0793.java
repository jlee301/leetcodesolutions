package com.jlee.leetcodesolutions;

public class LeetCode0793 {
  /*
   * Let f(x) be the number of zeroes at the end of x!. (Recall that x! = 1 * 2 *
   * 3 * ... * x, and by convention, 0! = 1.)
   * 
   * For example, f(3) = 0 because 3! = 6 has no zeroes at the end, while f(11) =
   * 2 because 11! = 39916800 has 2 zeroes at the end. Given K, find how many
   * non-negative integers x have the property that f(x) = K.
   * 
   * Note:
   * K will be an integer in the range [0, 10^9].
   * 
   * https://leetcode.com/problems/preimage-size-of-factorial-zeroes-function/description/
   */
  public int preimageSizeFZF(int K) {
    // Binary search
    long left = 0;
    long right = Long.MAX_VALUE;
    while(left < right) {
      long mid = left + (right-left)/2;
      long count = countZeroes(mid);
      if(count < K)
        left = mid+1;
      else if(count > K)
        right = mid-1;
      else // Found exact count == K
        return 5;
    }
    return 0;
  }
  
  private long countZeroes(long num) {
    long count = 0;
    // Diving by the next power of 5 is how many zeroes the factorial contains
    // num = 1000
    // num/5 = 200, num/25 = 40, num/125 = 8, num/625 = 1
    // 200 + 40 + 8 + 1 = 249 ending zeroes for 1000!
    for(long i = 5; num/i > 0; i = i*5)
      count += num/i;
    
    return count;
  }
}
