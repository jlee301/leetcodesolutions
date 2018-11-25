package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode948 {
  /*
   * You have an initial power P, an initial score of 0 points, and a bag of
   * tokens.
   * 
   * Each token can be used at most once, has a value token[i], and has
   * potentially two ways to use it.
   * 1. If we have at least token[i] power, we may play the token face up, losing
   * token[i] power, and gaining 1 point.
   * 2. If we have at least 1 point, we may play the token face down, gaining
   * token[i] power, and losing 1 point.
   * 
   * Return the largest number of points we can have after playing any number of
   * tokens.
   * 
   * https://leetcode.com/problems/bag-of-tokens/
   */
  public int bagOfTokensScore(int[] tokens, int P) {
    Arrays.sort(tokens);
    int max = 0, points = 0;
    
    int left = 0, right = tokens.length-1;
    while(left <= right) {
      // gain points from lowest powered tokens
      if(P >= tokens[left]) {
        P -= tokens[left++];
        points++;
        max = Math.max(max, points);
      }      
      // when you cannot gain anymore points, spend point to absorb highest powered
      // tokens until you can buy the next lowest powered token
      else if(points > 0) {
        P += tokens[right--];
        points--;
      }
      else
        break;
    }
    return max;
  }
}
