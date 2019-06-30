package com.jlee.leetcodesolutions;

public class LeetCode1105 {
  /*
   * https://leetcode.com/problems/filling-bookcase-shelves/
   */
  public int minHeightShelves(int[][] books, int shelf_width) {
    return dfs(books, shelf_width, 0, new Integer[books.length]);
  }
  
  private int dfs(int[][] books, int shelf_width, int pos, Integer[] memo) {
    if(pos == books.length)
      return 0;
    
    if(memo[pos] != null)
      return memo[pos];
    
    int currWidth = 0;
    int currHeight = 0;
    int minHeight = Integer.MAX_VALUE;
    for(int i = pos; i < books.length; i++) {
      if(currWidth + books[i][0] <= shelf_width) {
        currWidth += books[i][0];
        currHeight = Math.max(currHeight, books[i][1]);
        // Assume we start a new shelf with the next book
        minHeight = Math.min(minHeight, currHeight + dfs(books, shelf_width, i+1, memo));
      }
      else {
        // Since books must be placed in order, if you exceed shelf_width, there is no
        // more checking
        break;
      }
    }
    memo[pos] = minHeight;
    return minHeight;
  }
}
