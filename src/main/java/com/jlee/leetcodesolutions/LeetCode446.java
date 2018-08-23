package com.jlee.leetcodesolutions;

import java.util.HashMap;

public class LeetCode446 {
  /*
   * https://leetcode.com/problems/arithmetic-slices-ii-subsequence/description/
   */
  public int numberOfArithmeticSlices(int[] A) {
    int N = A.length;
    long ans = 0;
    HashMap<Integer,Integer>[] map = new HashMap[N];
    for(int i = 0; i < N; i++) {
      map[i] = new HashMap<>();
      for(int j = 0; j < i; j++) {
        long delta = (long) A[i] - (long) A[j];
        if(delta < Integer.MIN_VALUE || delta > Integer.MAX_VALUE)
          continue;
        
        int diff = (int) delta;
        int c1 = map[i].getOrDefault(diff, 0);
        int c2 = map[j].getOrDefault(diff, 0);
        map[i].put(diff, c1 + c2 + 1);
        ans += c2;
      }
    }
    return (int) ans;
  }
}
