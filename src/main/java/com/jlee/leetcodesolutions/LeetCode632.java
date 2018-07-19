package com.jlee.leetcodesolutions;

import java.util.List;
import java.util.HashMap;
import java.util.TreeSet;

public class LeetCode632 {
  /*
   * You have k lists of sorted integers in ascending order. Find the smallest
   * range that includes at least one number from each of the k lists.
   * 
   * We define the range [a,b] is smaller than range [c,d] if b-a < d-c or a < c
   * if b-a == d-c.
   * 
   * https://leetcode.com/problems/smallest-range/description/
   */
  public int[] smallestRange(List<List<Integer>> nums) {
    // Move everything into a map/treeset for better searching
    // Store all elements into a set to ignore duplicates
    int k = nums.size();
    TreeSet<Integer> allElements = new TreeSet<>();    
    HashMap<Integer,TreeSet<Integer>> map = new HashMap<>();
    for(int i = 0; i < k; i++) {
      map.put(i, new TreeSet<>(nums.get(i)));      
      allElements.addAll(nums.get(i));
    }
    
    int[] result = new int[2];
    int dist = Integer.MAX_VALUE;
    for(int left : allElements) {
      // Try every element as the left range
      // right is the right range
      int right = Integer.MIN_VALUE;
      boolean haveValues = true;
      
      // Check each list
      for(int i = 0; i < k; i++) {
        Integer value = map.get(i).ceiling(left);

        // Will not include an element from ith list
        if(value == null) {
          haveValues = false;
          break;
        }
        // Where max is the right range
        right = Math.max(right, value);
      }
      
      if(haveValues && dist > right - left) {
        dist = right - left;
        result[0] = left;
        result[1] = right;
      }
    }
    return result;
  }
}
