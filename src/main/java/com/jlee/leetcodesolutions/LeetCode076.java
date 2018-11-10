package com.jlee.leetcodesolutions;

public class LeetCode076 {
  /*
   * Given a string S and a string T, find the minimum window in S which will
   * contain all the characters in T in complexity O(n).
   * 
   * Note:
   * 1. If there is no such window in S that covers all characters in T, return
   * the empty string "".
   * 2. If there is such window, you are guaranteed that there will always be only
   * one unique minimum window in S.
   * 
   * https://leetcode.com/problems/minimum-window-substring/
   */
  public String minWindow(String s, String t) {
    int N = s.length();
    int M = t.length();
    
    // Create target array to match
    // Using size 58 to handle upper and lower cases
    int[] target = new int[58];
    for(int i = 0; i < M; i++)
      target[t.charAt(i) - 'A']++;
    
    int left = 0, right = 0;
    int[] count = new int[58];
    String result = "";
    while(left <= N - M) {
      // expand == f, increase left
      // expand == t, increase right
      boolean expand = false;
      for(int i = 0; i < 58; i++) {
        if(count[i] < target[i]) {
          expand = true;
          break;
        }
      }
      
      if(expand) {
        // The current window is missing chars of t
        if(right < N)
          count[s.charAt(right++) - 'A']++;
        else {
          // No more room to increase right, increase left
          left++;
        }
      }
      else {
        // The current window contains all chars of t
        String currStr = s.substring(left, right);
        result = result.isEmpty() || result.length() > currStr.length() ? currStr : result;
        count[s.charAt(left++) - 'A']--;
      }
    }
    return result;
  }
}
