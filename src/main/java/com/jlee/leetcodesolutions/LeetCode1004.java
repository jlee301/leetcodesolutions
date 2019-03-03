package com.jlee.leetcodesolutions;

public class LeetCode1004 {
  /*
   * https://leetcode.com/contest/weekly-contest-126/problems/max-consecutive-ones-iii/
   */
  public int longestOnes(int[] A, int K) {
    // [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1]
    int max = 0, count = 0, left = 0, right = 0;
    while(right < A.length) {
      // We keep track of the count of zeroes
      // And use a sliding window to determine the size of 1's
      if(A[right] == 0)
        count++;
      
      right++;
      
      // If the count of zeroes is greater than K, keep moving the left pointer
      while(count > K) {
        if(A[left] == 0)
          count--;
          
        left++;
      }
      max = Math.max(max, right - left);
    }    
    return max;
  }
}
