package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Interval;
import java.util.Arrays;
import java.util.TreeMap;

public class LeetCode0436 {
  /*
   * Given a set of intervals, for each of the interval i, check if there exists
   * an interval j whose start point is bigger than or equal to the end point of
   * the interval i, which can be called that j is on the "right" of i.
   * 
   * For any interval i, you need to store the minimum interval j's index, which
   * means that the interval j has the minimum start point to build the "right"
   * relationship for interval i. If the interval j doesn't exist, store -1 for
   * the interval i. Finally, you need output the stored value of each interval as
   * an array.
   * 
   * Note:
   * 1. You may assume the interval's end point is always bigger than its start
   * point.
   * 2. You may assume none of these intervals have the same start point.
   * 
   * https://leetcode.com/problems/find-right-interval/description/
   */
  public int[] findRightInterval(Interval[] intervals) {
    if(intervals == null || intervals.length == 0)
      return new int[] {};
    
    int[] result = new int[intervals.length];
    Arrays.fill(result, -1);

    for(int i = 0; i < intervals.length; i++) {
      int minRight = Integer.MAX_VALUE;
      for(int j = 0; j < intervals.length; j++) {
        // If i j are same, move on
        if(i == j) continue;
        if(intervals[i].end <= intervals[j].start) {
          if(intervals[j].start < minRight) {
            minRight = intervals[j].start;
            result[i] = j;
          }
        }
      }
    }
    return result;
  }
  
  public int[] findRightIntervalTL(Interval[] intervals) {
    if(intervals == null || intervals.length == 0)
      return new int[] {};
    
    int[] result = new int[intervals.length];
    // Store start value and its index position
    TreeMap<Integer,Integer> map = new TreeMap<>();
    for(int i = 0; i < intervals.length; i++)
      map.put(intervals[i].start, i);
    
    for(int i = 0; i < result.length; i++) {
      // Returns the least key greater than or equal to the given key
      Integer key = map.ceilingKey(intervals[i].end);
      if(key == null)
        result[i] = -1;
      else
        result[i] = map.get(key);
    }
    return result;
  }
}
