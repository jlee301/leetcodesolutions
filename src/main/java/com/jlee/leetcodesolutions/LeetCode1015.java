package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode1015 {
  /*
   * https://leetcode.com/contest/weekly-contest-129/problems/smallest-integer-divisible-by-k/
   */
  public int smallestRepunitDivByK(int K) {
    // Even K cannot result in a odd number
    if(K % 2 == 0)
      return -1;
    
    int len = 1;
    int N = 1;
    while(N < K) {
      N = N * 10 + 1;
      len++;
    }
    
    HashSet<Integer> visited = new HashSet<>();
    while(N % K != 0) {
      N = N % K;
      // If the pattern repeats, it will loop forever, so it's not possible
      if(!visited.add(N))
        return -1;
      
      N = N * 10 + 1;
      len++;
    }
    return len;
  }
}
