package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode347 {
  /*
   * Given a non-empty array of integers, return the k most frequent elements.
   * 
   * For example, Given [1,1,1,2,2,3] and k = 2, return [1,2].
   * 
   * Note:
   * 1. You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
   * 2. Your algorithm's time complexity must be better than O(n log n), where n
   * is the array's size.
   * 
   * https://leetcode.com/problems/top-k-frequent-elements/description/
   */
  public List<Integer> topKFrequent(int[] nums, int k) {
    List<Integer> result = new ArrayList<>();
    if(nums == null || nums.length == 0)
      return result;
    
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int num : nums)
      map.put(num, map.getOrDefault(num, 0)+1);
    
    // Convert into List array where the index is the frequency
    List<Integer>[] bucket = new List[nums.length+1];
    for(int key : map.keySet()) {
      int freq = map.get(key);
      if(bucket[freq] == null)
        bucket[freq] = new ArrayList<>();
      bucket[freq].add(key);
    }
    
    // Work backwards as it will give you the most frequent first.
    for(int i = bucket.length-1; i >= 0; i--) {
      if(bucket[i] != null) {
        for(int j = 0; j < bucket[i].size() && k > 0; j++, k--)
          result.add(bucket[i].get(j));
      }
    }
    return result;
  }
}
