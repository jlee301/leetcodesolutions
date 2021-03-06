package com.jlee.leetcodesolutions;

public class LeetCode0526 {
  /*
   * Suppose you have N integers from 1 to N. We define a beautiful arrangement as
   * an array that is constructed by these N numbers successfully if one of the
   * following is true for the ith position (1 <= i <= N) in this array:
   * 1. The number at the ith position is divisible by i.
   * 2. i is divisible by the number at the ith position.
   * 
   * Now given N, how many beautiful arrangements can you construct?
   * 
   * Example 1:
   * Input: 2
   * Output: 2
   * Explanation:
   * The first beautiful arrangement is [1, 2]:
   * Number at the 1st position (i=1) is 1, and 1 is divisible by i (i=1).
   * Number at the 2nd position (i=2) is 2, and 2 is divisible by i (i=2).
   * 
   * The second beautiful arrangement is [2, 1]:
   * Number at the 1st position (i=1) is 2, and 2 is divisible by i (i=1).
   * Number at the 2nd position (i=2) is 1, and i (i=2) is divisible by 1.
   * Note: N is a positive integer and will not exceed 15.
   * 
   * https://leetcode.com/problems/beautiful-arrangement/description/
   */
  private int count;
  
  public int countArrangement(int N) {
    count = 0;
    countArrangement(N, 1, new boolean[N+1]);
    return count;
  }
  
  private void countArrangement(int N, int index, boolean[] used) {
    if(index > N) {
      count++;
      return;
    }
    for(int n = 1; n <= N; n++) {
      if(!used[n] && (n % index == 0 || index % n == 0)) {
        used[n] = true;
        countArrangement(N, index+1, used);
        used[n] = false;
      }
    }
  }
}
