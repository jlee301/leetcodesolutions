package com.jlee.leetcodesolutions;

public class LeetCode0689 {
  /*
   * In a given array nums of positive integers, find three non-overlapping
   * subarrays with maximum sum.
   * 
   * Each subarray will be of size k, and we want to maximize the sum of all 3*k
   * entries.
   * 
   * Return the result as a list of indices representing the starting position of
   * each interval (0-indexed). If there are multiple answers, return the
   * lexicographically smallest one.
   * 
   * https://leetcode.com/problems/maximum-sum-of-3-non-overlapping-subarrays/description/
   */  
  public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
    // Map k-sum from each starting index position
    int sum = -1;
    int[] ksum = new int[nums.length-k+1];
    for(int i = 0; i <= nums.length-k; i++) {
      if(sum == -1) {
        sum = 0;
        for(int j = 0; j < k; j++)
          sum += nums[j];
      }
      else {
        sum -= nums[i-1];
        sum += nums[i+k-1];
      }
      // [1,2,1,2,6,7,5,1], 2
      // ksum[] = [3,3,3,8,13,12,6]
      ksum[i] = sum;
    }
    
    // left[] = [0,0,0,3,4,4,4]
    // if j is the mid of the three subarrays, left[j] = index of the high sum
    // subarray to the left
    int[] left = new int[ksum.length];
    int best = 0;
    for(int i = 0; i < ksum.length; i++) {
      if(ksum[i] > ksum[best])
        best = i;
      left[i] = best;
    }
    
    // right[] = [4,4,4,4,4,5,6]
    // if j is the mid of the three subarrays, right[j] = index of the high sum
    // subarray to the right
    int[] right = new int[ksum.length];
    best = ksum.length-1;
    for(int i = ksum.length-1; i >= 0; i--) {
      if(ksum[i] >= ksum[best])
        best = i;
      right[i] = best;
    }
    
    int max = -1;
    int[] ans = new int[] {-1,-1,-1};
    for(int m = k; m < ksum.length-k; m++) {
      int l = left[m-k];
      int r = right[m+k];
      sum = ksum[l] + ksum[m] + ksum[r];
      if(sum > max) {
        max = sum;
        ans[0] = l;
        ans[1] = m;
        ans[2] = r;
      }
    }
    return ans;
  }  
}
