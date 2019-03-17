package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.TreeSet;

public class LeetCode0730 {
  /*
   * Given a string S, find the number of different non-empty palindromic
   * subsequences in S, and return that number modulo 10^9 + 7.
   * 
   * A subsequence of a string S is obtained by deleting 0 or more characters from
   * S.
   * 
   * A sequence is palindromic if it is equal to the sequence reversed.
   * 
   * Two sequences A_1, A_2, ... and B_1, B_2, ... are different if there is some
   * i for which A_i != B_i.
   * 
   * Note:
   * 1. The length of S will be in the range [1, 1000].
   * 2. Each character S[i] will be in the set {'a', 'b', 'c', 'd'}.
   * 
   * https://leetcode.com/problems/count-different-palindromic-subsequences/description/
   */
  private Integer[][] memo;
  private HashMap<Integer,TreeSet<Integer>> map;
  private static int MOD = 1000000007;
  
  public int countPalindromicSubsequences(String S) {
    int N = S.length();
    memo = new Integer[N+1][N+1];
    map = new HashMap<>();
    
    // Creating bucket for each character, ie:
    // map[0] = a bucket, map[2] = c bucket
    // map[1] = b bucket, map[3] = d bucket
    for(int i = 0; i < 4; i++)
      map.put(i, new TreeSet<>());
    
    // Storing index position for each character bucket
    for(int i = 0; i < N; i++)
      map.get(S.charAt(i) - 'a').add(i);
    
    return countPalindromicSubsequences(S, 0, N);
  }
  
  private int countPalindromicSubsequences(String S, int start, int end) {
    if(start >= end)
      return 0;
    if(memo[start][end] != null)
      return memo[start][end];
    
    long count = 0;
    
    for(int i = 0; i < 4; i++) {
      // Find left most and right most of character
      Integer left = map.get(i).ceiling(start);
      Integer right = map.get(i).lower(end);
      
      // Character not found within start : end range
      if(left == null || left >= end) continue;

      count = left != right ? count + 2 : count + 1;
      count += countPalindromicSubsequences(S, left+1, right);
    }
    memo[start][end] = (int) (count % MOD);
    return memo[start][end];
  }
}
