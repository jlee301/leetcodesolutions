package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode301 {
  /*
   * Remove the minimum number of invalid parentheses in order to make the input
   * string valid. Return all possible results.
   * 
   * Note: The input string may contain letters other than the parentheses ( and
   * ).
   * 
   * https://leetcode.com/problems/remove-invalid-parentheses/description/
   */
  public List<String> removeInvalidParentheses(String s) {
    List<String> result = new ArrayList<>();
    HashSet<String> visited = new HashSet<>();
    Queue<String> queue = new LinkedList<>();
    
    if(s != null) {
      queue.add(s);
      visited.add(s);
    }
    boolean found = false;
    
    // BFS
    while(!queue.isEmpty()) {
      if(found) {
        // No need to check ANY of the next level candidates as they were added into the
        // queue before a valid one was found.
        queue.clear();
        continue;
      }
      
      int N = queue.size();
      for(int i = 0; i < N; i++) {
        String curr = queue.poll();

        if(isValidParentheses(curr)) {
          result.add(curr);
          found = true;
        }
        // No need to create next level candidates once found, but still need to check
        // remaining current level candidates
        
        // Remove every '(' or ')' individually to create next level candidate
        for(int j = 0; j < curr.length() && !found; j++) {
          char ch = s.charAt(j);
          if(ch != '(' && ch != ')') continue;
          
          String next = curr.substring(0, j) + curr.substring(j+1);
          if(!visited.contains(next)) {
            visited.add(next);
            queue.add(next);
          }
        }
      }
    }
    return result;
  }
  
  private boolean isValidParentheses(String s) {
    int count = 0;
    for(int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if(ch == '(') 
        count++;
      
      // The cases where you have more ')' and there is no way to make them valid at
      // this point
      if(ch == ')' && count-- == 0)
        return false;
    }
    return count == 0;
  }
}
