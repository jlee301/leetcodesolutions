package com.jlee.leetcodesolutions;

public class LeetCode1014 {
  /*
   * https://leetcode.com/problems/best-sightseeing-pair/
   */
  public int maxScoreSightseeingPair(int[] A) {
    if(A.length < 2)
      return 0;
    
    //  0,1,2,3,4
    // {8,1,5,2,6}
    int ans = 0;
    int currMax = A[0];
    for(int i = 1; i < A.length; i++) {
      // Handle the distance between i and j
      currMax--;
      
      ans = Math.max(ans, currMax + A[i]);
      currMax = Math.max(currMax, A[i]);
    }
    return ans;
  }
}
