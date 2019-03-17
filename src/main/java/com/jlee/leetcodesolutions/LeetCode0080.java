package com.jlee.leetcodesolutions;

public class LeetCode0080 {
  /*
   * Follow up for "Remove Duplicates": What if duplicates are allowed at most
   * twice?
   * 
   * For example, Given sorted array nums = [1,1,1,2,2,3],
   * 
   * Your function should return length = 5, with the first five elements of nums
   * being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new
   * length.
   * 
   * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
   */
  public int removeDuplicates(int[] nums) {
    int len = 0;
    if(nums == null || nums.length == 0)
      return len;
    
    for(int num : nums) {
      if(len < 2 || num > nums[len-2])
        nums[len++] = num;
    }
    return len;
  }
}
