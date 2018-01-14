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
    
    int a = (int) Math.pow(10, n) - 1;
    int b = a / 10;
    long result = 0;
    
    for(int i = a; i > b; i--) {
      // System.out.println(i);
      for(int j = a; j > b; j--) {
        long product = (long)i * (long)j;
        if(product > result) {
          if(isPalindrome(product)) {
            // System.out.println(i + " " + j);
            result = product;
          }
        } else {
          break;
        }
      }
    }
    result = result % (long)1337;
    return (int) result;
  }
  
  /*
   * This was taken from problem 009.
   */
  private boolean isPalindrome(long x) {
    long copyOriginal = x;
    // Use long here to compensate for 32-bit overflow
    long result = 0;
    while (copyOriginal != 0) {
      long remainder = copyOriginal % 10;
      result = (result * 10) + remainder;
      copyOriginal = copyOriginal / 10;
    }
    if (result == x)
      return true;
    else
      return false;
  }
}
