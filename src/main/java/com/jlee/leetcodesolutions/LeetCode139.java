package com.jlee.leetcodesolutions;

import java.util.List;

public class LeetCode139 {
  /*
   * Given a non-empty string s and a dictionary wordDict containing a list of
   * non-empty words, determine if s can be segmented into a space-separated
   * sequence of one or more dictionary words. You may assume the dictionary does
   * not contain duplicate words.
   * 
   * For example, given s = "leetcode", dict = ["leet", "code"].
   * Return true because "leetcode" can be segmented as "leet code".
   * 
   * https://leetcode.com/problems/word-break/description/
   */
  public boolean wordBreak(String s, List<String> wordDict) {
    if(s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0)
      return false;
    
    // dp[i] = true represents s.substring(0, i) is breakable in some combination.
    boolean[] dp = new boolean[s.length()+1];
    dp[0] = true;
    for(int i = 1; i <= s.length(); i++) {
      for(int j = 0; j < i; j++) {
        if(dp[j] && wordDict.contains(s.substring(j, i))) {
          dp[i] = true;
          break;
        }
      }
    }
    return dp[s.length()];
  }
}
