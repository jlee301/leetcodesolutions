package com.jlee.leetcodesolutions;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode132 {
  /*
   * Given a string s, partition s such that every substring of the partition is a
   * palindrome.
   * 
   * Return the minimum cuts needed for a palindrome partitioning of s.
   * 
   * https://leetcode.com/problems/palindrome-partitioning-ii/
   */
  public int minCut(String s) {
    int count = 0;
    Queue<Integer> queue = new LinkedList<>();
    queue.add(0);
    boolean[] visited = new boolean[s.length()];
    
    // BFS
    while(!queue.isEmpty()) {
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        int left = queue.poll();
        // Find all possible palindrome starting from left
        for(int right = s.length()-1; right >= 0; right--) {
          if(!visited[left] && isPalindrome(s, left, right)) {
            if(right == s.length()-1) {
              // Found shortest cut
              queue.clear();
              i = N;
              break;
            }
            queue.add(right + 1);
          }
        }
        visited[left] = true;
      }
      count++;
    }
    return count - 1;
  }
  
  private boolean isPalindrome(String s, int left, int right) {
    while(left < right) {
      if(s.charAt(left++) != s.charAt(right--))
        return false;      
    }
    return true;
  }
}
