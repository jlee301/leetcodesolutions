package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode0594 {
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
    // Find frequency of each integer
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int n : nums)
      map.put(n, map.getOrDefault(n, 0) + 1);
    
    // Now for each integer, add its frequency and its +1 variant
    int max = 0;
    for(int key : map.keySet()) {
      int len = map.get(key);
      if(map.containsKey(key+1))
        max = Math.max(max, len + map.get(key+1));
    }
    return max;
  }
}
