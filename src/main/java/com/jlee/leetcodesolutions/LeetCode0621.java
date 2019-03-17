package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0621 {
  /*
   * Given a char array representing tasks CPU need to do. It contains capital
   * letters A to Z where different letters represent different tasks.Tasks could
   * be done without original order. Each task could be done in one interval. For
   * each interval, CPU could finish one task or just be idle.
   * 
   * However, there is a non-negative cooling interval n that means between two
   * same tasks, there must be at least n intervals that CPU are doing different
   * tasks or just be idle.
   * 
   * You need to return the least number of intervals the CPU will take to finish
   * all the given tasks.
   * 
   * Example 1:
   * Input: tasks = ["A","A","A","B","B","B"], n = 2
   * Output: 8
   * Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.
   * 
   * Note:
   * 1. The number of tasks is in the range [1, 10000].
   * 2. The integer n is in the range [0, 100].
   * 
   * https://leetcode.com/problems/task-scheduler/description/
   */
  public int leastInterval(char[] tasks, int n) {
    if(tasks == null || tasks.length == 0)
      return 0;
    // If n = 0, then just return the tasks length.
    if(n == 0)
      return tasks.length;
    
    // Count the frequency of each task
    int[] counts = new int[26];
    for(char ch : tasks)
      counts[ch - 'A']++;
    // Sort so we have higher frequency tasks on bottom
    Arrays.sort(counts);
    
    int total = tasks.length, intervals = 0;
    while(total > 0) {
      int idle = 0;
      for(int i = counts.length-1; i >= 0; i--) {
        if(counts[i] != 0 && idle <= n) {
          counts[i]--;
          total--;
          idle++;
          intervals++;
        }
        // We break when there is no next task count[i] == 0 or idle > n
        else
          break;
      }
      while(total > 0 && idle <= n) {
        // If we did not execute at least n intervals of different tasks, then we must
        // compensate with idles
        idle++;
        intervals++;
      }
      // Resort so we have higher frequency tasks on bottom
      Arrays.sort(counts);
    }
    return intervals;
  }
}
