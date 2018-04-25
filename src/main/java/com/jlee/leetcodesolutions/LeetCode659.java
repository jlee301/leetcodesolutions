package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode659 {
  /*
   * You are given an integer array sorted in ascending order (may contain
   * duplicates), you need to split them into several subsequences, where each
   * subsequences consist of at least 3 consecutive integers. Return whether you
   * can make such a split.
   * 
   * Example 1:
   * Input: [1,2,3,3,4,5]
   * Output: True
   * Explanation:
   * You can split them into two consecutive subsequences :
   * 1, 2, 3
   * 3, 4, 5
   * 
   * Example 2:
   * Input: [1,2,3,3,4,4,5,5]
   * Output: True
   * Explanation:
   * You can split them into two consecutive subsequences :
   * 1, 2, 3, 4, 5
   * 3, 4, 5
   * 
   * Example 3:
   * Input: [1,2,3,4,4,5]
   * Output: False
   * 
   * Note: The length of the input is in range of [1, 10000]
   * 
   * https://leetcode.com/problems/split-array-into-consecutive-subsequences/description/
   */
  public boolean isPossible(int[] nums) {
    // Store the frequency of each number Number, Frequency
    HashMap<Integer,Integer> count = new HashMap<>();
    for(int num : nums)
      count.put(num, count.getOrDefault(num, 0) + 1);
    
    // Can we append or create new consecutive subsequence
    HashMap<Integer,Integer> append = new HashMap<>();
    for(int num : nums) {
      if(count.get(num) == 0) continue;

      // Can the num be appended to an existing subsequence. If the value is > 0, then
      // that value is the no. of available subsequences you could possibly append
      if(append.getOrDefault(num, 0) > 0) {
        append.put(num, append.get(num)-1);
        // Set num+1 as next number you can append to this subsequence
        append.put(num+1, append.getOrDefault(num+1, 0) + 1);
      }
      // Can the num create a new subsequence with the next two consecutive numbers
      else if(count.getOrDefault(num+1, 0) > 0 && count.getOrDefault(num+2, 0) > 0) {
        count.put(num+1, count.get(num+1)-1);
        count.put(num+2, count.get(num+2)-1);
        // Set num+3 as next number you can append to this subsequence
        append.put(num+3, append.getOrDefault(num+3, 0) + 1);
      }
      else
        return false;
      count.put(num, count.get(num)-1);
    }
    return true;
  }
}
