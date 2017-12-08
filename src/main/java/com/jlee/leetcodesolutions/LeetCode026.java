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
		if(nums == null || nums.length == 0) {
			// No input data
			return 0;
		}
		else {
			// [1,1,1,2] --> [1,2,1,2], length = 2
			int indexOfDupe = 0;
			for(int i = 1; i < nums.length; i++) {
				if(nums[indexOfDupe] != nums[i]) {
					// When it does not match, increment the index pointer
					// The index should be at location of first duplicate 
					indexOfDupe++;
					if(indexOfDupe != i) {
						// If indexOfDupe != i, then copy value
						nums[indexOfDupe] = nums[i];
					}
				}
			}
			// Add one because indexOfDupe is the index value
			return indexOfDupe + 1;
		}
	}
}