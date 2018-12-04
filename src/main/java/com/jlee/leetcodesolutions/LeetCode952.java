package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LeetCode952 {
  /*
   * Given a non-empty array of unique positive integers A, consider the following
   * graph:
   * 1. There are A.length nodes, labelled A[0] to A[A.length - 1];
   * 2. There is an edge between A[i] and A[j] if and only if A[i] and A[j] share
   * a common factor greater than 1.
   * 
   * Return the size of the largest connected component in the graph.
   * 
   * https://leetcode.com/problems/largest-component-size-by-common-factor/
   */
  int[] parents;
  int[] counts;
  
  public int largestComponentSize(int[] A) {
    // Map each integer's index to its prime factorization
    // ie A: [2,10,20]
    // 2: [0,1,2]  5: [1,2]
    HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
    int N = A.length;
    for(int i = 0; i < N; i++) {
      int d = 2;
      int x = A[i];
      
      // Find the prime factorization of A[i]
      while(d * d <= x) {
        if(x % d == 0) {
          while(x % d == 0) 
            x /= d;
          
          map.computeIfAbsent(d, k -> new HashSet<>()).add(i);
        }
        d++;
      }
      if(x > 1)
        map.computeIfAbsent(x, k -> new HashSet<>()).add(i);
    }
    
    counts = new int[N];
    Arrays.fill(counts, 1);
    
    parents = new int[N];
    for(int i = 0; i < N; i++)
      parents[i] = i;
    
    int max = 1;
    // Union each set and calculate the max counts
    for(HashSet<Integer> set : map.values()) {
      int mergeIdx = set.iterator().next();
      for(int nextIdx : set)
        union(nextIdx, mergeIdx);
      
      max = Math.max(max, counts[find(mergeIdx)]);
    }
    
    return max;
  }  
  
  private void union(int i, int j) {
    int pi = find(i);
    int pj = find(j);
    if(pi == pj)
      return;
    
    parents[pi] = pj;
    counts[pj] += counts[pi];
  }
  
  private int find(int i) {
    return parents[i] == i ? i : find(parents[i]);
  }
}
