package com.jlee.leetcodesolutions;

public class LeetCode495 {
  /*
   * In LOL world, there is a hero called Teemo and his attacking can make his
   * enemy Ashe be in poisoned condition. Now, given the Teemo's attacking
   * ascending time series towards Ashe and the poisoning time duration per
   * Teemo's attacking, you need to output the total time that Ashe is in poisoned
   * condition.
   * 
   * You may assume that Teemo attacks at the very beginning of a specific time
   * point, and makes Ashe be in poisoned condition immediately.
   * 
   * https://leetcode.com/problems/teemo-attacking/description/
   */
  public int findPoisonedDuration(int[] timeSeries, int duration) {
    if(timeSeries == null || timeSeries.length == 0)
      return 0;
    
    // poisoned keeps track of the timeSeries the poison will last
    // ie timeSeries = 2, duration = 4, then poisoned = 5
    Integer poisoned = null;
    int time = 0;
    for(int i = 0; i < timeSeries.length; i++) {
      if(poisoned == null || poisoned < timeSeries[i]) {
        time += duration;
        poisoned = timeSeries[i] + duration - 1;
      } else { 
        // poisoned >= timeSeries[i]
        int newPoisoned = timeSeries[i] + duration - 1;
        time += newPoisoned - poisoned;
        poisoned = newPoisoned;
      }
    }
    return time;
  }
}
