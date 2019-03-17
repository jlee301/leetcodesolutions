package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode0893 {
  /*
   * You are given an array A of strings.
   * 
   * Two strings S and T are special-equivalent if after any number of moves, S ==
   * T.
   * 
   * A move consists of choosing two indices i and j with i % 2 == j % 2, and
   * swapping S[i] with S[j].
   * 
   * Now, a group of special-equivalent strings from A is a non-empty subset of A
   * such that any string not in A is not special-equivalent with any string in A.
   * 
   * Return the number of groups of special-equivalent strings from A.
   * 
   * https://leetcode.com/contest/weekly-contest-99/problems/groups-of-special-equivalent-strings/
   */
  public int numSpecialEquivGroups(String[] A) {
    HashSet<Integer> seen = new HashSet<>();
    int count = 0;
    for(int i = 0; i < A.length; i++) {
      if(seen.contains(i))
        continue;
      
      seen.add(i);
      count++;
      
      // Get the odd and even character counts
      int[] odds = new int[26];
      int[] evens = new int[26];
      for(int k = 0; k < A[i].length(); k++) {
        if(k % 2 == 0)
          evens[A[i].charAt(k) - 'a']++;
        else
          odds[A[i].charAt(k) - 'a']++;
      }
      
      // Compare the count of each String[j] with String[i]
      // If there is a match, mark as same group
      for(int j = i+1; j < A.length; j++) {
        if(seen.contains(j))
          continue;
        
        int[] cmpOdds = new int[26];
        int[] cmpEvens = new int[26];
        for(int k = 0; k < A[j].length(); k++) {
          if(k % 2 == 0)
            cmpEvens[A[j].charAt(k) - 'a']++;
          else
            cmpOdds[A[j].charAt(k) - 'a']++;          
        }
        
        boolean equiv = true;
        for(int k = 0; k < 26; k++) {
          if(odds[k] != cmpOdds[k] || evens[k] != cmpEvens[k]) {
            equiv = false;
            break;
          }
        }
        // Mark as the same group
        if(equiv)
          seen.add(j);
      }
    }
    return count;
  }
}
