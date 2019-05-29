package com.jlee.leetcodesolutions;

public class LeetCode1052 {
  /*
   * https://leetcode.com/problems/grumpy-bookstore-owner/
   */
  public int maxSatisfied(int[] customers, int[] grumpy, int X) {
    // customers = [1,0,1,2,1,1,7,5], X = 3
    // Time: O(n)
    // Space: O(1)
    int satisfied = 0;
    int maxSatisfiedWhenGrumpy = 0;
    int currSatisfiedWhenGrumpy = 0;
    for(int i = 0; i < customers.length; i++) {
      satisfied += grumpy[i] == 0 ? customers[i] : 0;

      // Sliding window tracking the max satisfied when grumpy
      currSatisfiedWhenGrumpy += grumpy[i] * customers[i] - ((i >= X) ? grumpy[i - X] * customers[i - X] : 0);
      maxSatisfiedWhenGrumpy = Math.max(maxSatisfiedWhenGrumpy, currSatisfiedWhenGrumpy);
    }
    return satisfied + maxSatisfiedWhenGrumpy;
  }
}
