package com.jlee.leetcodesolutions;

public class LeetCode0859 {
  /*
   * Given two strings A and B of lowercase letters, return true if and only if we
   * can swap two letters in A so that the result equals B.
   * 
   * https://leetcode.com/contest/weekly-contest-90/problems/buddy-strings/
   */
  public boolean buddyStrings(String A, String B) {
    if(A.length() != B.length())
      return false;
    
    // A = aa, B = aa --> true
    // A = ab, B = ab --> false
    int N = A.length();
    
    if(A.equals(B)) {
      // If A and B are equal, this can only be true if a character repeats more than
      // once
      int[] charcount = new int[26];
      for(int i = 0; i < N; i++) {
        char ch = A.charAt(i);
        charcount[ch - 'a']++;
      }
      for(int num : charcount) {
        if(num > 1) return true;
      }
      return false;
    }
    else {
      // If A and B are not equal, we want to make sure there's only two differences
      // prev and curr are the index position of the two out of place chars
      int count = 0, prev = -1, curr = -1;
      for(int i = 0; i < N; i++) {
        if(A.charAt(i) != B.charAt(i)) {
          count++;
          if(count > 2) return false;
          prev = curr;
          curr = i;
        }
      }
      return count == 2 && A.charAt(prev) == B.charAt(curr) && A.charAt(curr) == B.charAt(prev);
    }
  }
}
