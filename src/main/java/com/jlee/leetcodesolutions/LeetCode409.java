package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.Iterator;

public class LeetCode409 {
  /*
   * Given a string which consists of lowercase or uppercase letters, find the
   * length of the longest palindromes that can be built with those letters.
   * 
   * This is case sensitive, for example "Aa" is not considered a palindrome here.
   * 
   * Note: 
   * Assume the length of given string will not exceed 1,010.
   * 
   * Example:
   * Input: "abccccdd"
   * Output: 7
   * Explanation: One longest palindrome that can be built is "dccaccd", whose
   * length is 7.
   * 
   * https://leetcode.com/problems/longest-palindrome/description/
   */
  public int longestPalindrome(String s) {
    int result = 0;
    if(s == null || s.length() == 0)
      return result;
          
    HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
    
    // Count characters and store into hash.
    for(int i = 0; i < s.length(); i++) {
      if(hash.containsKey((Character)s.charAt(i)))
        hash.put((Character)s.charAt(i), hash.get((Character)s.charAt(i)) + 1);
      else
        hash.put((Character)s.charAt(i), 1);
    }
    
    Iterator<Integer> iter = hash.values().iterator();
    boolean oddNumberAdded = false;
    while(iter.hasNext()) {
      int value = iter.next();
      
      if(value % 2 != 0 && oddNumberAdded == false) {
        // Add first odd number you see
        result += value;
        oddNumberAdded = true;
      } else if(value / 2 > 0) {
        // Anything with > 2 multiples
        result += (value / 2) * 2;
      }        
    }
    return result;
  }
}
