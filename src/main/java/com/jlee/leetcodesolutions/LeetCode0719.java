package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0719 {
  /*
   * Given an integer array, return the k-th smallest distance among all the
   * pairs. The distance of a pair (A, B) is defined as the absolute difference
   * between A and B.
   * 
   * https://leetcode.com/problems/find-k-th-smallest-pair-distance/description/
   */
  public int smallestDistancePair(int[] nums, int k) {
    Arrays.sort(nums);
    int N = nums.length;
    int maxdiff = nums[N-1] - nums[0];
    int[] distcount = new int[maxdiff+1];
    
    // Calculate the distance of each pair
    // distcount[i] = the number of pairs that have the distance i
    for(int i = 0; i < N; i++) {
      for(int j = i+1; j < N; j++)
        distcount[nums[j] - nums[i]]++;
    }
    
    // Now sum the counts, until we cross the threshold of k
    int count = 0, i = 0;
    while(count < k)
      count += distcount[i++];
    
    return i-1;
  }
}
