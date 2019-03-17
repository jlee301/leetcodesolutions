package com.jlee.leetcodesolutions;

public class LeetCode0072 {
  /*
   * Given two words word1 and word2, find the minimum number of operations
   * required to convert word1 to word2.
   * 
   * You have the following 3 operations permitted on a word:
   * 1. Insert a character
   * 2. Delete a character
   * 3. Replace a character
   * 
   * https://leetcode.com/problems/edit-distance
   */
  public int minDistance(String word1, String word2) {
    return helper(word1, word2, 0, 0, new Integer[word1.length()][word2.length()]);
  }
  
  private int helper(String word1, String word2, int i, int j, Integer[][] memo) {
    if(i == word1.length())
      return word2.length() - j;
    
    if(j == word2.length())
      return word1.length() - i;
    
    if(memo[i][j] != null)
      return memo[i][j];
    
    int count = 0;
    if(word1.charAt(i) == word2.charAt(j)) {
      // chars the same, just advance both indexes
      count += helper(word1, word2, i + 1, j + 1, memo);
    }
    else {
      // Attempt all three operations to find the smallest
      int ins = helper(word1, word2, i, j + 1, memo);
      int del = helper(word1, word2, i + 1, j, memo);
      int rep = helper(word1, word2, i + 1, j + 1, memo);
      count += Math.min(ins, Math.min(del, rep)) + 1;
    }
    memo[i][j] = count;
    return count;
  }
}
