package com.jlee.leetcodesolutions;

public class LeetCode041 {
  /*
   * Given an unsorted integer array, find the smallest missing positive integer.
   * 
   * https://leetcode.com/problems/first-missing-positive/
   */
  public int firstMissingPositive(int[] nums) {
    // Sort Array
    // Arrays.sort(nums);
    
    // Bubble sort
    // sorted = nums[sorted+1 : len] are sorted ascending
    // swapExist = is to help us exit early if already sorted before index 0
    int sorted = nums.length-1;
    boolean swapExist = true;
    while(sorted > 0 || swapExist) {
      swapExist = false;
      for(int i = 0; i < sorted; i++) {
        if(nums[i] > nums[i+1]) {
          swapExist = true;
          swap(nums, i, i+1);
        }
      }
      sorted--;
    }
    
    // Find first missing positive integer
    int result = 1;
    for(int num : nums) {
      if(num == result)
        result++;
      else if(num > result)
        break;
    }
    return result;
  }
  
  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
