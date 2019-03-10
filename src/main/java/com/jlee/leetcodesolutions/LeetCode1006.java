package com.jlee.leetcodesolutions;

public class LeetCode1006 {
  /*
   * https://leetcode.com/contest/weekly-contest-127/problems/clumsy-factorial/
   */
  public int clumsy(int N) {
    // 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1
    // (11) + 7 - (7) + 3 - (2)
    int ans = helper(N);
    N -= 3;
    // Adds N-3 to the ans
    ans = N > 0 ? ans + N-- : ans;
    
    while(N > 0) {
      ans -= helper(N);
      N -= 3;
      ans = N > 0 ? ans + N-- : ans;
    }
    return ans;
  }
  
  private int helper(int N) {
    // performs the (N * N-1) / N-2
    int ans = N--;
    
    ans = N > 0 ? ans * N-- : ans;
    ans = N > 0 ? ans / N-- : ans;
        
    return ans;
  }
}
