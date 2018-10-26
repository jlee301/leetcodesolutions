package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode140 {
  /*
   * Given a non-empty string s and a dictionary wordDict containing a list of
   * non-empty words, add spaces in s to construct a sentence where each word is a
   * valid dictionary word. Return all such possible sentences.
   */
  public List<String> wordBreak(String s, List<String> wordDict) {
    return dfs(s, wordDict, new HashMap<>());
  }
  
  private List<String> dfs(String s, List<String> wordDict, HashMap<String, List<String>> memo) {
    if(memo.containsKey(s))
      return memo.get(s);
    
    List<String> result = new ArrayList<>();
    // Base case
    if(s.length() == 0) {
      result.add("");
      return result;
    }
    
    // Check to see if any of the words are a prefix of s
    for(String word : wordDict) {
      if(s.startsWith(word)) {
        List<String> subList = dfs(s.substring(word.length()), wordDict, memo);
        
        for(String sub : subList)
          result.add(word + (sub.length() == 0 ? "" : " ") + sub);
      }
    }
    memo.put(s, result);
    return result;
  }
}
