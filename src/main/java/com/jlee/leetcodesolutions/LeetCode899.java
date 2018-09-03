package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode899 {
  /*
   * A string S of lowercase letters is given. Then, we may make any number of
   * moves.
   * 
   * In each move, we choose one of the first K letters (starting from the left),
   * remove it, and place it at the end of the string.
   * 
   * Return the lexicographically smallest string we could have after any number
   * of moves.
   * 
   * Note:
   * 1. 1 <= K <= S.length <= 1000
   * 2. S consists of lowercase letters only.
   * 
   * https://leetcode.com/problems/orderly-queue/description/
   */
  public String orderlyQueue(String S, int K) {
    String result = "";
    if(K == 1) {
      result = S;
      int N = S.length();
      for(int i = 0; i < N; i++) {
        S = S.substring(1) + S.charAt(0);
        if(S.compareTo(result) < 0)
          result = S;
      }
    }
    else {
      // If K > 1, you can always moves letters around to create ANY permutation possible
      // Therefore exact char ordering is the desired result.
      char[] sdata = S.toCharArray();
      Arrays.sort(sdata);
      result = String.valueOf(sdata);
    }    
    return result;
  }
}
