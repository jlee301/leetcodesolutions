package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode594 {
  /*
   * We define a harmonious array is an array where the difference between its
   * maximum value and its minimum value is exactly 1.
   * 
   * Now, given an integer array, you need to find the length of its longest
   * harmonious subsequence among all its possible subsequences.
   * 
   * Example 1:
   * Input: [1,3,2,2,5,2,3,7]
   * Output: 5
   * 
   * Explanation: The longest harmonious subsequence is [3,2,2,2,3].
   * 
   * Note: The length of the input array will not exceed 20,000.
   * 
   * https://leetcode.com/problems/longest-harmonious-subsequence/description/
   */
  public int findLHS(int[] nums) {
    if(nums == null || nums.length == 0)
      return 0;
    
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    for(int i = 0; i < nums.length; i++)
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

    int result = 0;
    for(int key : map.keySet()) {
      if(map.containsKey(key + 1))
        result = Math.max(result, map.get(key) + map.get(key + 1));
    }
    return result;
  }
}
