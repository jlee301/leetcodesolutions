package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode749 {
  /*
   * A virus is spreading rapidly, and your task is to quarantine the infected
   * area by installing walls.
   * 
   * The world is modeled as a 2-D array of cells, where 0 represents uninfected
   * cells, and 1 represents cells contaminated with the virus. A wall (and only
   * one wall) can be installed between any two 4-directionally adjacent cells, on
   * the shared boundary.
   * 
   * Every night, the virus spreads to all neighboring cells in all four
   * directions unless blocked by a wall. Resources are limited. Each day, you can
   * install walls around only one region -- the affected area (continuous block
   * of infected cells) that threatens the most uninfected cells the following
   * night. There will never be a tie.
   * 
   * Can you save the day? If so, what is the number of walls required? If not,
   * and the world becomes fully infected, return the number of walls used.
   * 
   * Note:
   * 1. The number of rows and columns of grid will each be in the range [1, 50].
   * 2. Each grid[i][j] will be either 0 or 1.
   * 3. Throughout the described process, there is always a contiguous viral
   * region that will infect strictly more uncontaminated squares in the next
   * round.
   * 
   * https://leetcode.com/problems/contain-virus/description/
   */
  private int[][] grid;
  private int R;
  private int C;
  private HashSet<Integer> visited;
  private List<HashSet<Integer>> regions;
  private List<HashSet<Integer>> expansions;
  private List<Integer> walls;
  private int[][] moves = { {-1,0}, {1,0}, {0,1}, {0,-1} };
  
  public int containVirus(int[][] grid) {
    this.grid = grid;
    R = grid.length;
    C = grid[0].length;    
    int wallsize = 0;

    while(true) {
      // regions[i] = set of areas belonging to region i
      // expansions[i] = set of areas that will expand to region i if not quarantined
      // walls[i] = the wall size of region i in order to quarantine
      visited = new HashSet<>();
      regions = new ArrayList<>();
      expansions = new ArrayList<>();
      walls = new ArrayList<>();
      
      // Figure out each region and its expansion
      for(int r = 0; r < R; r++) {
        for(int c = 0; c < C; c++ ) {
          if(grid[r][c] == 1 && !visited.contains(r*C + c)) {
            regions.add(new HashSet<>());
            expansions.add(new HashSet<>());
            walls.add(0);
            dfs(r,c); 
          }
        }
      }
      
      if(regions.isEmpty())
        break;
  
      // Quarantine region with greatest expansion
      int qindex = 0;
      for(int i = 0; i < walls.size(); i++) {
        if(expansions.get(qindex).size() < expansions.get(i).size())
          qindex = i;
      }
      wallsize += walls.get(qindex);
      for(int area : regions.get(qindex))
        grid[area / C][area % C] = -1;
      
      // Expand all other regions for next iteration
      for(int i = 0; i < expansions.size(); i++) {
        if(qindex == i) continue;
        for(int area : expansions.get(i))
          grid[area / C][area % C] = 1;
      }
    }
    return wallsize;
  }
  
  private void dfs(int r, int c) {
    if(!visited.contains(r*C + c)) {
      visited.add(r*C + c);
      int N = regions.size()-1;
      regions.get(N).add(r*C + c);
      
      // Check adjacent neighbors
      for(int[] move : moves) {
        int nextr = r+move[0];
        int nextc = c+move[1];
        if(nextr >= 0 && nextr < R && nextc >= 0 && nextc < C) {
          if(grid[nextr][nextc] == 1)
            dfs(nextr, nextc);
          else if(grid[nextr][nextc] == 0) {
            // Figure out adjacent expansion of each region, this is also wall size to
            // quarantine
            expansions.get(N).add(nextr*C + nextc);
            walls.set(N, walls.get(N)+1);
          }
        }
      }
    }
  }
}
