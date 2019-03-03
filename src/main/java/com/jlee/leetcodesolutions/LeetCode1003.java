package com.jlee.leetcodesolutions;

public class LeetCode1003 {
  /*
   * https://leetcode.com/contest/weekly-contest-126/problems/check-if-word-is-valid-after-substitutions/
   */
  public boolean isValid(String S) {
    int index = S.indexOf("abc");
    while(index >= 0) {
      // Remove each instance of "abc"
      S = S.substring(0, index) + S.substring(index+3, S.length());
      index = S.indexOf("abc");
    }
    return S.isEmpty() ? true : false;
  }
}
