package com.jlee.leetcodesolutions;

import java.util.ArrayList;

public class LeetCode349 {
  /*
   * Given two arrays, write a function to compute their intersection.
   * 
   * Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
   * 
   * Note: Each element in the result must be unique. The result can be in any
   * order.
   * 
   * https://leetcode.com/problems/intersection-of-two-arrays/description/
   */
  public int[] intersection(int[] nums1, int[] nums2) {
    if(nums1 == null || nums2 == null)
      return new int[] {};
    
    ArrayList<Integer> listNums = new ArrayList<Integer>();
    ArrayList<Integer> listIntersect = new ArrayList<Integer>();
    
    // Store everything from nums1 into hash
    for(int i = 0; i < nums1.length; i++) {
      if(!listNums.contains(nums1[i]))
        listNums.add(nums1[i]);
    }
    // If the integer from num2 exists in hash, store into intersect hash
    for(int i = 0; i < nums2.length; i++) {
      if(listNums.contains(nums2[i]))
        if(!listIntersect.contains(nums2[i]))
          listIntersect.add(nums2[i]);
    }
    
    // Now populate the result from the intersect hash
    int[] result = new int[listIntersect.size()];
    for(int i = 0; i < listIntersect.size(); i++) {
      result[i] = listIntersect.get(i);
    }
    return result;
  }
}
