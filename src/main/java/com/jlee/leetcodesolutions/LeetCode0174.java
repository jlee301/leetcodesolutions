package com.jlee.leetcodesolutions;

public class LeetCode0174 {
  /*
   * https://leetcode.com/problems/dungeon-game/
   */
  public int calculateMinimumHP(int[][] dungeon) {
    return dfs(dungeon, 0, 0, new int[dungeon.length][dungeon[0].length]);
  }

  private int dfs(int[][] dungeon, int r, int c, int[][] memo) {
    if(memo[r][c] != 0)
      return memo[r][c];
          
    if(r == dungeon.length-1 && c == dungeon[0].length-1) {
      // Reached the Princess
      // Base case 1: if Princess == -5  < 0, it requires at least 6HP
      // Base case 2: if Princess == 15 >= 0, it requires at least 1HP
      memo[r][c] = dungeon[r][c] < 0 ? -dungeon[r][c] + 1 : 1;
      return memo[r][c];
    }
    
    // Proceed to go downward and rightward
    int min = Integer.MAX_VALUE;
    
    // Downward
    if(r+1 < dungeon.length) {
      min = Math.min(min, dfs(dungeon, r+1, c, memo));
    }
    // Rightward
    if(c+1 < dungeon[0].length) {
      min = Math.min(min, dfs(dungeon, r, c+1, memo));
    }
    
    memo[r][c] = dungeon[r][c] < min ? min - dungeon[r][c] : 1;
    return memo[r][c];
  }
}
