package com.jlee.leetcodesolutions;

public class LeetCode1035 {
  /*
   * https://leetcode.com/problems/uncrossed-lines/
   */
  public int maxUncrossedLines(int[] A, int[] B) {
    return dfs(A, B, 0, 0, new Integer[A.length][B.length]);
  }
  
  private int dfs(int[] A, int[] B, int posA, int posB, Integer[][] memo) {
    if(posA == A.length || posB == B.length)
      return 0;
    
    if(memo[posA][posB] != null)
      return memo[posA][posB];
    
    int crossed = 0;
    if(A[posA] == B[posB]) {
      // There's a match, advance both pointers
      crossed = 1 + dfs(A, B, posA+1, posB+1, memo);
    }
    else {
      // Check to see which has more matches, by advancing B or A
      int path1 = dfs(A, B, posA, posB+1, memo);
      int path2 = dfs(A, B, posA+1, posB, memo);
      crossed = Math.max(path1, path2);
    }
    
    memo[posA][posB] = crossed;
    return crossed;
  }
}
