package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode516 {
  /*
   * Given a string s, find the longest palindromic subsequence's length in s. You
   * may assume that the maximum length of s is 1000.
   * 
   * Example 1: 
   * Input: "bbbab" 
   * Output: 4 
   * One possible longest palindromic subsequence is "bbbb".
   * 
   * Example 2: 
   * Input: "cbbd" 
   * Output: 2 
   * One possible longest palindromic subsequence is "bb".
   * 
   * https://leetcode.com/problems/longest-palindromic-subsequence/description/
   */
  public int longestPalindromeSubseq(String s) {
    if(s == null || s.isEmpty())
      return 0;
    int[][] memo = new int[s.length()][s.length()];
    for(int[] row : memo)
      Arrays.fill(row, -1);
    return longestPalindromeSubseq(s, 0, s.length()-1, memo);
  }
  
  private int longestPalindromeSubseq(String s, int start, int end, int[][] memo) {
    if(start > end)
      return 0;
    if(start == end)
      return 1;
    if(memo[start][end] != -1)
      return memo[start][end];
    if(s.charAt(start) == s.charAt(end)) {
      // Characters are the same, include both (+2)
      memo[start][end] = 2 + longestPalindromeSubseq(s, start+1, end-1, memo);
      return memo[start][end];
    }
    // Find the max by either increasing start or decreasing end position.
    memo[start][end] = Math.max(longestPalindromeSubseq(s, start+1, end, memo), longestPalindromeSubseq(s, start, end-1, memo));
    return memo[start][end];
  }
}
