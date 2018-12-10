package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode956 {
  /*
   * You are installing a billboard and want it to have the largest height. The
   * billboard will have two steel supports, one on each side. Each steel support
   * must be an equal height.
   * 
   * You have a collection of rods which can be welded together. For example, if
   * you have rods of lengths 1, 2, and 3, you can weld them together to make a
   * support of length 6.
   * 
   * Return the largest possible height of your billboard installation. If you
   * cannot support the billboard, return 0.
   * 
   * https://leetcode.com/problems/tallest-billboard/
   */
  private int max;
  
  public int tallestBillboard(int[] rods) {
    max = 0;
    int sum = 0;
    Arrays.sort(rods);
    for(int n : rods)
      sum += n;
    tallestBillboard(rods, 0, 0, sum, rods.length-1);
    return max;
  }
  
  private void tallestBillboard(int[] rods, int height1, int height2, int sum_left, int pos) {
    if(height1 == height2)
      max = Math.max(max, height1);
    
    if(pos < 0)
      return;
    
    // Not enough rods to balance the height
    if(sum_left < Math.abs(height1-height2))
      return;
    
    // Not enough rods to build something higher than the current max
    if(sum_left + height1 + height2 <= 2*max)
      return;
    
    // Excluding rods[pos]
    tallestBillboard(rods, height1, height2, sum_left-rods[pos], pos-1);
    // Using rods[pos] for height1
    tallestBillboard(rods, height1+rods[pos], height2, sum_left-rods[pos], pos-1);
    // Using rods[pos] for height2
    tallestBillboard(rods, height1, height2+rods[pos], sum_left-rods[pos], pos-1);
  }
}
