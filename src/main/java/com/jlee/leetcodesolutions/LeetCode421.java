package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode421 {
  /*
   * Given a non-empty array of numbers, a0, a1, a2, … , an-1, where 0 ≤ ai < 2^31.
   * 
   * Find the maximum result of ai XOR aj, where 0 ≤ i, j < n.
   * 
   * Could you do this in O(n) runtime?
   * 
   * Example:
   * Input: [3, 10, 5, 25, 2, 8]
   * Output: 28
   * Explanation: The maximum result is 5 ^ 25 = 28.
   * 
   * https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/description/
   */
  public int findMaximumXOR(int[] nums) {
    int result = 0;
    if(nums == null)
      return result;
    
    for(int i = 0; i < nums.length; i++) {
      for(int j = i+1; j < nums.length; j++) {
        result = Math.max(result, nums[i] ^ nums[j]);
      }
    }
    return result;
  }
  
  public int findMaximumXORImproved(int[] nums) {
    int result = 0, mask = 0;
    if(nums == null)
      return result;
    
    for(int i = 31; i >= 0; i--) {
      mask = mask | (1 << i);
      HashSet<Integer> set = new HashSet<>();
      for(int num : nums)
        set.add(num & mask);
      
      int temp = result | (1 << i);
      for(int num : set) {
        if(set.contains(temp ^ num)) {
          result = temp;
          break;
        }
      }
    }
    return result;
  }
}
