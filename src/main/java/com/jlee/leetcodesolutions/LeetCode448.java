package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class LeetCode448 {
  /*
   * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
   * elements appear twice and others appear once.
   * 
   * Find all the elements of [1, n] inclusive that do not appear in this array.
   * 
   * Could you do it without extra space and in O(n) runtime? You may assume the
   * returned list does not count as extra space.
   * 
   * Example:
   * Input: [4,3,2,7,8,2,3,1]
   * Output: [5,6]
   * 
   * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
   */
  public List<Integer> findDisappearedNumbers(int[] nums){
    List<Integer> result = new ArrayList<Integer>();
    if(nums == null || nums.length == 0)
      return result;
    
    Arrays.sort(nums);
    int value = 1;
    for(int i = 0; i < nums.length; i++) {
      while(value < nums[i])
        result.add(value++);
      
      if(value <= nums[i])
        value++;
      
      // If you reached the end of the array, fill in the rest from value
      if(i == nums.length - 1)
        if(nums[i] != nums.length)
          for(int j = value; j <= nums.length; j++)
            result.add(j);
    }    
    return result;
  }
}
