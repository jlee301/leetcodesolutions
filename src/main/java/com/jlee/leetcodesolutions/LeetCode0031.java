package com.jlee.leetcodesolutions;

public class LeetCode0031 {
  /*
   * Implement next permutation, which rearranges numbers into the
   * lexicographically next greater permutation of numbers.
   * 
   * If such arrangement is not possible, it must rearrange it as the lowest
   * possible order (ie, sorted in ascending order).
   * 
   * The replacement must be in-place, do not allocate extra memory.
   * 
   * Here are some examples. Inputs are in the left-hand column and its
   * corresponding outputs are in the right-hand column. 
   * 1,2,3 → 1,3,2 
   * 3,2,1 → 1,2,3 
   * 1,1,5 → 1,5,1
   * 
   * https://leetcode.com/problems/next-permutation/description/
   */
  public void nextPermutation(int[] nums) {
    if(nums == null || nums.length < 2)
      return;
    
    int i = nums.length-2;
    // If i == -1, it means the entire array is in descending order. We are looking
    // for the first pair where nums[i] < nums[i+1].
    while(i >= 0 && nums[i] >= nums[i+1]) i--;
    
    if(i >= 0) {
      // Now checking everything after position i that is just greater than nums[i]
      int j = nums.length-1;
      while(nums[j] <= nums[i]) j--;
      swap(nums, i, j);
    }
    reverse(nums, i+1);
  }
  
  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
  
  private void reverse(int[] nums, int i) {
    for(int start = i, end = nums.length-1; start < end; start++, end--)
      swap(nums, start, end);
  }
}
