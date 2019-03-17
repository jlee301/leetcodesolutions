package com.jlee.leetcodesolutions;

public class LeetCode0453 {
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
    int N = nums.length;
    int sum = 0;
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < N; i++) {
      sum += nums[i];
      min = Math.min(min, nums[i]);
    }
    return sum - min * N;    
  }
}
