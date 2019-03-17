package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Interval;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class LeetCode0352 {
  /*
   * Given a data stream input of non-negative integers a1, a2, ..., an, ...,
   * summarize the numbers seen so far as a list of disjoint intervals.
   * 
   * https://leetcode.com/problems/data-stream-as-disjoint-intervals/description/
   */
  private TreeSet<Interval> set;
  
  /** Initialize your data structure here. */
  public LeetCode0352() {
    set = new TreeSet<>((a,b) -> a.start - b.start);
  }
  
  public void addNum(int val) {
    Interval temp = new Interval(val, val);
    Interval left = set.floor(temp);
    Interval right = set.higher(temp);
    
    // The val already exist in an interval, do nothing
    if(left != null && left.end >= val)
      return;
    
    if(left != null && right != null) { 
      if(val - left.end == 1) {
        // When the diff of left.end and val is 1, merge val with left interval
        left.end = val;
        if(right.start - val == 1) {
          // If the diff of left.end and right.start to val is 1, merge right with left interval 
          left.end = right.end;
          set.remove(right);
        }          
      }
      else {
        // When the diff of right.start and val is 1, merge val with right interval
        if(right.start - val == 1)
          right.start = val;
        else
          // Both left.end and right.start diff to val > 1, so add [val,val]
          set.add(temp);
      }
    }
    
    else if(left != null) {
      // When the diff of left.end and val is 1, merge val with left interval
      if(val - left.end == 1)
        left.end = val;
      else
        set.add(temp);
    }
    
    else if(right != null) {
      // When the diff of right.start and val is 1, merge val with right interval
      if(right.start - val == 1)
        right.start = val;
      else
        set.add(temp);
    }
    
    else { 
      // left == null && right == null
      // There are no intervals, insert [val,val]
      set.add(temp);
    }
  }
  
  public List<Interval> getIntervals() {
    return new ArrayList<>(set);
  }
}
