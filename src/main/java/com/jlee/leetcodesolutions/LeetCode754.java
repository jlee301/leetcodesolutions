package com.jlee.leetcodesolutions;

public class LeetCode754 {
  /*
   * You are standing at position 0 on an infinite number line. There is a goal at
   * position target.
   * 
   * On each move, you can either go left or right. During the n-th move (starting
   * from 1), you take n steps.
   * 
   * Return the minimum number of steps required to reach the destination.
   * 
   * Note: target will be a non-zero integer in the range [-10^9, 10^9].
   * 
   * https://leetcode.com/problems/reach-a-number/description/
   */
  public int reachNumber(int target) {
    target = Math.abs(target);
    int steps = 0, sum = 0;
    while(sum < target) {
      steps++;
      sum += steps;
    }
    
    // Keep going until delta is even.
    while((sum-target) % 2 != 0) {
      steps++;
      sum += steps;
    }
    return steps;
  }
}
