package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode375 {
  /*
   * We are playing the Guess Game. The game is as follows:
   * 
   * I pick a number from 1 to n. You have to guess which number I picked.
   * 
   * Every time you guess wrong, I'll tell you whether the number I picked is
   * higher or lower.
   * 
   * However, when you guess a particular number x, and you guess wrong, you pay
   * $x. You win the game when you guess the number I picked.
   * 
   * Given a particular n ≥ 1, find out how much money you need to have to
   * guarantee a win.
   * 
   * https://leetcode.com/problems/guess-number-higher-or-lower-ii/description/
   */
  public int getMoneyAmount(int n) {
    int[][] memo = new int[n+1][n+1];
    for(int[] row : memo)
      Arrays.fill(row, Integer.MAX_VALUE);
    return moneyHelper(1, n, memo);
  }
  
  /*
   * Given n, we make a guess k
   * f(1,n) = k + max( f(1,k-1), f(k+1,n) )
   * 
   * memo[i][j] = min cost of the worst case(max) for numbers i and j
   */
  private int moneyHelper(int start, int end, int[][] memo) {
    if(start >= end)
      return 0;
    if(memo[start][end] != Integer.MAX_VALUE)
      return memo[start][end];
    
    for(int k = start; k <= end; k++)
      memo[start][end] = Math.min(memo[start][end], k + Math.max(moneyHelper(start, k-1, memo), moneyHelper(k+1, end, memo)));
    return memo[start][end];
  }
}
