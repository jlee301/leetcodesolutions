package com.jlee.leetcodesolutions;

public class LeetCode0287 {
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
    }
    // The distance between "slow" to the "start of the cycle" is the same as the
    // distance from the "beginning" to the "start of the cycle". So we set "fast"
    // back to zero and move by one step until they meet. The meeting point is the
    // "start of the cycle" -- which is the duplicate number.
    fast = 0;
    while(slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }
    return slow;
  }
}
