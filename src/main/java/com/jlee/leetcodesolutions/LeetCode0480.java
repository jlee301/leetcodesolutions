package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0480 {
  /*
   * Median is the middle value in an ordered integer list. If the size of the
   * list is even, there is no middle value. So the median is the mean of the two
   * middle value.
   * 
   * Examples:
   * [2,3,4] , the median is 3
   * [2,3], the median is (2 + 3) / 2 = 2.5
   * 
   * Given an array nums, there is a sliding window of size k which is moving from
   * the very left of the array to the very right. You can only see the k numbers
   * in the window. Each time the sliding window moves right by one position. Your
   * job is to output the median array for each window in the original array.
   * 
   * https://leetcode.com/problems/sliding-window-median/description/
   */
  public double[] medianSlidingWindow(int[] nums, int k) {
    boolean median = k % 2 != 0;
    int mid = k / 2;
    int wsize = k-1;
    List<Integer> window = new ArrayList<>();
    List<Double> list = new ArrayList<>();
    for(int i = 0; i < nums.length; i++) {
      // Maintain the window size
      window.add(nums[i]);
      if(window.size() > k)
        window.remove((Integer) nums[i-k]);
      
      // Calculate the median or mean
      if(i >= wsize) {
        window.sort((a,b) -> a.compareTo(b));
        if(median)
          list.add((double) window.get(mid));
        else
          list.add(((double) window.get(mid) + (double) window.get(mid-1)) / 2.0);
      }
    }
    double[] result = new double[list.size()];
    for(int i = 0; i < list.size(); i++)
      result[i] = list.get(i);
    return result;
  }
}
