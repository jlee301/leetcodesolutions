package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode0135 {
  /*
   * There are N children standing in a line. Each child is assigned a rating
   * value.
   * 
   * You are giving candies to these children subjected to the following
   * requirements:
   * 1. Each child must have at least one candy.
   * 2. Children with a higher rating get more candies than their neighbors.
   * 
   * What is the minimum candies you must give?
   * 
   * https://leetcode.com/problems/candy/
   */
  public int candy(int[] ratings) {
    // everyone starts with 1 candy
    int[] dist = new int[ratings.length];
    Arrays.fill(dist, 1);
    
    // scan left to right to ensure left has more than right neighbor when rating is
    // higher
    for(int i = 1; i < dist.length; i++) {
      if(ratings[i] > ratings[i-1])
        dist[i] = dist[i-1] + 1;
    }
    
    // scan right to left to ensure right has more than left neighbor when rating is
    // higher
    for(int i = dist.length-2; i >= 0; i--) {
      if(ratings[i] > ratings[i+1]) {
        // since we have some set values from the left to right scan above, we need to
        // take the max
        dist[i] = Math.max(dist[i], dist[i+1] + 1);
      }
    }    
    return Arrays.stream(dist).sum();
  }
}
