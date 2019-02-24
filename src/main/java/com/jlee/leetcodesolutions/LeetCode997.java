package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode997 {
  /*
   * https://leetcode.com/contest/weekly-contest-125/problems/find-the-town-judge/
   */
  public int findJudge(int N, int[][] trust) {
    // map1 personId -> person(s) that trust personId
    HashMap<Integer,HashSet<Integer>> map1 = new HashMap<>();
    for(int i = 1; i <= N; i++)
      map1.put(i, new HashSet<>());
    
    // map2 personId -> person(s) he trusts
    HashMap<Integer,HashSet<Integer>> map2 = new HashMap<>();
    for(int[] t : trust) {
      map1.get(t[1]).add(t[0]);
      map2.computeIfAbsent(t[0], k -> new HashSet<>()).add(t[1]);
    }
    
    for(int i = 1; i <= N; i++) {
      // Find person that trust no one that EVERYONE else trusts
      if(!map2.containsKey(i) && map1.get(i).size() == N-1)
        return i;
    }
    return -1;
  }
}
