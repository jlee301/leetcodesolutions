package com.jlee.leetcodesolutions;

import java.util.HashMap;
import javafx.util.Pair;

public class LeetCode303 {
  /*
   * Given an integer array nums, find the sum of the elements between indices i
   * and j (i ≤ j), inclusive.
   * 
   * Example: Given nums = [-2, 0, 3, -5, 2, -1]
   * 
   * sumRange(0, 2) -> 1
   * sumRange(2, 5) -> -1
   * sumRange(0, 5) -> -3
   * 
   * Note:
   * You may assume that the array does not change. There are many calls to
   * sumRange function.
   * 
   * https://leetcode.com/problems/range-sum-query-immutable/description/
   */
}

class NumArray {
  private final int[] data;
  private final HashMap<Pair<Integer,Integer>,Integer> hash;

  public NumArray(int[] nums) {
    data = nums;

    // Caching Method
    hash = new HashMap<Pair<Integer,Integer>,Integer>();
    if(nums != null) {
      for(int i = 0; i < nums.length; i++) {
        int sum = 0;
        for(int j = i; j < nums.length; j++) {
          sum += nums[j];
          hash.put(new Pair(i,j), sum);
        }
      }
    }
  }

  public int sumRange(int i, int j) {
    int sum = 0;
    if(data == null || i < 0 || j > data.length - 1 || i > j)
      return sum;
    
    for (int start = i; start <= j; start++) {
      sum += data[start];
    }
    return sum;
  }

  // Caching Method
  public int sumRangeCached(int i, int j) {
    if(hash.isEmpty() || i < 0 || j > data.length - 1 || i > j)
      return 0;
    else
      return hash.get(new Pair(i,j));
  }
}
