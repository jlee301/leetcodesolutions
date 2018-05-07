package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LeetCode756 {
  /*
   * We are stacking blocks to form a pyramid. Each block has a color which is a
   * one letter string, like 'Z'.
   * 
   * For every block of color 'C' we place not in the bottom row, we are placing
   * it on top of a left block of color 'A' and right block of color 'B`'. We are
   * allowed to place the block there only if '(A, B, C)' is an allowed triple.
   * 
   * We start with a bottom row of bottom, represented as a single string. We also
   * start with a list of allowed triples allowed. Each allowed triple is
   * represented as a string of length 3.
   * 
   * Return true if we can build the pyramid all the way to the top, otherwise
   * false.
   * 
   * Note:
   * 1. bottom will be a string with length in range [2, 8].
   * 2. allowed will have length in range [0, 200].
   * 3. Letters in all strings will be chosen from the set {'A', 'B', 'C', 'D',
   * 'E', 'F', 'G'}.
   * 
   * https://leetcode.com/problems/pyramid-transition-matrix/description/
   */
  public boolean pyramidTransition(String bottom, List<String> allowed) {
    // Build map of first two characters for each allowed to be easily accessible
    HashMap<String,HashSet<String>> map = new HashMap<>();
    for(String str : allowed) {
      String key = str.substring(0, 2);
      if(!map.containsKey(key))
        map.put(key, new HashSet<>());
      map.get(key).add(str.substring(2));
    }
    return pyramidTransition(bottom, map);
  }
  
  private boolean pyramidTransition(String bottom, HashMap<String,HashSet<String>> map) {
    if(bottom.length() == 1)
      return true;
    
    // Check to see if the row can be converted
    for(int i = 0; i < bottom.length()-1; i++)
      if(!map.containsKey(bottom.substring(i, i+2))) return false;
    
    // Generate all possible combinations for the above pyramid row
    HashSet<String> combos = new HashSet<>();
    rowCombos(bottom, map, combos, new StringBuilder(), 0);
    
    // Try every row combination to see if it leads to a complete pyramid
    for(String combo : combos)
      if(pyramidTransition(combo, map)) return true;
    return false;
  }
  
  private void rowCombos(String bottom, HashMap<String,HashSet<String>> map, HashSet<String> combos, StringBuilder sb, int pos) {
    // Backtracking to create all possible row combinations
    if(pos == bottom.length()-1) {
      combos.add(sb.toString());
      return;
    }
    
    for(String str : map.get(bottom.substring(pos, pos+2))) {
      sb.append(str);
      rowCombos(bottom, map, combos, sb, pos+1);
      sb.deleteCharAt(sb.length()-1);
    }
  }
}
