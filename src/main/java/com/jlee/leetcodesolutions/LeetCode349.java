package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode349 {
  /*
   * Given two arrays, write a function to compute their intersection.
   * 
   * Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
   * 
   * Note: Each element in the result must be unique. The result can be in any
   * order.
   * 
   * https://leetcode.com/problems/intersection-of-two-arrays/description/
   */
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> result = new HashSet<>();
    HashSet<Integer> nums = new HashSet<>();
    for(int n : nums1)
      nums.add(n);
    
    for(int n : nums2) {
      if(nums.contains(n))
        result.add(n);
    }
    
    int[] ans = new int[result.size()];
    int i = 0;
    for(int n : result)
      ans[i++] = n;
    
    return ans;
  }
}
