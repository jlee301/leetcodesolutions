package com.jlee.leetcodesolutions;

public class LeetCode0567 {
  /*
   * Given two strings s1 and s2, write a function to return true if s2 contains
   * the permutation of s1. In other words, one of the first string's permutations
   * is the substring of the second string.
   * 
   * Example 1:
   * Input: s1 = "ab" s2 = "eidbaooo"
   * Output: True
   * Explanation: s2 contains one permutation of s1 ("ba").
   * 
   * Example 2:
   * Input: s1 = "ab" s2 = "eidboaoo"
   * Output: False
   * 
   * Note:
   * 1. The input strings only contain lower case letters.
   * 2. The length of both given strings is in range [1, 10,000].
   * 
   * https://leetcode.com/problems/permutation-in-string/description/
   */
  public boolean checkInclusion(String s1, String s2) {
    if(s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty())
      return false;
    
    int s1len = s1.length();
    int s2len = s2.length();
    // If s1 is bigger than s2, then not possible
    if(s1len > s2len) 
      return false;
    
    // Create character counts of s1
    int[] s1Count = new int[26];
    for(int i = 0; i < s1len; i++)
      s1Count[s1.charAt(i) - 'a']++;
    
    // Create character counts of s2 using s1 as the sub array size
    for(int i = 0; i <= s2len-s1len; i++) {
      int[] s2Count = new int[26];
      for(int j = i; j < i+s1len; j++)
        s2Count[s2.charAt(j) - 'a']++;
      
      // If the counts match, then there is a permutation in s2.
      if(countsEquals(s1Count, s2Count))
        return true;
    }
    return false;    
  }
  
  private boolean countsEquals(int[] s1, int[] s2) {
    for(int i = 0; i < 26; i++) {
      if(s1[i] != s2[i])
        return false;
    }
    return true;
  }
}
