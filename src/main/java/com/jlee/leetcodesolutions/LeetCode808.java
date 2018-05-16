package com.jlee.leetcodesolutions;

public class LeetCode808 {
  /*
   * There are two types of soup: type A and type B. Initially we have N ml of
   * each type of soup. There are four kinds of operations:
   * 
   * 1. Serve 100 ml of soup A and 0 ml of soup B
   * 
   * 2. Serve 75 ml of soup A and 25 ml of soup B
   * 
   * 3. Serve 50 ml of soup A and 50 ml of soup B
   * 
   * 4. Serve 25 ml of soup A and 75 ml of soup B
   * 
   * When we serve some soup, we give it to someone and we no longer have it. Each
   * turn, we will choose from the four operations with equal probability 0.25. If
   * the remaining volume of soup is not enough to complete the operation, we will
   * serve as much as we can. We stop once we no longer have some quantity of both
   * types of soup.
   * 
   * Note that we do not have the operation where all 100 ml's of soup B are used
   * first.
   * 
   * Return the probability that soup A will be empty first, plus half the
   * probability that A and B become empty at the same time.
   * 
   * https://leetcode.com/problems/soup-servings/description/
   */
  public double soupServings(int N) {
    // Got this number from test cases that exceeded TLE and MLE
    if(N >= 21500)
      return 1.0;
    return soupServings(N, N, new Double[N+1][N+1]);
  }
  
  private double soupServings(int A, int B, Double[][] memo) {
    // Both A and B are empty at same time
    if(A <= 0 && B <= 0) return 0.5;
    // A empty first
    if(A <= 0) return 1.0;
    // B empty first
    if(B <= 0) return 0.0;
    
    if(memo[A][B] != null)
      return memo[A][B];
    
    // Four operations
    int[][] moves = { {100,0}, {75, 25}, {50, 50}, {25, 75} };
    memo[A][B] = 0.0;
    for(int[] move : moves)
      memo[A][B] += soupServings(A - move[0], B - move[1], memo);
    memo[A][B] *= 0.25;
    return memo[A][B];
  }
}
