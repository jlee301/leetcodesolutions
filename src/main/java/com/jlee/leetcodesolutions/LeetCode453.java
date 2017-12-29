package com.jlee.leetcodesolutions;

public class LeetCode453 {
  /*
   * Given a non-empty integer array of size n, find the minimum number of moves
   * required to make all array elements equal, where a move is incrementing n - 1
   * elements by 1.
   * 
   * Example:
   * Input: [1,2,3]
   * Output: 3
   * Explanation: Only three moves are needed (remember each move increments two
   * elements): [1,2,3] => [2,3,3] => [3,4,3] => [4,4,4]
   * 
   * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/description/
   */
  public int minMoves(int[] nums) {
    if(nums == null || nums.length <= 1)
      return 0;
    // n = length of array
    // sum = sum of array before any moves
    // minNum = smallest number in the array
    // x = number the array elements should equal to
    // m = number of moves
    //
    // 1. sum + m(n-1) = n * x 
    // 2. minNum + m = x
    // 3. sum + m(n-1) = n(minNum + m) --> (Simplified) sum - n(minNum) = m
    int n = nums.length;
    int sum = 0;
    int minNum = nums[0];
    for(int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if(nums[i] < minNum)
        minNum = nums[i];
    }
    return sum - (n * minNum);
  }
}
