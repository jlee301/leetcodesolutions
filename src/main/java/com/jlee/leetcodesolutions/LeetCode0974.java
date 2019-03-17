package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode0974 {
  /*
   * https://leetcode.com/contest/weekly-contest-119/problems/subarray-sums-divisible-by-k/
   */
  public int subarraysDivByK(int[] A, int K) {
    // Storing the mod sum, frequency
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0, 1);
    
    int count = 0;
    int sum = 0;
    for(int num : A) {
      sum = (sum + num) % K;
      if(sum < 0)
        sum += K;
      
      count += map.getOrDefault(sum, 0);
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return count;
  }
}
