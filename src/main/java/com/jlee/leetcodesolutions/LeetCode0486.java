package com.jlee.leetcodesolutions;

public class LeetCode0486 {
  /*
   * Given an array of scores that are non-negative integers. Player 1 picks one
   * of the numbers from either end of the array followed by the player 2 and then
   * player 1 and so on. Each time a player picks a number, that number will not
   * be available for the next player. This continues until all the scores have
   * been chosen. The player with the maximum score wins.
   * 
   * Given an array of scores, predict whether player 1 is the winner. You can
   * assume each player plays to maximize his score.
   * 
   * https://leetcode.com/problems/predict-the-winner/description/
   */
  public boolean PredictTheWinner(int[] nums) {
    if(nums == null || nums.length == 0)
      return false;
    return p1(nums, 0, nums.length-1, 0, 0);
  }
  
  private boolean p1(int[] nums, int start, int end, int p1Sum, int p2Sum) {
    if(start > end) {
      if(p1Sum >= p2Sum) return true;
      return false;
    }
    // We send for player 2 to pick next while updating player 1's sum
    return !p2(nums, start+1, end, p1Sum+nums[start], p2Sum) || !p2(nums, start, end-1, p1Sum+nums[end], p2Sum);
  }
  
  private boolean p2(int[] nums, int start, int end, int p1Sum, int p2Sum) {
    if(start > end) {
      if(p1Sum < p2Sum) return true;
      return false;
    }
    // We send for player 1 to pick next while updating player 2's sum
    return !p1(nums, start+1, end, p1Sum, p2Sum+nums[start]) || !p1(nums, start, end-1, p1Sum, p2Sum+nums[end]);
  }
}
