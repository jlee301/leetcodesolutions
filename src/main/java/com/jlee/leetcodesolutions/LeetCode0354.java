package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode0354 {
  /*
   * You have a number of envelopes with widths and heights given as a pair of
   * integers (w, h). One envelope can fit into another if and only if both the
   * width and height of one envelope is greater than the width and height of the
   * other envelope.
   * 
   * What is the maximum number of envelopes can you Russian doll? (put one inside
   * other)
   * 
   * Note:
   * Rotation is not allowed.
   * 
   * https://leetcode.com/problems/russian-doll-envelopes/description/
   */
  public int maxEnvelopes(int[][] envelopes) {
    if(envelopes == null || envelopes.length == 0)
      return 0;
    
    Arrays.sort(envelopes, new WHComparator());
    // {5,4},{6,7},{6,4},{2,3}
    // {2,3},{5,4},{6,7},{6,4}
    int[] dp = new int[envelopes.length];
    dp[0] = 1;
    int result = 1;
    
    for(int i = 1; i < envelopes.length; i++) {
      int maxLIS = 0;
      for(int j = 0; j < i; j++) {
        if(envelopes[j][1] < envelopes[i][1])
          maxLIS = Math.max(maxLIS, dp[j]);
      }
      dp[i] = maxLIS + 1;
      result = Math.max(result, dp[i]);
    }
    return result;
  }
  
  // Sort by Width ascending and height descending if the same width
  private class WHComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
      if(a[0] == b[0])
        return b[1] - a[1];
      return a[0] - b[0];
    }
  }
}
