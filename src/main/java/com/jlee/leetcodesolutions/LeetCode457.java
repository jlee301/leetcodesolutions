package com.jlee.leetcodesolutions;

public class LeetCode457 {
  /*
   * You are given an array of positive and negative integers. If a number n at an
   * index is positive, then move forward n steps. Conversely, if it's negative
   * (-n), move backward n steps. Assume the first element of the array is forward
   * next to the last element, and the last element is backward next to the first
   * element. Determine if there is a loop in this array. A loop starts and ends
   * at a particular index with more than 1 element along the loop. The loop must
   * be "forward" or "backward'.
   * 
   * https://leetcode.com/problems/circular-array-loop/
   */
  public boolean circularArrayLoop(int[] nums) {
    // Check each element as a potential starting point
    int N = nums.length;
    for(int i = 0; i < N; i++) {
      if(nums[i] == 0)
        continue;
      
      int slow = i, fast = nextIndex(slow, nums);
      // Keep looping until a cycle is found or a change in direction
      while(nums[i] * nums[slow] > 0 && nums[i] * nums[fast] > 0) {
        if(slow == fast) {
          // Check to make sure there is more than one element in the loop
          if(slow != nextIndex(slow, nums))
            return true;
          break;
        }
        slow = nextIndex(slow, nums);
        fast = nextIndex(nextIndex(fast, nums), nums);
      }
      
      // No loop found, mark every element along this path as zero to avoid retesting
      slow = i;
      while(nums[i] * nums[slow] > 0) {
        int next = nextIndex(slow, nums);
        nums[slow] = 0;
        slow = next;
      }
    }
    return false;
  }
  
  private int nextIndex(int i, int[] nums) {
    int N = nums.length;
    if(i + nums[i] >= 0)
      return (i + nums[i]) % N;
    else
      return N + (i + nums[i]) % N;
  }
}
