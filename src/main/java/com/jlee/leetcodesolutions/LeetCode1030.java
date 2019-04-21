package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class LeetCode1030 {
  /*
   * https://leetcode.com/contest/weekly-contest-133/problems/matrix-cells-in-distance-order/
   */
  public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
    HashMap<Integer,List<int[]>> map = new HashMap<>();
    int dist = 0;
    
    for(int r = 0; r < R; r++) {
      for(int c = 0; c < C; c++) {
        dist = Math.abs(r0 - r) + Math.abs(c0 - c);
        map.computeIfAbsent(dist, k -> new ArrayList<>()).add(new int[] {r,c});
      }
    }
    
    int[][] ans = new int[R*C][];
    // The iterator of a TreeSet will be in ascending order
    Iterator<Integer> iter = new TreeSet<>(map.keySet()).iterator();
    int j = 0;
    while(iter.hasNext()) {
      int key = iter.next();
      List<int[]> coordList = map.get(key);
      for(int i = 0; i < coordList.size(); i++) {
        ans[j] = coordList.get(i);
        j++;
      }
    }
    return ans;
  }
}
