package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode0973 {
  /*
   * https://leetcode.com/contest/weekly-contest-119/problems/k-closest-points-to-origin/
   */
  public int[][] kClosest(int[][] points, int K) {
    Arrays.sort(points, new DistanceComparator());
    int[][] result = new int[K][];
    for(int i = 0; i < K; i++)
      result[i] = points[i];
    
    return result;
  }
  
  private class DistanceComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] A, int[] B) {
      return (A[0] * A[0] + A[1] * A[1]) - (B[0] * B[0] + B[1] * B[1]);
    }
  }
}
