package com.jlee.leetcodesolutions;

public class LeetCode949 {
  /*
   * https://leetcode.com/contest/weekly-contest-113/problems/largest-time-for-given-digits/
   */
  private String max = "";
  public String largestTimeFromDigits(int[] A) {
    helper(A, new int[] {2,3,5,9}, new boolean[4], new StringBuilder());    
    return max.isEmpty() ? max : max.substring(0,2) + ":" + max.substring(2);
  }
  
  private void helper(int[] A, int[] limit, boolean[] used, StringBuilder sb) {
    int N = sb.length();
    if(N == 4) {
      if(max.isEmpty() || sb.toString().compareTo(max) > 0)
        max = sb.toString();
      return;
    }
    
    for(int i = 0; i < A.length; i++) {
      if(used[i])
        continue;
      
      // Code to handle hour limits
      if(N == 1) {
        if(sb.charAt(0) == '2' && A[i] > limit[N])
          continue;
      }
      else {  
        if(A[i] > limit[N])
          continue;
      }
      
      // Backtracking
      sb.append(A[i]);
      used[i] = true;
      helper(A, limit, used, sb);
      sb.deleteCharAt(sb.length()-1);
      used[i] = false;
    }
  }
}
