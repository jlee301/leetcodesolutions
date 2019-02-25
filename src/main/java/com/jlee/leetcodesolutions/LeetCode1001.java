package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode1001 {
  /*
   * https://leetcode.com/problems/grid-illumination/
   */
  public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {
    // Since the N can be up to 10^9, it is not optimal to build such a large grid
    // We must store only information needed
    // rmap: rowIdx -> frequency that lamp is on this row
    // cmap: colIdx -> frequency that lamp is on this col
    // lrmap: rowId+colId -> frequency that lamp is on this left to right diagonal
    // rlmap: rowId-colId -> frequency that lamp is on this right to left diagonal
    // map: r + "_" + c -> true (on)/false (off)
    HashMap<Integer,Integer> rmap = new HashMap<>();
    HashMap<Integer,Integer> cmap = new HashMap<>();
    HashMap<Integer,Integer> lrmap = new HashMap<>();
    HashMap<Integer,Integer> rlmap = new HashMap<>();
    HashMap<String,Boolean> map = new HashMap<>();
    
    // Traverse through lamps and populate the initial state of the maps
    for(int[] lamp : lamps) {
      int r = lamp[0];
      int c = lamp[1];
      rmap.put(r, rmap.getOrDefault(r, 0) + 1);
      cmap.put(c, cmap.getOrDefault(c, 0) + 1);
      lrmap.put(r + c, lrmap.getOrDefault(r + c, 0) + 1);
      rlmap.put(r - c, rlmap.getOrDefault(r - c, 0) + 1);
      map.put(r + "_" + c, true);
    }
    
    
    // Traverse through queries to populate the result and turn off lamps
    int[] result = new int[queries.length];
    int[][] moves = { {0,0}, {-1,0}, {-1,1}, {0,1}, {1,1}, {1,0}, {1,-1}, {0,-1}, {-1,-1} }; 
    for(int i = 0; i < queries.length; i++) {
      int r = queries[i][0];
      int c = queries[i][1];
      
      // Check if the query position is illuminated
      if (rmap.getOrDefault(r, 0) > 0 || cmap.getOrDefault(c, 0) > 0 || lrmap.getOrDefault(r + c, 0) > 0
          || rlmap.getOrDefault(r - c, 0) > 0)
        result[i] = 1;

      // Now turn off the lamp at this position or are adjacent 8-directionally
      for(int[] move : moves) {
        int nextR = r + move[0];
        int nextC = c + move[1];
        String key = nextR + "_" + nextC;
        
        // Only turn off if the lamp at this position is actually on
        if(map.getOrDefault(key, false))
          turnOff(nextR, nextC, rmap, cmap, lrmap, rlmap, map);
      }
    }
    return result;
  }
  
  private void turnOff(int r, int c, HashMap<Integer, Integer> rmap, HashMap<Integer, Integer> cmap,
      HashMap<Integer, Integer> lrmap, HashMap<Integer, Integer> rlmap, HashMap<String, Boolean> map) {
    rmap.put(r, rmap.get(r) - 1);
    cmap.put(c, cmap.get(c) - 1);
    lrmap.put(r + c, lrmap.get(r + c) - 1);
    rlmap.put(r - c,  rlmap.get(r - c) - 1);
    map.put(r + "_" + c, false);
  }
}
