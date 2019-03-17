package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeetCode0539 {
  /*
   * Given a list of 24-hour clock time points in "Hour:Minutes" format, find the
   * minimum minutes difference between any two time points in the list.
   * 
   * Example 1:
   * Input: ["23:59","00:00"]
   * Output: 1
   * 
   * Note:
   * 1. The number of time points in the given list is at least 2 and won't exceed
   * 20000.
   * 2. The input time is legal and ranges from 00:00 to 23:59.
   * 
   * https://leetcode.com/problems/minimum-time-difference/description/
   */
  public int findMinDifference(List<String> timePoints) {
    if(timePoints == null || timePoints.size() < 2)
      return 0;
    
    // Store total minutes per time point
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < timePoints.size(); i++) {
      String[] tokens = timePoints.get(i).split(":");
      int h = Integer.valueOf(tokens[0]);
      int m = Integer.valueOf(tokens[1]);
      list.add(h * 60 + m);
    }
    
    // Sort minutes in ascending order
    list.sort(new MinutesComparator());
    
    // Now find min difference
    int result = Integer.MAX_VALUE;
    for(int i = 0; i < list.size()-1; i++)
      result = Math.min(result, list.get(i+1) - list.get(i));
    
    // There is one corner case, first and last entry difference
    result = Math.min(result, 1440 - list.get(list.size()-1) + list.get(0));
    return result;
  }
  
  private class MinutesComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer a, Integer b) {
      return a - b;
    }
  }
}
