package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode646 {
  /*
   * You are given n pairs of numbers. In every pair, the first number is always
   * smaller than the second number.
   * 
   * Now, we define a pair (c, d) can follow another pair (a, b) if and only if b
   * < c. Chain of pairs can be formed in this fashion.
   * 
   * Given a set of pairs, find the length longest chain which can be formed. You
   * needn't use up all the given pairs. You can select pairs in any order.
   * 
   * Example 1:
   * Input: [[1,2], [2,3], [3,4]]
   * Output: 2
   * Explanation: The longest chain is [1,2] -> [3,4]
   * 
   * Note:
   * The number of given pairs will be in the range [1, 1000].
   * 
   * https://leetcode.com/problems/maximum-length-of-pair-chain/description/
   */
  public int findLongestChain(int[][] pairs) {
    if(pairs == null || pairs.length == 0)
      return 0;
    
    // Sort by second value
    Arrays.sort(pairs, new EndComparator());
    int chain = 0;
    int prev = Integer.MIN_VALUE;
    for(int[] pair : pairs) {
      if(prev < pair[0]) {
        // As long as the current first value is greater than the previous second value,
        // we can increment the count
        chain++;
        prev = pair[1];
      }
    }
    return chain;
  }
  
  private class EndComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
      return a[1] - b[1];
    }
  }
}
