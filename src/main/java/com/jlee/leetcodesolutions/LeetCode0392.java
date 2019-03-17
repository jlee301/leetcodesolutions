package com.jlee.leetcodesolutions;

public class LeetCode0392 {
  /*
   * Given a string s and a string t, check if s is subsequence of t.
   * 
   * You may assume that there is only lower case English letters in both s and t.
   * t is potentially a very long (length ~= 500,000) string, and s is a short
   * string (<=100).
   * 
   * A subsequence of a string is a new string which is formed from the original
   * string by deleting some (can be none) of the characters without disturbing
   * the relative positions of the remaining characters. (ie, "ace" is a
   * subsequence of "abcde" while "aec" is not).
   * 
   * Example 1: s = "abc", t = "ahbgdc"
   * Return true.
   * 
   * Example 2: s = "axc", t = "ahbgdc"
   * Return false.
   * 
   * https://leetcode.com/problems/is-subsequence/description/
   */
  public boolean isSubsequence(String s, String t) {
    if(s == null || t == null)
      return false;
    if(s.length() == 0 || s.equals(t))
      return true;

    int sLen = s.length();
    for(int i = 0, j = 0; i < sLen; i++) {
      j = t.indexOf(s.charAt(i), j);
      if(j == -1)
        return false;
      // Increment j + 1 so we do not recheck this char on next iteration.
      j++;
    }
    return true;
  }
}
