package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode1048 {
  /*
   * https://leetcode.com/problems/longest-string-chain/
   */
  public int longestStrChain(String[] words) {
    HashSet<String> set = new HashSet<>();
    HashMap<String,Integer> memo = new HashMap<>();
    
    // Dump all words into a set for fasting searching
    for(String word : words)
      set.add(word);
    
    int max = 0;
    for(String word : words)
      max = Math.max(max, dfs(word, set, memo));
    
    return max;
  }
  
  private int dfs(String word, HashSet<String> set, HashMap<String,Integer> memo) {
    if(memo.containsKey(word))
      return memo.get(word);
    
    int max = 0;
    // Find the longest chain you can create from the word
    // We will do this by inserting each char (a thru z) at every position of the word
    for(int i = 0; i < 26; i++) {
      char ch = (char)('a' + i);
      for(int j = 0; j <= word.length(); j++) {
        String next = word.substring(0, j) + ch + word.substring(j);
        if(set.contains(next))
          max = Math.max(max, dfs(next, set, memo));
      }
    }    
    max++;
    memo.put(word, max);
    return max;
  }
}
