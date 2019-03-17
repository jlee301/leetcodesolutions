package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0850 {
  /*
   * We are given a list of (axis-aligned) rectangles. Each rectangle[i] = [x1,
   * y1, x2, y2] , where (x1, y1) are the coordinates of the bottom-left corner,
   * and (x2, y2) are the coordinates of the top-right corner of the ith
   * rectangle.
   * 
   * Find the total area covered by all rectangles in the plane. Since the answer
   * may be too large, return it modulo 10^9 + 7.
   * 
   * https://leetcode.com/problems/rectangle-area-ii/description/
   */
  public int rectangleArea(int[][] rectangles) {
    // Generate a list of all non-overlapping rectangles
    List<int[]> list = new ArrayList<>();
    for(int[] rect : rectangles)
      helper(list, rect, 0);
    
    int MOD = 1000000007;
    long totalarea = 0;
    for(int[] rect : list) {
      long area = ((long)(rect[2]-rect[0]) * (long)(rect[3]-rect[1])) % MOD;
      totalarea = (totalarea + area) % MOD;
    }
    return (int) totalarea;
  }
  
  private void helper(List<int[]> list, int[] curr, int pos) {
    if(pos == list.size()) {
      list.add(curr);
      return;
    }
    
    int[] next = list.get(pos);
    
    // Current rectangle does not overlap, check next
    if(curr[0] >= next[2] || curr[1] >= next[3] || curr[2] <= next[0] || curr[3] <= next[1]) {
      helper(list, curr, pos+1);
      return;
    }
    
    if(curr[0] < next[0])
      helper(list, new int[] {curr[0], curr[1], next[0], curr[3]}, pos+1);
    
    if(curr[2] > next[2])
      helper(list, new int[] {next[2], curr[1], curr[2], curr[3]}, pos+1);
    
    if(curr[1] < next[1])
      helper(list, new int[] {Math.max(curr[0], next[0]), curr[1], Math.min(curr[2], next[2]), next[1]}, pos+1);
    
    if(curr[3] > next[3])
      helper(list, new int[] {Math.max(curr[0], next[0]), next[3], Math.min(curr[2], next[2]), curr[3]}, pos+1);
  }
}
