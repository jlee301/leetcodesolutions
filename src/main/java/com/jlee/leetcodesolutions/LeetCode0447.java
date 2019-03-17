package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode0447 {
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
    int count = 0;
    for(int i = 0; i < points.length; i++) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int j = 0; j < points.length; j++) {
        if(i == j)
          continue;
        
        // Calculate how many points have same distance from points[i]
        int x = points[i][0] - points[j][0];
        int y = points[i][1] - points[j][1];
        // a^2 + b^2 = c^2
        // However we are not task to find the actual distance, so taking the squareroot
        // is not required
        int dist = x*x + y*y;
        map.put(dist, map.getOrDefault(dist, 0) + 1);
      }
      
      // Calculate number of permutations
      for(int n : map.values())
        count += n * (n - 1);
    }
    return count;
  }
}
