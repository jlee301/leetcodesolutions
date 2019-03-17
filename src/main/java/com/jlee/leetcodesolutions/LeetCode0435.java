package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Interval;
import java.util.Arrays;
import java.util.Comparator;

public class LeetCode0435 {
  /*
   * Given a collection of intervals, find the minimum number of intervals you
   * need to remove to make the rest of the intervals non-overlapping.
   * 
   * Note:
   * 1. You may assume the interval's end point is always bigger than its start
   * point.
   * 2. Intervals like [1,2] and [2,3] have borders "touching" but they don't
   * overlap each other.
   * 
   * https://leetcode.com/problems/non-overlapping-intervals/description/
   */
  public int eraseOverlapIntervals(Interval[] intervals) {
    if(intervals == null || intervals.length == 0)
      return 0;
    
    Arrays.sort(intervals, new EndComparator());
    int count = 1, end = intervals[0].end;
    // Determining the max intervals that need to be included (count)
    for(int i = 1; i < intervals.length; i++) {
      if(intervals[i].start >= end) {
        end = intervals[i].end;
        count++;
      }
    }
    return intervals.length - count;
  }
  
  private class EndComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval a, Interval b) {
      return a.end - b.end;
    }
  }
}
