package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class LeetCode0373 {
  /*
   * You are given two integer arrays nums1 and nums2 sorted in ascending order
   * and an integer k.
   * 
   * Define a pair (u,v) which consists of one element from the first array and
   * one element from the second array.
   * 
   * Find the k pairs (u1,v1),(u2,v2) ...(uk,vk) with the smallest sums.
   * 
   * https://leetcode.com/problems/find-k-pairs-with-smallest-sums/description/
   */
  public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    List<int[]> result = new ArrayList<>();
    if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0 || k < 1)
      return result;
    
    // Use TreeMap, store by sum, List<int[]>. TreeMap will sort by sum ascending.
    TreeMap<Integer, List<int[]>> map = new TreeMap<>();
    for(int i = 0; i < nums1.length; i++) {
      for(int j = 0; j < nums2.length; j++) {
        int sum = nums1[i] + nums2[j];
        if(!map.containsKey(sum))
          map.put(sum, new ArrayList<>());
        map.get(sum).add(new int[] {nums1[i], nums2[j]});
      }
    }
    // Loop through keySet until k limit is filled.
    keyLoop:
      for(int key : map.keySet()) {
        for(int[] value : map.get(key)) {
          result.add(value);
          k--;
          if(k == 0)
            break keyLoop;
        }
      }
    return result;
  }
}
