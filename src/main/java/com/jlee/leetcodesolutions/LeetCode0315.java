package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0315 {
  /*
   * You are given an integer array nums and you have to return a new counts
   * array. The counts array has the property where counts[i] is the number of
   * smaller elements to the right of nums[i].
   * 
   * https://leetcode.com/problems/count-of-smaller-numbers-after-self/description/
   */
  public List<Integer> countSmaller(int[] nums) {
    int N = nums.length;
    Integer[] result = new Integer[N];
    
    // Traversing from [nums.length-1 : 0]
    // 1. We find position of where to add nums[i] into a sorted array
    // 2. This position also represents the number of elements that is less than the
    // current nums[i]
    List<Integer> list = new ArrayList<>();
    for(int i = N-1; i >= 0; i--) {
      int index = findPos(list, nums[i]);
      result[i] = index;
      list.add(index, nums[i]);
    }
    return Arrays.asList(result);
  }
  
  // Find index position where to insert n into the list
  private int findPos(List<Integer> list, int n) {
    int left = 0;
    int right = list.size()-1; 
    // Binary search the position where to insert n into the sorted list
    // [1, 3, 6], element 2 would insert between 1, 3 -> so index 1 is returned
    while(left <= right) {
      int mid = left + (right-left)/2;
      if(list.get(mid) < n)
        left = mid + 1;
      else
        right = mid - 1;
    }
    return left;
  }
}
