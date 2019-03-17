package com.jlee.leetcodesolutions;

public class LeetCode0803 {
  /*
   * We have a grid of 1s and 0s; the 1s in a cell represent bricks. A brick will
   * not drop if and only if it is directly connected to the top of the grid, or
   * at least one of its (4-way) adjacent bricks will not drop.
   * 
   * We will do some erasures sequentially. Each time we want to do the erasure at
   * the location (i, j), the brick (if it exists) on that location will
   * disappear, and then some other bricks may drop because of that erasure.
   * 
   * Return an array representing the number of bricks that will drop after each
   * erasure in sequence.
   * 
   * https://leetcode.com/problems/bricks-falling-when-hit/description/
   */
  public int[] hitBricks(int[][] grid, int[][] hits) {
    // Mark all hits on the grid
    for(int hit[] : hits)
      grid[hit[0]][hit[1]] = grid[hit[0]][hit[1]] - 1;
    
    // Checking top row, see which bricks are connected
    // When this is done, all bricks marked as 2 are connected to the top. If they
    // are marked 1, they are bound to drop.
    for(int c = 0; c < grid[0].length; c++)
      search(grid, 0, c);
    
    // Working backwards, enable last hit and count number of bricks connected to it
    int[] result = new int[hits.length];
    for(int i = hits.length-1; i >= 0; i--) {
      // If grid[r][c] < 0, it means it was not a brick in the first place
      if(grid[hits[i][0]][hits[i][1]] == 0) {
        grid[hits[i][0]][hits[i][1]] = 1;

        // Is this hit in any way connected to the top?
        if(topConnect(grid, hits[i][0], hits[i][1]))
          result[i] = search(grid, hits[i][0], hits[i][1]) - 1;
      }
    }
    return result;
  }
  
  // Return the number of connected bricks from (r,c)
  private int search(int[][] grid, int r, int c) {
    int count = 0;
    if(r < 0 || r == grid.length || c < 0 || c == grid[0].length)
      return count;
    
    if(grid[r][c] == 1) {
      // Initially mark as 2 to indicate this brick is connected to the top and has
      // been visited
      grid[r][c] = 2;
      count++;
      
      // Check adjacent neighbors
      int[][] moves = { {-1,0}, {1,0}, {0,-1}, {0,1} };
      for(int[] move : moves)
        count += search(grid, r+move[0], c+move[1]);
    }
    return count;
  }
  
  // Check if brick is connected to the top
  private boolean topConnect(int[][] grid, int r, int c) {
    if(r == 0) return true;
    // Up neighbor
    if(r-1 >= 0 && grid[r-1][c] == 2) return true;
    // Down neighbor
    if(r+1 < grid.length && grid[r+1][c] == 2) return true;
    // Left neighbor
    if(c-1 >= 0 && grid[r][c-1] == 2) return true;
    // Right neighbor
    if(c+1 < grid[0].length && grid[r][c+1] == 2) return true;
    
    return false;
  }
}
