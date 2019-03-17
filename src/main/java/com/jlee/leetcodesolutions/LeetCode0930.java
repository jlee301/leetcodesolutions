package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode0930 {
  /*
   * In an array A of 0s and 1s, how many non-empty subarrays have sum S?
   * 
   * https://leetcode.com/contest/weekly-contest-108/problems/binary-subarrays-with-sum/
   */
  public int numSubarraysWithSum(int[] A, int S) {
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0, 1);
    
    int count = 0;
    int sum = 0;
    for(int n : A) {
      sum += n;
      // have we seen a (sum - S) before?  it's count should be added 
      if(map.containsKey(sum - S))
        count += map.get(sum - S);
      
      // store how many times the accumulative sum has appear up to this point
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return count;
  }
}
