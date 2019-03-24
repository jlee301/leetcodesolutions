package com.jlee.leetcodesolutions;

public class LeetCode1020 {
  /*
   * https://leetcode.com/contest/weekly-contest-129/problems/partition-array-into-three-parts-with-equal-sum/
   */
  public boolean canThreePartsEqualSum(int[] A) {
    int N = A.length;
    int[] presum = new int[N];
    presum[0] = A[0];
    for(int i = 1; i < N; i++)
      presum[i] = presum[i-1] + A[i];
    
    for(int i = 0; i < N-2; i++) {
      for(int j = i+1; j < N-1; j++) {
        // Check if the three parts are equal
        if(presum[i] == presum[j] - presum[i] && presum[i] == presum[N-1] - presum[j])
          return true;
      }
    }
    return false;
  }
}
