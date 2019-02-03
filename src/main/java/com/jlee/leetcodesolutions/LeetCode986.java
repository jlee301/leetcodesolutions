package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.Interval;
import java.util.ArrayList;
import java.util.List;

public class LeetCode986 {
  /*
   * https://leetcode.com/problems/interval-list-intersections/
   */
  public Interval[] intervalIntersection(Interval[] A, Interval[] B) {
    List<Interval> list = new ArrayList<>();
    
    int i = 0, j = 0;
    while(i < A.length && j < B.length) {
      if(A[i].start > B[j].end) {
        // Advance B pointer
        j++;
      }      
      else if(A[i].end < B[j].start) {
        // Advance A pointer
        i++;
      }
      else {
        // There is an intersection
        list.add(intersectionHelper(A[i], B[j]));
        if(A[i].end < B[j].end)
          i++;
        else
          j++;
      }
    }
    
    // Convert list into Interval array
    Interval[] result = new Interval[list.size()];
    result = list.toArray(result);
    return result;
  }
  
  private Interval intersectionHelper(Interval A, Interval B) {
    return new Interval(Math.max(A.start, B.start), Math.min(A.end, B.end));
  }
}
