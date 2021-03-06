package com.jlee.leetcodesolutions;

public class LeetCode0397 {
  /*
   * Given a positive integer n and you can do operations as follow:
   * 1. If n is even, replace n with n/2.
   * 2. If n is odd, you can replace n with either n + 1 or n - 1.
   * 
   * What is the minimum number of replacements needed for n to become 1?
   * 
   * Example 1:
   * Input: 8
   * Output: 3
   * 
   * Explanation:
   * 8 -> 4 -> 2 -> 1
   * 
   * Example 2:
   * Input: 7
   * Output: 4
   * 
   * Explanation:
   * 7 -> 8 -> 4 -> 2 -> 1  or  7 -> 6 -> 3 -> 2 -> 1
   * 
   * https://leetcode.com/problems/integer-replacement/description/
   */
  public int integerReplacement(int n) {
    if(n == 1)
      return 0;
    if(n == Integer.MAX_VALUE)
      return 32;
    if(n % 2 == 0)
      return 1 + integerReplacement(n/2);
    else
      return 1 + Math.min(integerReplacement(n+1), integerReplacement(n-1));
  }
}
