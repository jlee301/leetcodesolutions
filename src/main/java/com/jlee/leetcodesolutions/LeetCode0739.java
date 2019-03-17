package com.jlee.leetcodesolutions;

import java.util.Stack;

public class LeetCode0739 {
  /*
   * Given a list of daily temperatures, produce a list that, for each day in the
   * input, tells you how many days you would have to wait until a warmer
   * temperature. If there is no future day for which this is possible, put 0
   * instead.
   * 
   * For example, given the list temperatures = [73, 74, 75, 71, 69, 72, 76, 73],
   * your output should be [1, 1, 4, 2, 1, 1, 0, 0].
   * 
   * Note: The length of temperatures will be in the range [1, 30000]. Each
   * temperature will be an integer in the range [30, 100].
   * 
   * https://leetcode.com/problems/daily-temperatures/description/
   */
  public int[] dailyTemperatures(int[] temperatures) {
    int[] result = new int[temperatures.length];

    // Store index positions in the stack
    Stack<Integer> stack = new Stack<>();
    for(int i = 0; i < temperatures.length; i++) {
      while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
        // If the current temp is higher than any of the temps in the stack, record the
        // distance
        int pos = stack.pop();
        result[pos] = i - pos;
      }
      // Push into stack the position if stack is empty or temp is lower than prev temp
      stack.push(i);
    }
    return result;
  }
}
