package com.jlee.leetcodesolutions;

import java.util.ArrayList;

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
    if(nums1 == null || nums2 == null)
      return new int[] {};
    
    ArrayList<Integer> hashNums1 = new ArrayList<Integer>();
    ArrayList<Integer> hashIntersect = new ArrayList<Integer>();
    
    // Insert all values from nums1 into hash
    for(int i = 0; i < nums1.length; i++)
      hashNums1.add(nums1[i]);
    
    // If nums2 is found in hashNums1
    // 1. Insert into hashIntersect
    // 2. Remove first instance from hashNums1
    for(int i = 0; i < nums2.length; i++) {
      if(hashNums1.contains(nums2[i])) {
        hashIntersect.add(nums2[i]);
        
        // Must typecast Object or it will try to remove via index
        hashNums1.remove((Object)nums2[i]);
      }
    }
    
    // Create result array from hashIntersect size and populate
    int[] result = new int[hashIntersect.size()];
    for(int i = 0; i < hashIntersect.size(); i++)
      result[i] = hashIntersect.get(i);
    
    return result;
  }
}
