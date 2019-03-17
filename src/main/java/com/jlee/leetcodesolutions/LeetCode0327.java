package com.jlee.leetcodesolutions;

import java.util.Map;
import java.util.TreeMap;

public class LeetCode0327 {
  /*
   * Given an integer array nums, return the number of range sums that lie in
   * [lower, upper] inclusive.
   * 
   * Range sum S(i, j) is defined as the sum of the elements in nums between
   * indices i and j (i ≤ j), inclusive.
   * 
   * https://leetcode.com/problems/count-of-range-sum/description/
   */
  public int countRangeSum(int[] nums, int lower, int upper) {
    TreeMap<Long,Integer> sumCount = new TreeMap<>();
    sumCount.put((long)0, 1);
    long sum = 0;
    int count = 0;
    
    for(int i = 0; i < nums.length; i++) {
      sum += nums[i];
      Map<Long,Integer> subMap = sumCount.subMap(sum-upper, true, sum-lower, true);
      for(int cnt : subMap.values())
        count += cnt;
      
      sumCount.put(sum, sumCount.getOrDefault(sum, 0) + 1);
    }
    return count;
  }
}
