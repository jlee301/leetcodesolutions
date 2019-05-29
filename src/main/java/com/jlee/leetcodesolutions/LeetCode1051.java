package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode1051 {
  /*
   * https://leetcode.com/problems/height-checker/
   */
  public int heightChecker(int[] heights) {
    // [1,1,4,2,1,3]
    // [1,1,1,2,3,4] <-- sorted
    //      ^   ^ ^  <-- these elements need to move in order to be non-decreasing order
    
    // Time: O(nlogn)
    // Space: O(n)
    int[] sorted = new int[heights.length];
    sorted = heights.clone();
    Arrays.sort(sorted);
    int count = 0;
    for(int i = 0; i < heights.length; i++) {
      if(heights[i] != sorted[i])
        count++;
    }
    return count;
  }
}
