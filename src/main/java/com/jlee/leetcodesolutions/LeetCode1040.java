package com.jlee.leetcodesolutions;

import java.util.Arrays;

public class LeetCode1040 {
  /*
   * https://leetcode.com/problems/moving-stones-until-consecutive-ii/
   */
  public int[] numMovesStonesII(int[] stones) {
    int N = stones.length;
    int startIdx = 0, endIdx = 0;
    int maxElementsInWindow = 0;
    
    Arrays.sort(stones); // O(n log n)
    for(int i = 0, j = 0; i < N; i++) {
      int end = stones[i] + N; // This serves as the boundary of the window
      
      // See how many stones can fit in the current window
      while(j < N && stones[j] < end)
        j++;
      
      if(j - i > maxElementsInWindow || j - i == maxElementsInWindow && j - i > endIdx - startIdx) {
        // 5,6,7,8,10
        // A window of 6,7,8,10 is more desirable than 5,6,7,8 because you can move 5 to 9 directly
        startIdx = stones[i];
        endIdx = stones[j-1];
        maxElementsInWindow = j - i;
      }
    }
    
    // All the stones are already in consecutive order
    if(maxElementsInWindow == N)
      return new int[] {0,0};
    
    int min = N - maxElementsInWindow;
    // Edge case where you have N-1 in consecutive order, you must do an extra step
    // ie 1,2,3,4,7 --> 2,3,4,6,7 --> 2,3,4,5,6
    if(maxElementsInWindow == N-1 && endIdx - maxElementsInWindow + 1 == startIdx)
      min++;
    
    // Rightmost-to-left or Leftmost-to-right
    int max = Math.max(stones[N-1] - stones[1], stones[N-2] - stones[0]) - 1;
    // How many additional stones are in between
    max = max - (N - 3);
    
    return new int[] {min,max};
  }
}
