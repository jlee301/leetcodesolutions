package com.jlee.leetcodesolutions;

public class LeetCode0583 {
  /*
   * Given two words word1 and word2, find the minimum number of steps required to
   * make word1 and word2 the same, where in each step you can delete one
   * character in either string.
   * 
   * Example 1:
   * Input: "sea", "eat"
   * Output: 2
   * Explanation: You need one step to make "sea" to "ea" and another step to make
   * "eat" to "ea".
   * 
   * Note:
   * 1. The length of given words won't exceed 500.
   * 2. Characters in given words can only be lower-case letters.
   * 
   * https://leetcode.com/problems/delete-operation-for-two-strings/description/
   */
  public int minDistance(String word1, String word2) {
    if(word1 == null || word2 == null)
      return 0;
    // The sum of both words minus 2 * the length of the longest common subsequence
    // = how many characters you have to delete
    int len1 = word1.length(), len2 = word2.length();
    return len1+len2 - 2*lowestCommonSubsequence(word1, word2, len1-1, len2-1, new int[len1][len2]);
  }
  
  private int lowestCommonSubsequence(String word1, String word2, int pos1, int pos2, int[][] memo) {
    if(pos1 < 0 || pos2 < 0)
      return 0;
    if(memo[pos1][pos2] != 0)
      return memo[pos1][pos2];
    
    if(word1.charAt(pos1) == word2.charAt(pos2))
      memo[pos1][pos2] = 1 + lowestCommonSubsequence(word1, word2, pos1-1, pos2-1, memo);
    else
      memo[pos1][pos2] = Math.max(lowestCommonSubsequence(word1, word2, pos1-1, pos2, memo), lowestCommonSubsequence(word1, word2, pos1, pos2-1, memo));
    
    return memo[pos1][pos2];
  }
}
