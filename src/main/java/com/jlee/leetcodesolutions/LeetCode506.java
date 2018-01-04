package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode506 {
  /*
   * Given scores of N athletes, find their relative ranks and the people with the
   * top three highest scores, who will be awarded medals: "Gold Medal",
   * "Silver Medal" and "Bronze Medal".
   * 
   * Example 1:
   * Input: [5, 4, 3, 2, 1]
   * Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
   * 
   * Explanation: The first three athletes got the top three highest scores, so
   * they got "Gold Medal", "Silver Medal" and "Bronze Medal". For the left two
   * athletes, you just need to output their relative ranks according to their
   * scores.
   * 
   * Note:
   * 1. N is a positive integer and won't exceed 10,000.
   * 2. All the scores of athletes are guaranteed to be unique.
   * 
   * https://leetcode.com/problems/relative-ranks/description/
   */
  public String[] findRelativeRanks(int[] nums) {
    if(nums == null || nums.length == 0)
      return new String[] {};
    
    int[] tempNums = nums.clone();
    Arrays.sort(tempNums);
    HashMap<Integer,String> map = new HashMap<Integer,String>();
    
    for(int i = tempNums.length - 1, j = 1; i >= 0; i--, j++) {
      if(j == 1)
        map.put(tempNums[i], "Gold Medal");
      else if (j == 2)
        map.put(tempNums[i], "Silver Medal");
      else if (j == 3)
        map.put(tempNums[i], "Bronze Medal");
      else
        map.put(tempNums[i], Integer.toString(j));
    }
    
    String[] result = new String[nums.length];
    for(int i = 0; i < nums.length; i++)
      result[i] = map.get(nums[i]);
    
    return result;
  }
}
