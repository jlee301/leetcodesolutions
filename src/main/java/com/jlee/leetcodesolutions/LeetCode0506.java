package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.PriorityQueue;

public class LeetCode0506 {
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
    // Prioritize the scores descending
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
    for(int n : nums)
      pq.add(n);
    
    // Now map each score to its rank
    HashMap<Integer,String> map = new HashMap<>();
    int count = 1;
    while(!pq.isEmpty()) {
      if(count == 1)
        map.put(pq.poll(), "Gold Medal");
      else if(count == 2)
        map.put(pq.poll(), "Silver Medal");
      else if(count == 3)
        map.put(pq.poll(), "Bronze Medal");
      else
        map.put(pq.poll(), "" + count);
      
      count++;
    }
    
    String[] result = new String[nums.length];
    for(int i = 0; i < result.length; i++)
      result[i] = map.get(nums[i]);
    
    return result;
  }
}
