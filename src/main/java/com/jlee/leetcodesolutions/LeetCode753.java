package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode753 {
  /*
   * There is a box protected by a password. The password is n digits, where each
   * letter can be one of the first k digits 0, 1, ..., k-1.
   * 
   * You can keep inputting the password, the password will automatically be
   * matched against the last n digits entered.
   * 
   * For example, assuming the password is "345", I can open it when I type
   * "012345", but I enter a total of 6 digits.
   * 
   * Please return any string of minimum length that is guaranteed to open the box
   * after the entire string is inputted.
   * 
   * Note: 
   * 1. n will be in the range [1, 4].
   * 2. k will be in the range [1, 10].
   * 3. k^n will be at most 4096.
   * 
   * https://leetcode.com/problems/cracking-the-safe/description/
   */
  public String crackSafe(int n, int k) {
    int total = (int) Math.pow(k, n);
    HashSet<String> visited = new HashSet<>();
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < n; i++)
      sb.append(0);
    
    visited.add(sb.toString());
    dfs(sb, visited, n, k, total);
    return sb.toString();
  }
  
  private boolean dfs(StringBuilder sb, HashSet<String> visited, int n, int k, int total) {
    if(visited.size() == total) {
      // When the string contains every possible password combination
      return true;
    }
    
    for(int i = 0; i < k; i++) {
      sb.append(i);
      // Grab the password generated from the last n digits
      // Check to see if it is not already in the string
      String next = sb.substring(sb.length()-n, sb.length());
      if(!visited.contains(next)) {
        visited.add(next);
        if(dfs(sb, visited, n, k, total))
          return true;
        visited.remove(next);
      }
      // Backtracking last digit
      sb.delete(sb.length()-1, sb.length());
    }
    return false;
  }
}
