package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode967 {
  /*
   * https://leetcode.com/contest/weekly-contest-117/problems/numbers-with-same-consecutive-differences/
   */
  public int[] numsSameConsecDiff(int N, int K) {
    List<Integer> result = new ArrayList<>();
    if(N == 1)
      result.add(0);
    
    dfs(N, K, 0, 0, result);
    
    int[] ans = new int[result.size()];
    for(int i = 0; i < result.size(); i++)
      ans[i] = result.get(i);
    
    return ans;
  }
  
  private void dfs(int N, int K, int count, int num, List<Integer> result) {
    if(N == count) {
      if(!result.contains((Integer) num))
        result.add(num);
      return;
    }
    
    if(count == 0) {
      for(int i = 1; i < 10; i++)
        dfs(N, K, count+1, i, result);
    }
    else {
      int prev = num % 10;
      int next = prev - K;
      if(next >= 0)
        dfs(N, K, count+1, num*10 + next, result);
      
      next = prev + K;
      if(next < 10)
        dfs(N, K, count+1, num*10 + next, result);
    }
  }
}
