package com.jlee.leetcodesolutions;

public class LeetCode334 {
  /*
   * Given an unsorted array return whether an increasing subsequence of length 3
   * exists or not in the array.
   * 
   * Formally the function should:
   * Return true if there exists i, j, k
   * such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return
   * false.
   * 
   * Your algorithm should run in O(n) time complexity and O(1) space complexity.
   * 
   * Examples:
   * Given [1, 2, 3, 4, 5],
   * return true.
   * 
   * Given [5, 4, 3, 2, 1],
   * return false.
   * 
   * https://leetcode.com/problems/increasing-triplet-subsequence/description/
   */
  public boolean increasingTriplet(int[] nums) {
    if(nums == null || nums.length < 3)
      return false;
    return increasingTriplet(nums, Integer.MIN_VALUE, 0, 0);
  }
  
  private boolean increasingTriplet(int[] nums, int prev, int pos, int count) {
    if(count == 3)
      return true;
    
    for(int i = pos; i < nums.length; i++) {
      if(prev < nums[i]) {
        // System.out.println(prev + " < " + nums[i] + ", count=" + (count+1));
        if(increasingTriplet(nums, nums[i], i+1, count+1))
          return true;
      }
    }
    return false;
  }
  
  public boolean increasingTripletOnePass(int[] nums) {
    if(nums == null || nums.length < 3)
      return false;
    
    int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
    for(int num : nums) {
      if(num <= small) {
        // Update small if num is less than both
        small = num;
        // System.out.println("small: " + small + " big: " + big + " num: " + num);
      } else if(num <= big) {
        // Update big if num greater than small but less than big
        big = num;
        // System.out.println("small: " + small + " big: " + big + " num: " + num);
      } else {
        // Return true if num greater than both
        // System.out.println("small: " + small + " big: " + big + " num: " + num);
        return true;
      }
    }
    return false;
  }
}
