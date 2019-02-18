package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode996 {
  /*
   * https://leetcode.com/problems/number-of-squareful-arrays/
   */
  private int result;
  
  public int numSquarefulPerms(int[] A) {
    result = 0;
    
    // Obtain the frequency of each integer
    HashMap<Integer,Integer> mapCount = new HashMap<>();
    for(int n : A)
      mapCount.put(n, mapCount.getOrDefault(n, 0)+1);
    
    // Check each integer and see which other integer combined can create a perfect square
    // 1 --> 3, 8, 15, 24
    // 2 --> 2, 7, 14, 23
    HashMap<Integer,HashSet<Integer>> mapSq = new HashMap<>();
    for(int x : mapCount.keySet()) {
      mapSq.put(x, new HashSet<>());
      for(int y : mapCount.keySet()) {
        int sqRt = (int) Math.sqrt(x + y);
        if(sqRt * sqRt == x + y)
          mapSq.get(x).add(y);
      }
    }
    
    // Try each integer as the starting point
    for(int n : mapCount.keySet())
      dfs(n, mapCount, mapSq, A.length-1);
    
    return result;
  }
  
  private void dfs(int x, HashMap<Integer,Integer> mapCount, HashMap<Integer,HashSet<Integer>> mapSq, int N) {
    if(N == 0) {
      result++;
      return;
    }
    
    // Backtracking
    mapCount.put(x, mapCount.get(x)-1);
    
    // Check all possible integers that can create a perfect square with x
    for(int y : mapSq.get(x)) {
      if(mapCount.get(y) > 0)
        dfs(y, mapCount, mapSq, N-1);
    }
    
    mapCount.put(x, mapCount.get(x)+1);
  }
}
