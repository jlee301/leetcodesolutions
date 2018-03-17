package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode343 {
  /*
   * Given a positive integer n, break it into the sum of at least two positive
   * integers and maximize the product of those integers. Return the maximum
   * product you can get.
   * 
   * For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 =
   * 3 + 3 + 4).
   * 
   * Note: You may assume that n is not less than 2 and not larger than 58.
   * 
   * https://leetcode.com/problems/integer-break/description/
   */
  public int integerBreak(int n) {
    /*
     * n = 2 --> 1    n = 7 --> 12
     * n = 3 --> 2    n = 8 --> 18
     * n = 4 --> 4    n = 9 --> 27
     * n = 5 --> 6    n = 10 --> 36
     * n = 6 --> 9    n = 11 --> 54
     * 
     * The pattern of memo.get(i) = 3 * memo.get(i-3) starts to occur when n = 7.  
     * So we prestore memo.get(2 thru 6).
     */
    List<Integer> memo = new ArrayList<>();
    memo.add(1);
    memo.add(1);
    memo.add(1);
    memo.add(2);
    memo.add(4);
    memo.add(6);
    memo.add(9);
    for(int i = 7; i <= n; i++)
      memo.add(3 * memo.get(i-3));
    return memo.get(n);
  }
}
