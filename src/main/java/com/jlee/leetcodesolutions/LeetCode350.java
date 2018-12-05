package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode350 {
  /*
   * Given two arrays, write a function to compute their intersection.
   * 
   * Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
   * 
   * Note:
   * Each element in the result should appear as many times as it shows in both
   * arrays. The result can be in any order.
   * 
   * Follow up:
   * What if the given array is already sorted? How would you optimize your
   * algorithm?
   * 
   * What if nums1's size is small compared to nums2's size? Which algorithm is
   * better?
   * 
   * What if elements of nums2 are stored on disk, and the memory is limited such
   * that you cannot load all elements into the memory at once?
   * 
   * https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
   */
  public int[] intersect(int[] nums1, int[] nums2) {
    // Find the frequency of each integer
    HashMap<Integer,Integer> count1 = new HashMap<>();
    HashMap<Integer,Integer> count2 = new HashMap<>();
    for(int n : nums1)
      count1.put(n, count1.getOrDefault(n, 0) + 1);

    for(int n : nums2)
      count2.put(n, count2.getOrDefault(n, 0) + 1);
    
    List<Integer> result = new ArrayList<>();
    for(int key : count2.keySet()) {
      // The min frequency of the integer is how many times it appears
      int min = Math.min(count1.getOrDefault(key, 0), count2.get(key));
      for(int i = 0; i < min; i++)
        result.add(key); 
    }
    
    int[] ans = new int[result.size()];
    for(int i = 0; i < ans.length; i++)
      ans[i] = result.get(i);
    
    return ans;
  }
}
