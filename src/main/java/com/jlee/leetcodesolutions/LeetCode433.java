package com.jlee.leetcodesolutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode433 {
  /*
   * https://leetcode.com/problems/minimum-genetic-mutation/
   */
  public int minMutation(String start, String end, String[] bank) {
    HashSet<String> bankSet = new HashSet<>();
    for(String str : bank)
      bankSet.add(str);
    
    Queue<String> queue = new LinkedList<>();
    HashSet<String> visited = new HashSet<>();
    queue.add(start);
    visited.add(start);
    
    // BFS
    char[] genes = {'A','C','G','T'};
    int count = 0;
    while(!queue.isEmpty()) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        String curr = queue.poll();
        if(curr.equals(end))
          return count;
        
        char[] next = curr.toCharArray();
        for(int j = 0; j < next.length; j++) {
          char prev = next[j];
          // Try every possible gene mutation
          for(char ch : genes) {
            next[j] = ch;            
            String nextStr = String.valueOf(next);
            // Is next a valid mutation?
            if(!visited.contains(nextStr) && bankSet.contains(nextStr)) {
              visited.add(nextStr);
              queue.add(nextStr);
            }
          }
          next[j] = prev;
        }
      }
      count++;
    }
    return -1;
  }
}
