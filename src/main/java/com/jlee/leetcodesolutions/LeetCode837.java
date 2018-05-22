package com.jlee.leetcodesolutions;

public class LeetCode837 {
  /*
   * Alice plays the following game, loosely based on the card game "21".
   * 
   * Alice starts with 0 points, and draws numbers while she has less than K
   * points. During each draw, she gains an integer number of points randomly from
   * the range [1, W], where W is an integer. Each draw is independent and the
   * outcomes have equal probabilities.
   * 
   * Alice stops drawing numbers when she gets K or more points. What is the
   * probability that she has N or less points?
   * 
   * Note:
   * 1. 0 <= K <= N <= 10000
   * 2. 1 <= W <= 10000
   * 3. Answers will be accepted as correct if they are within 10^-5 of the
   * correct answer.
   * 4. The judging time limit has been reduced for this question.
   * 
   * https://leetcode.com/problems/new-21-game/description/
   */
  public double new21Game(int N, int K, int W) {
    // The max Alice can choose is K+W-1, so if N >= K+W, she will always have less
    // points than N
    if(K == 0 || N >= K+W)
      return 1.0;
    
    // dp[i] = probability to get i points
    // sum = accumulative sum of probabilities
    double[] dp = new double[N+1];
    dp[0] = 1.0;
    double sum = 1.0, result = 0.0;
    for(int i = 1; i < K; i++) {
      dp[i] = sum / W;      
      sum += dp[i] - (i-W >= 0 ? dp[i-W] : 0);
    }
    
    // Alice now has K or more points. Determine result <= N
    // result = accumulative sum of probabilities from K to N
    for(int i = K; i <= N; i++) {
      dp[i] = sum / W;
      result += dp[i];
      sum -= (i-W >= 0 ? dp[i-W] : 0);
    }
    return result;
  }  
}
