package com.jlee.leetcodesolutions;

import java.util.TreeSet;

/*
 * Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.
 * 
 * Example 1:
 * Input: S = "loveleetcode", C = 'e'
 * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 * 
 * Note:
 * 1. S string length is in [1, 10000].
 * 2. C is a single character, and guaranteed to be in string S.
 * 3. All letters in S and C are lowercase.
 * 
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 */
public class LeetCode821 {
  public int[] shortestToChar(String S, char C) {
    // Store all char C positions. Using TreeSet to utilize the built in ceiling and
    // floor functions.
    TreeSet<Integer> set = new TreeSet<>();
    for(int i = 0; i < S.length(); i++)
      if(S.charAt(i) == C)
        set.add(i);
    
    int[] result = new int[S.length()];
    for(int i = 0; i < S.length(); i++) {
      char ch = S.charAt(i);
      if(ch == C)
        result[i] = 0;
      else {
        // Least element greater than i
        Integer ceil = set.ceiling(i);
        // Greatest element less than i
        Integer floor = set.floor(i);
        
        if(ceil == null)
          result[i] = i - floor;
        else if(floor == null)
          result[i] = ceil - i;
        else {
          result[i] = Math.min(i - floor, ceil - i);
        }
      }
    }
    return result;
  }
}
