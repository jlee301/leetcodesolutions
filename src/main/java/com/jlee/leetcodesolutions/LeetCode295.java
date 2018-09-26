package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode295 {
  /*
   * Median is the middle value in an ordered integer list. If the size of the
   * list is even, there is no middle value. So the median is the mean of the two
   * middle value.
   * 
   * https://leetcode.com/problems/find-median-from-data-stream/description/
   */
  private List<Integer> list;
  
  /** initialize your data structure here. */
  public LeetCode295() {
    list = new ArrayList<>();
  }
  
  public void addNum(int num) {
    int left = 0;
    int right = list.size()-1;
    
    // Binary search to determine where to insert num in the list
    while(left <= right) {
      int mid = left + (right-left)/2;
      int value = list.get(mid);
      if(num < value) {
        right = mid - 1;
      }
      else if(num > value) {
        left = mid + 1;
      }
      else { // num == value
        left = mid;
        break;
      }
    }
    list.add(left, num);
  }
  
  public double findMedian() {
    int N = list.size();
    if(N == 0)
      return 0.0;
    
    else if(N % 2 != 0)
      return list.get(N / 2);
    
    else return (list.get(N/2) + list.get(N/2 - 1)) / 2.0; 
  }
}
