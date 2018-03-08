package com.jlee.leetcodesolutions;

public class LeetCode287 {
  /*
   * Given an array nums containing n + 1 integers where each integer is between 1
   * and n (inclusive), prove that at least one duplicate number must exist.
   * Assume that there is only one duplicate number, find the duplicate one.
   * 
   * Note:
   * 1. You must not modify the array (assume the array is read only).
   * 2. You must use only constant, O(1) extra space.
   * 3. Your runtime complexity should be less than O(n2).
   * 4. There is only one duplicate number in the array, but it could be repeated
   * more than once.
   * 
   * https://leetcode.com/problems/find-the-duplicate-number/description/
   */
  public int findDuplicate(int[] nums) {
    if(nums == null || nums.length < 2)
      return 0;
    int slow = nums[0], fast = nums[nums[0]];
    while(slow != fast) {
      slow = nums[slow];
      fast = nums[nums[fast]];
      // When this stops, slow will have traveled one full cycle when they meet.
    }
    // So now we must find the entry point of the cycle. We take the fast and
    // move it back to the beginning and have them both move one step. When they
    // meet, this will be the entry point of the cycle (which is our duplicate
    // number).
    fast = 0;
    while(slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }
    return slow;
  }
}
