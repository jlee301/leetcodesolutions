package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode757 {
  /*
   * An integer interval [a, b] (for integers a < b) is a set of all consecutive
   * integers from a to b, including a and b.
   * 
   * Find the minimum size of a set S such that for every integer interval A in
   * intervals, the intersection of S with A has size at least 2.
   * 
   * https://leetcode.com/problems/set-intersection-size-at-least-two/description/
   */
  public int intersectionSizeTwo(int[][] intervals) {
    // Sort by interval end ascending, and interval start decending
    // The reason for the sort is to be able to skip intervals
    // [1, 3], [1, 4], [2, 5], [3, 5] --> [1, 3], [1, 4], [3, 5], [2, 5]
    Arrays.sort(intervals, new IntervalComparator());
    
    // Start from first interval, get the last two elements
    int size = 2;
    int start = intervals[0][1] - 1;
    int end = intervals[0][1];
    
    // Check remaining intervals
    for(int i = 1; i < intervals.length; i++) {
      int[] curr = intervals[i];
      // 1. One element from the interval is in the set
      // 2. No elements from the interval is in the set
      if(start < curr[0] && end >= curr[0]) {
        start = end;
        end = curr[1];
        size++;
      }
      else if(end < curr[0]) {
        start = curr[1] - 1;
        end = curr[1];
        size += 2;
      }
    }
    return size;
  }
  
  private class IntervalComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
      return a[1] != b[1] ? a[1] - b[1] : b[0] - a[0];
    }
  }
}
