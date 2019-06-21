package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode1044 {
  /*
   * https://leetcode.com/problems/longest-duplicate-substring/
   */
  // The higher the MOD, the less likelihood of collisions
  private long MOD = 1_000_007L;
  private long[] power;

  public String longestDupSubstring(String S) {
    // Precalculate power base.  This will be used in generating the hashcode
    power = new long[S.length()];
    power[0] = 1L;
    for(int i = 1; i < power.length; i++)
      power[i] = (power[i-1] * 26L) % MOD;
    
    // Use binary to determine which length of substring to check
    // The mid point will be length to pass into the helper function
    String result = "";
    int low = 1, high = S.length();
    while(low <= high) {
      int mid = low + (high - low) / 2;
      String temp = helper(S, mid);
      if(temp.length() > result.length()) {
        result = temp;
        low = mid + 1;
      }
      else
        high = mid - 1;
    }
    return result;
  }
    
  private String helper(String str, int N) {
    // This function uses Rabin-Karp's algorithm to generate the rolling hashcode of
    // every substring of length N
    //
    // If we find a match of the hashcode and verify they are duplicates of each other
    // it will return the string
    HashMap<Long, HashSet<Integer>> map = new HashMap<>();
    // Calculate the hashcode for the first N characters
    long curr = 0L;
    for(int i = 0; i < N; i++) {
      long ch = ((long)(str.charAt(i) - 'a')) * power[N-i-1];
      ch = ch % MOD;
      curr = (curr + ch) % MOD;
    }
    map.put(curr, new HashSet<>());
    map.get(curr).add(N-1);
    
    // Rolling hash the remaining substrings
    for(int i = N; i < str.length(); i++) {
      // Remove exiting character from the window
      long exCh = ((long)(str.charAt(i - N) - 'a')) * power[N-1];
      exCh = exCh % MOD;
      curr = (curr - exCh) % MOD;
      
      // Increase remaining by base factor
      curr = (curr * 26L) % MOD;
      
      // Add new character to the window
      long ch = str.charAt(i) - 'a';
      curr = (curr + ch) % MOD;
      
      // Correction to avoid negative modulus
      if(curr < 0) 
        curr += MOD;
      
      if(map.containsKey(curr)) {
        String currSubString = str.substring(i-N+1,i+1);
        // TODO: Check all values to see if there is a duplicate match
        // Collision prevention
        for(int idx : map.get(curr)) {
          String temp = str.substring(idx-N+1, idx+1);
          if(currSubString.equals(temp))
            return currSubString;
        }
      }
      else {
        map.put(curr, new HashSet<>());
      }
      map.get(curr).add(i);  
    }
    return "";
  }
}
