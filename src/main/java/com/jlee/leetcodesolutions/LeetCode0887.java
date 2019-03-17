package com.jlee.leetcodesolutions;

public class LeetCode0887 {
  /*
   * You are given K eggs, and you have access to a building with N floors from 1
   * to N.
   * 
   * Each egg is identical in function, and if an egg breaks, you cannot drop it
   * again.
   * 
   * You know that there exists a floor F with 0 <= F <= N such that any egg
   * dropped at a floor higher than F will break, and any egg dropped at or below
   * floor F will not break.
   * 
   * Each move, you may take an egg (if you have an unbroken one) and drop it from
   * any floor X (with 1 <= X <= N).
   * 
   * Your goal is to know with certainty what the value of F is.
   * 
   * What is the minimum number of moves that you need to know with certainty what
   * F is, regardless of the initial value of F?
   * 
   * https://leetcode.com/problems/super-egg-drop/description/
   */
  public int superEggDrop(int K, int N) {
    return superEggDrop(K, N, new int[K+1][N+1]);
  }

  private int superEggDrop(int K, int N, int[][] memo) {
    // If N <= 1, no other floors to choose from other none or one
    // If K == 1, it means whatever floors remaining must all be checked
    if (N <= 1 || K == 1)
      return N;

    if(memo[K][N] > 0)
      return memo[K][N];
    
    // Instead of linearly searching 1:N, we will binary search
    int min = N;
    int low = 1, high = N;
    while(low < high) {
      int mid = low + ((high - low) / 2);
      // left == number of floors on the left of mid if the egg BREAKS at mid
      // right == number of floors on the right of mid if the egg DOES NOT BREAK at mid
      int left = superEggDrop(K-1, mid-1, memo);
      int right = superEggDrop(K, N-mid, memo);
      // We want the max of left / right but min overall result
      min = Math.min(min, Math.max(left, right) + 1);
      
      // When left increases, right decreases
      if(left < right)
        low = mid+1;
      else
        high = mid;
    }
    memo[K][N] = min;
    return min;
  }
}
