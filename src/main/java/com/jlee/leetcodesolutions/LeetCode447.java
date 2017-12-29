package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.Map;

public class LeetCode447 {
  /*
   * Given n points in the plane that are all pairwise distinct, a "boomerang" is
   * a tuple of points (i, j, k) such that the distance between i and j equals the
   * distance between i and k (the order of the tuple matters).
   * 
   * Find the number of boomerangs. You may assume that n will be at most 500 and
   * coordinates of points are all in the range [-10000, 10000] (inclusive).
   * 
   * Example: 
   * Input: [[0,0],[1,0],[2,0]]
   * Output: 2
   * Explanation: The two boomerangs are [[1,0],[0,0],[2,0]] and
   * [[1,0],[2,0],[0,0]]
   * 
   * https://leetcode.com/problems/number-of-boomerangs/description/
   */
  public int numberOfBoomerangs(int[][] points) {
    int result = 0;
    // If I need to compare a tuple (i, j, k), n needs to be at least 3
    if(points == null || points.length < 3)
      return result;
    
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    for(int i = 0; i < points.length; i++) {
      for(int j = 0; j < points.length; j++) {
        if(i == j)
          continue;
        
        // Do not need the actual distance, but by squaring the difference you do not
        // need to spend any cycles determining which is greater in value before
        // subtracting.
        int distance = ((points[i][0] - points[j][0]) * (points[i][0] - points[j][0]))
            + ((points[i][1] - points[j][1]) * (points[i][1] - points[j][1]));
        
        map.put(distance, map.getOrDefault(distance, 0) + 1);
      }
      for(int value : map.values()) {
        result = result + (value * (value-1));
      }
      map.clear();
    }
    return result;
  }
}
