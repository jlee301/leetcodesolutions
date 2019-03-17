package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.TreeSet;

public class LeetCode0983 {
  /*
   * https://leetcode.com/problems/minimum-cost-for-tickets/
   */
  public int mincostTickets(int[] days, int[] costs) {
    TreeSet<Integer> set = new TreeSet<>();
    for(int d : days)
      set.add(d);
    
    return dfs(set, costs, 0, new HashMap<>());
  }
  
  private int dfs(TreeSet<Integer> set, int[] costs, int currDay, HashMap<Integer,Integer> memo) {
    // Determine next day of travel
    Integer nextDay = set.ceiling(currDay);
    
    if(nextDay == null)
      return 0;
    
    if(memo.containsKey(nextDay))
      return memo.get(nextDay);
    
    // Find min cost at nextDay
    int cost1 = costs[0] + dfs(set, costs, nextDay+1, memo);
    int cost7 = costs[1] + dfs(set, costs, nextDay+7, memo);
    int cost30 = costs[2] + dfs(set, costs, nextDay+30, memo);
    
    memo.put(nextDay, Math.min(Math.min(cost1, cost7), cost30));
    return memo.get(nextDay);
  }
}
