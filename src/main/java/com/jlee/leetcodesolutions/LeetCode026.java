package com.jlee.leetcodesolutions;

public class LeetCode026 {

	/*
	 * Given a sorted array, remove the duplicates in-place such that 
	 * each element appear only once and return the new length.
	 * 
	 * Do not allocate extra space for another array, you must do this 
	 * by modifying the input array in-place with O(1) extra memory.
	 * 
	 * Given nums = [1,1,2], Your function should return length = 2, 
	 * with the first two elements of nums being 1 and 2 respectively.
	 * It doesn't matter what you leave beyond the new length.
	 * 
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
	 */
  public int removeDuplicates(int[] nums) {
    if(nums == null || nums.length == 0)
      return 0;
    
    // Two pointers
    // i == index of last placed element
    // j == index of next element
    int i = 0, j = 1;
    while(j < nums.length) {
      if(nums[i] < nums[j]) {
        i++;
        nums[i] = nums[j];
      }
      j++;
    }
    return i + 1;
  }
}
