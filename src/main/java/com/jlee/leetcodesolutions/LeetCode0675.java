package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode0675 {
  /*
   * You are asked to cut off trees in a forest for a golf event. The forest is
   * represented as a non-negative 2D map, in this map:
   * 1. 0 represents the obstacle can't be reached.
   * 2. 1 represents the ground can be walked through.
   * 3. The place with number bigger than 1 represents a tree can be walked
   * through, and this positive number represents the tree's height.
   * 4. You are asked to cut off all the trees in this forest in the order of
   * tree's height - always cut off the tree with lowest height first. And after
   * cutting, the original place has the tree will become a grass (value 1).
   * 
   * You will start from the point (0, 0) and you should output the minimum steps
   * you need to walk to cut off all the trees. If you can't cut off all the
   * trees, output -1 in that situation.
   * 
   * You are guaranteed that no two trees have the same height and there is at
   * least one tree needs to be cut off.
   * 
   * https://leetcode.com/problems/cut-off-trees-for-golf-event/description/
   */
  public int cutOffTree(List<List<Integer>> forest) {
    // Record all tree height and positions
    List<int[]> trees = new ArrayList<>();
    int R = forest.size();
    int C = forest.get(0).size();
    for(int r = 0; r < R; r++) {
      for(int c = 0; c < C; c++) {
        int height = forest.get(r).get(c);
        if(height > 1)
          trees.add(new int[] {height, r, c});
      }
    }
    // Sort by the ascending height of the tree
    trees.sort(new TreeHeightComparator());
    
    // Will perform BFS for every tree to next tree to calculate distance
    int srcR = 0, srcC = 0, steps = 0;
    for(int[] tree : trees) {
      int dstR = tree[1];
      int dstC = tree[2];
      int dist = bfs(forest, srcR, srcC, dstR, dstC);
      if(dist == -1)
        return -1;
      steps += dist;
      srcR = dstR;
      srcC = dstC;
    }
    return steps;
  }
  
  private int bfs(List<List<Integer>> forest, int srcR, int srcC, int dstR, int dstC) {
    int[][] moves = { {0,1},{0,-1},{-1,0},{1,0} };
    int R = forest.size(), C = forest.get(0).size(), dist = 0;
    boolean[][] visited = new boolean[R][C];
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[] {srcR, srcC});
    visited[srcR][srcC] = true;
    
    while(!queue.isEmpty()) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        int[] curr = queue.poll();
        if(curr[0] == dstR && curr[1] == dstC)
          return dist;
        
        // Check next travel moves
        for(int[] move : moves) {
          int r = curr[0] + move[0];
          int c = curr[1] + move[1];
          
          // Cannot go out of bounds
          if(r < 0 || r == R || c < 0 || c == C || forest.get(r).get(c) == 0)
            continue;
          
          if(!visited[r][c]) {
            queue.add(new int[] {r,c});
            visited[r][c] = true;
          }
        }
      }
      dist++;
    }
    return -1;
  }
  
  private class TreeHeightComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] A, int[] B) {
      return A[0] - B[0];
    }
  }
}
