package com.jlee.leetcodesolutions;

public class LeetCode1128 {
  /*
   * https://leetcode.com/problems/number-of-equivalent-domino-pairs/
   */
  public int numEquivDominoPairs(int[][] dominoes) {
    // Find how many dominos are equivalent
    // In preference, I just choose the lower digit first
    int[][] memo = new int[10][10];
    for(int[] dom : dominoes) {
      if(dom[0] <= dom[1])
        memo[dom[0]][dom[1]]++;
      else
        memo[dom[1]][dom[0]]++;
    }
    
    // C(n,r) = n! / (n-r)!r!
    //
    // 1x2x3x4x5              4x5
    // divide          ==>    divide
    // (1x2x3)(1x2)           1x2
    int pairs = 0;
    for(int i = 1; i < memo.length; i++) {
      for(int j = 1; j < memo[i].length; j++) {
        if(memo[i][j] > 1)
          pairs += (memo[i][j] * (memo[i][j]-1)) / 2;
      }
    }
    return pairs;
  }
}
