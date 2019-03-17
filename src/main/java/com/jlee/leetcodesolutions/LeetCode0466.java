package com.jlee.leetcodesolutions;

public class LeetCode0466 {
  /*
   * Define S = [s,n] as the string S which consists of n connected strings s. For
   * example, ["abc", 3] ="abcabcabc".
   * 
   * On the other hand, we define that string s1 can be obtained from string s2 if
   * we can remove some characters from s2 such that it becomes s1. For example,
   * “abc” can be obtained from “abdbec” based on our definition, but it can not
   * be obtained from “acbbe”.
   * 
   * You are given two non-empty strings s1 and s2 (each at most 100 characters
   * long) and two integers 0 ≤ n1 ≤ 106 and 1 ≤ n2 ≤ 106. Now consider the
   * strings S1 and S2, where S1=[s1,n1] and S2=[s2,n2]. Find the maximum integer
   * M such that [S2,M] can be obtained from S1.
   * 
   * https://leetcode.com/problems/count-the-repetitions/description/
   */
  public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
    // Convert s1 and s2 into char arrays
    char[] s1a = s1.toCharArray();
    char[] s2a = s2.toCharArray();
    int s1Len = s1a.length;
    int s2Len = s2a.length;
    
    // How many times does s2 occurs in s1*n1
    int k = 0, count = 0;
    for(int i = 0; i < n1; i++) {
      for(int j = 0; j < s1Len; j++) {
        if(s1a[j] == s2a[k]) k++;
        
        if(k == s2Len) {
          k = 0;
          count++;
        }
      }
    }
    return count / n2;
  }
}
