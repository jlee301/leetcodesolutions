package com.jlee.leetcodesolutions;

public class LeetCode0087 {
  /*
   * https://leetcode.com/problems/scramble-string/
   */
  public boolean isScramble(String s1, String s2) {
    if(s1.equals(s2))
      return true;
    
    // check if char counts match
    int[] count = new int[26];
    int N = s1.length();
    for(int i = 0; i < N; i++) {
      count[s1.charAt(i) - 'a']++;
      count[s2.charAt(i) - 'a']--;
    }
    
    for(int i = 0; i < 26; i++) {
      if(count[i] != 0)
        return false;
    }
    
    for(int i = 1; i < N; i++) {
      if(isScramble(s1.substring(0, i), s2.substring(0, i)))
        if(isScramble(s1.substring(i), s2.substring(i)))
          return true;
      
      if(isScramble(s1.substring(0, i), s2.substring(N - i)))
        if(isScramble(s1.substring(i), s2.substring(0, N - i)))
          return true;
    }
    return false;
  }
}
