package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LeetCode0851 {
  /*
   * In a group of N people (labelled 0, 1, 2, ..., N-1), each person has
   * different amounts of money, and different levels of quietness.
   * 
   * For convenience, we'll call the person with label x, simply "person x".
   * 
   * We'll say that richer[i] = [x, y] if person x definitely has more money than
   * person y. Note that richer may only be a subset of valid observations.
   * 
   * Also, we'll say quiet[x] = q if person x has quietness q.
   * 
   * Now, return answer, where answer[x] = y if y is the least quiet person (that
   * is, the person y with the smallest value of quiet[y]), among all people who
   * definitely have equal to or more money than person x.
   * 
   * https://leetcode.com/contest/weekly-contest-88/problems/loud-and-rich/
   */
  public int[] loudAndRich(int[][] richer, int[] quiet) {
    int N = quiet.length;
    
    // Develop list of people richer than [i]
    HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
    for(int i = 0; i < N; i++)
      map.put(i, new HashSet<>());
    for(int[] rich : richer)
      map.get(rich[1]).add(rich[0]);
      
    int[] answer = new int[N];    
    Arrays.fill(answer, -1);
    for(int i = 0; i < N; i++)
      dfs(map, quiet, answer, i);
    
    return answer;
  }
  
  private int dfs(HashMap<Integer,HashSet<Integer>> map, int[] quiet, int[] answer, int pos) {
    if(answer[pos] == -1) {
      // Initially always set most quietest to itself
      answer[pos] = pos;
    
      // Get all people richer than pos
      for(int next : map.get(pos)) {
        // qrp - quietest rich person
        int qrp = dfs(map, quiet, answer, next);
        if(quiet[qrp] < quiet[answer[pos]])
          answer[pos] = qrp;
      }
    }
    return answer[pos];
  }
}
