package com.jlee.leetcodesolutions;

public class LeetCode0667 {
  /*
   * Given two integers n and k, you need to construct a list which contains n
   * different positive integers ranging from 1 to n and obeys the following
   * requirement: Suppose this list is [a1, a2, a3, ... , an], then the list [|a1
   * - a2|, |a2 - a3|, |a3 - a4|, ... , |an-1 - an|] has exactly k distinct
   * integers.
   * 
   * If there are multiple answers, print any of them.
   * 
   * Note: The n and k are in the range 1 <= k < n <= 10^4.
   * 
   * https://leetcode.com/problems/beautiful-arrangement-ii/description/
   */
  public int[] constructArray(int n, int k) {
    int[] result = new int[n];
    if(k == 1) {
      for(int i = 0; i < result.length; i++)
        result[i] = i+1;
      return result;
    }
    
    boolean takeFromMin = true;
    int min = k / 2, j = 1;
    if(k % 2 == 0)
      takeFromMin = true;
    else takeFromMin = false;

    // If even, min starts at the end
    // [2,3,4,5,6,7,8,9,10,1]
    //
    // If odd, min starts at end - 1
    // [2,3,4,5,6,7,8,9,1,10]
    for(int i = result.length-1; i >= 0; i--) {
      if(takeFromMin && j <= min) {
        result[i] = j;
        j++;
        takeFromMin = false;
      }
      else {
        result[i] = n;
        n--;
        takeFromMin = true;
      }
    }
    return result;
  }  
}
