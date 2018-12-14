package com.jlee.leetcodesolutions;

public class LeetCode479 {
  /*
   * Find the largest palindrome made from the product of two n-digit numbers.
   * 
   * Since the result could be very large, you should return the largest
   * palindrome mod 1337.
   * 
   * Example:
   * Input: 2
   * Output: 987
   * 
   * Explanation: 99 x 91 = 9009, 9009 % 1337 = 987
   * 
   * Note:
   * The range of n is [1,8].
   * 
   * https://leetcode.com/problems/largest-palindrome-product/description/
   */
  public int largestPalindrome(int n) {
    if(n <= 0)
      return 0;
    
    long max = (long) Math.pow(10, n) - 1; // 1000 - 1 = 999
    long min = max / 10; // 999 / 10 = 99
    
    // Try every palindrome possible
    for(long left = max; left > min; left--) {
      long right = Long.valueOf(new StringBuilder("" + left).reverse().toString());
      long palindrome = left * (max + 1) + right;
      
      // Find possible divisor
      for(long i = max; i * i >= palindrome; i--) {
        if(palindrome % i == 0)
          return (int) (palindrome % 1337);
      }
    }
    return 9;
  }
}
