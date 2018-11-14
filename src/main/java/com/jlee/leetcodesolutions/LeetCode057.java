package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Interval;
import java.util.ArrayList;
import java.util.List;

public class LeetCode057 {
  /*
   * Given a set of non-overlapping intervals, insert a new interval into the
   * intervals (merge if necessary).
   * 
   * You may assume that the intervals were initially sorted according to their
   * start times.
   * 
   * https://leetcode.com/problems/insert-interval/
   */
  public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    List<Interval> result = new ArrayList<>();
    
    int i = 0;
    boolean alreadyInserted = false;
    while(i < intervals.size()) {
      Interval curr = intervals.get(i);
      if(alreadyInserted) {
        result.add(curr);
        i++;
      }
      
      else if(curr.end < newInterval.start) {
        result.add(curr);
        i++;
      }
      
      else if(newInterval.end < curr.start) {
        result.add(newInterval);
        result.add(curr);
        alreadyInserted = true;
        i++;
      }
      
      // [2,4] [7,8]     [1,5]  --> [1,5] [7,8]
      else {
        Interval next = new Interval(Math.min(curr.start, newInterval.start), Math.max(curr.end, newInterval.end));
        // Check to see if there are more intervals to merge
        int j = i+1;
        while(j < intervals.size()) {
          curr = intervals.get(j);
          if(next.end < curr.start)
            break;
          
          // next.end >= curr.start
          else {
            next.end = Math.max(next.end, curr.end);
            j++;
          }
        }
        i = j;
        result.add(next);
        alreadyInserted = true;
      }      
    }
    if(!alreadyInserted)
      result.add(newInterval);

    return result;
  }
}
