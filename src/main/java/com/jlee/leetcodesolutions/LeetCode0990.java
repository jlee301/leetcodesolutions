package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode0990 {
  /*
   * https://leetcode.com/problems/satisfiability-of-equality-equations/
   */
  public boolean equationsPossible(String[] equations) {
    // Create mapping of all == equations
    HashMap<Character,HashSet<Character>> map = new HashMap<>();
    for(String eq : equations) {
      if(eq.charAt(1) == '=') {
        char var1 = eq.charAt(0);
        char var2 = eq.charAt(3);
        map.computeIfAbsent(var1, k -> new HashSet<>()).add(var2);
        map.computeIfAbsent(var2, k -> new HashSet<>()).add(var1);
      }
    }
    
    // Now check every != equations to see if there is any conflicts
    // If we check all matches and var1 == var2, then there's a conflict
    HashSet<Character> visited = new HashSet<>();
    for(String eq : equations) {
      if(eq.charAt(1) == '!') {
        char var1 = eq.charAt(0);
        char var2 = eq.charAt(3);
        
        // eg. a != a is invalid
        if(var1 == var2)
          return false;
        
        // var1 or var2 have no == mappings, skip equation
        if(!map.containsKey(var1) || !map.containsKey(var2))
          continue;
        
        visited.add(var1);
        
        if(dfs(var1, var2, map, visited))
          return false;
        
        visited.remove(var1);
      }
    }
    return true;
  }
  
  private boolean dfs(char var1, char var2, HashMap<Character,HashSet<Character>> map, HashSet<Character> visited) {
    if(var1 == var2)
      return true;
    
    for(char next : map.get(var1)) {
      if(visited.contains(next))
        continue;
      
      visited.add(next);
      
      if(dfs(next, var2, map, visited))
        return true;
      
      visited.remove(next);
    }
    return false;
  }
}
