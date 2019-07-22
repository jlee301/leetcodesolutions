package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1129 {
  /*
   * https://leetcode.com/problems/shortest-path-with-alternating-colors/
   */
  public int[] shortestAlternatingPaths(int n, int[][] red_edges, int[][] blue_edges) {
    Queue<String> queue = new LinkedList<>();
    HashSet<String> used = new HashSet<>();
    HashMap<Integer,HashSet<Integer>> redMap = new HashMap<>();
    HashMap<Integer,HashSet<Integer>> blueMap = new HashMap<>();
    // Map each directed path
    for(int[] red : red_edges) {
      redMap.computeIfAbsent(red[0], k -> new HashSet<>()).add(red[1]);
      if(red[0] == 0) {
        String key = red[0] + " red";
        if(!queue.contains(key))
          queue.add(key);
        used.add(key);
      }
    }
    
    for(int[] blue : blue_edges) {
      blueMap.computeIfAbsent(blue[0], k -> new HashSet<>()).add(blue[1]);
      if(blue[0] == 0) {
        String key = blue[0] + " blue";
        if(!queue.contains(key))
          queue.add(key);
        used.add(key);
      }
    }
    
    int[] result = new int[n];
    Arrays.fill(result, Integer.MAX_VALUE);
    result[0] = 0;
    int len = 0;
    // BFS
    while(!queue.isEmpty()) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        String[] sData = queue.poll().split(" ");
        int from = Integer.parseInt(sData[0]);
        String color = sData[1];
        // System.out.println(from + " " + color);
        result[from] = Math.min(result[from], len);
        
        if(color.equals("red")) {
          if(redMap.containsKey(from)) {
            for(int next : redMap.get(from)) {
              String key = next + " blue";
              if(!used.contains(key)) {
                queue.add(key);
                used.add(key);
              }
            }
          }
        }
        else {
          if(blueMap.containsKey(from)) {
            for(int next : blueMap.get(from)) {
              String key = next + " red";
              if(!used.contains(key)) {
                queue.add(key);
                used.add(key);
              }
            }
          }
        }
      }
      len++;
    }
    
    // Any values still marked as Integer.MAX_VALUE means it cannot be reached with
    // alternating colors
    for(int i = 0; i < result.length; i++) {
      if(result[i] == Integer.MAX_VALUE)
        result[i] = -1;
    }
    return result;
  }
}
