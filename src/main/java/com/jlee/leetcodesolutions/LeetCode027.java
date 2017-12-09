package com.jlee.leetcodesolutions;

public class LeetCode027 {
  /*
   * Given an array and a value, remove all instances of that value in-place and
   * return the new length. Do not allocate extra space for another array, you
   * must do this by modifying the input array in-place with O(1) extra memory.
   * 
   * The order of elements can be changed. It doesn't matter what you leave beyond
   * the new length.
   * 
   * Given nums = [3,2,2,3], val = 3, Your function should return length = 2, with
   * the first two elements of nums being 2.
   * 
   * https://leetcode.com/problems/remove-element/description/
   */
  public int removeElement(int[] nums, int val) {
    if (nums == null || nums.length == 0) {
      return 0;
    } else {
      int indexOfRemove = 0;
      // [3, 2, 2, 3], val = 3 --> [2, 2, 2, 3], length = 2
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
          if (indexOfRemove != i) {
            // If indexOfRemove != i, then copy value
            nums[indexOfRemove] = nums[i];
          }
          indexOfRemove++;
        }
      }
      // This index value happens to be next indices to be removed
      return indexOfRemove;
    }
  }
}
