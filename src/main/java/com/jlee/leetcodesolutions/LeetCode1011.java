package com.jlee.leetcodesolutions;

public class LeetCode1011 {
  /*
   * https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/ 
   */
  public int shipWithinDays(int[] weights, int D) {
    // Find the largest element in weight
    int max = 0;
    for(int w : weights)
      max = Math.max(max, w);
    
    // The worst case scenario, the bucket size is weights.length * max
    int min = max;
    boolean found = false;
    while(!found) {
      // Attempt to fill each bucket based on the min
      int[] buckets = new int[D];
      int i = 0;
      for(int j = 0; j < buckets.length; j++) {
        while(i < weights.length && buckets[j] + weights[i] <= min)
          buckets[j] += weights[i++];
      }
      
      if(i == weights.length)
        found = true;
      
      min++;
    }
    return min-1;
  }
}
