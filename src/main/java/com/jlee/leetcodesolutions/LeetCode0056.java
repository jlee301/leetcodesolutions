package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Interval;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeetCode0056 {
  /*
   * Given a collection of intervals, merge all overlapping intervals.
   * 
   * For example, 
   * Given [1,3],[2,6],[8,10],[15,18], 
   * return [1,6],[8,10],[15,18].
   * 
   * https://leetcode.com/problems/merge-intervals/description/
   */
  
  /*
   * This comparator class will sort the collection in ascending order by
   * Interval.start
   */
  private class IntervalComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval a, Interval b) {
        return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
    }
  }
  
  public List<Interval> merge(List<Interval> intervals) {
    if(intervals == null || intervals.size() <= 1)
      return intervals;
    
    intervals.sort(new IntervalComparator());
    List<Interval> result = new ArrayList<>();
    boolean[] merged = new boolean[intervals.size()];
    for(int i = 0; i < intervals.size(); i++) {
      if(merged[i]) continue;
      Interval tempA = intervals.get(i);
      merged[i] = true;
      for(int j = i+1; j < intervals.size(); j++) {
        Interval tempB = intervals.get(j);
        // Since intervals is sorted by start value, then we only need to check 
        // b.start <= a.end, then we take the greater end value.
        if(tempB.start <= tempA.end) {
          merged[j] = true;
          if(tempA.end < tempB.end)
            tempA.end = tempB.end;
        }
      }
      result.add(tempA);
    }
    return result;
  }
}
