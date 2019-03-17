package com.jlee.leetcodesolutions;

public class LeetCode0424 {
  /*
   * Given a string that consists of only uppercase English letters, you can
   * replace any letter in the string with another letter at most k times. Find
   * the length of a longest substring containing all repeating letters you can
   * get after performing the above operations.
   * 
   * Note:
   * Both the string's length and k will not exceed 10^4.
   * 
   * Example 1:
   * Input: s = "ABAB", k = 2
   * Output: 4
   * Explanation: Replace the two 'A's with two 'B's or vice versa.
   * 
   * Example 2:
   * Input: s = "AABABBA", k = 1
   * Output: 4
   * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA". 
   * The substring "BBBB" has the longest repeating letters, which is 4.
   * 
   * https://leetcode.com/problems/longest-repeating-character-replacement/description/
   */
  public int characterReplacement(String s, int k) {
    if(s == null) return 0;
    int start = 0, end = 0, result = 0;
    int[] counts = new int[26];
    // Sliding window approach
    while(start < s.length()) {
      while(end < s.length()) {
        counts[s.charAt(end)-'A']++;
        // Once we exceed k number of characters, we are are one over the end point.
        if(count(counts) > k) {
          counts[s.charAt(end)-'A']--;
          break;
        }
        end++;
      }
      result = Math.max(result, end-start);
      // Since I will be moving the start of the window up, I need to remove it from 
      // the character count.
      counts[s.charAt(start)-'A']--;
      start++;
    }
    return result;
  }
  
  private int count(int[] counts) {
    int sum = 0, max = 0;
    for(int count : counts) {
      sum += count;
      max = Math.max(max, count);
    }
    // Returns total no. of characters that is not max repeating character
    return sum - max;
  }
}
