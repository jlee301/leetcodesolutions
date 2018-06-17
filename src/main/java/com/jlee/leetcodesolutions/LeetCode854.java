package com.jlee.leetcodesolutions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode854 {
  /*
   * Strings A and B are K-similar (for some non-negative integer K) if we can
   * swap the positions of two letters in A exactly K times so that the resulting
   * string equals B.
   * 
   * Given two anagrams A and B, return the smallest K for which A and B are
   * K-similar.
   * 
   * Note:
   * 1. 1 <= A.length == B.length <= 20
   * 2. A and B contain only lowercase letters from the set {'a', 'b', 'c', 'd',
   * 'e', 'f'}
   * 
   * https://leetcode.com/problems/k-similar-strings/description/
   */
  public int kSimilarity(String A, String B) {
    Queue<String> queue = new LinkedList<>();
    HashSet<String> visited = new HashSet<>();
    char[] target = B.toCharArray();
    
    queue.add(A);
    visited.add(A);
    int swaps = 0;
    
    // BFS
    while(!queue.isEmpty()) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        String str = queue.poll();
        // System.out.println("Polling: " + str);
        if(str.equals(B)) return swaps;
        
        char[] data = str.toCharArray();
        int j = 0;
        for(; j < data.length; j++) {
          // Skip until you find char not in the right place
          if(data[j] != target[j])  break;
        }  
        
        for(int k = j+1; k < data.length; k++) {
          // Only swap when:
          // 1. Char data[k] matches the desired target[j] character
          // 2. The character data[k] is not already in correct location
          if(data[k] == target[j] && data[k] != target[k]) {
            swap(data, j, k);
            String next = String.valueOf(data);
            if(!visited.contains(next)) {
              queue.add(next);
              visited.add(next);
              // System.out.println("Adding: " + next);
            }
            // Set it back to original to find next swap, ie backtracking
            swap(data, j, k);
          }
        }
      }
      swaps++;
      // System.out.println(swaps);
    }
    return -1;
  }
  
  public void swap(char[] data, int i, int j) {
    char ch = data[i];
    data[i] = data[j];
    data[j] = ch;
  }
}
