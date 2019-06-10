package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode1079 {
  /*
   * https://leetcode.com/problems/letter-tile-possibilities/
   */
  public int numTilePossibilities(String tiles) {
    HashSet<String> set = new HashSet<>();
    dfs(tiles, set, new HashSet<>(), new StringBuilder());
    return set.size();
  }
  
  private void dfs(String tiles, HashSet<String> set, HashSet<Integer> used, StringBuilder sb) {
    // used keep track of which char index position was used
    // The main set is used to disregard any duplicates
    for(int i = 0; i < tiles.length(); i++) {
      if(!used.contains(i)) {
        char ch = tiles.charAt(i);
        
        // Backtracking component
        sb.append(ch);
        used.add(i);
        // If the str is already in the set, we have already been down this path
        if(set.add(sb.toString()))
          dfs(tiles, set, used, sb);
        
        used.remove(i);
        sb.deleteCharAt(sb.length()-1);
      }
    }
  }
}
