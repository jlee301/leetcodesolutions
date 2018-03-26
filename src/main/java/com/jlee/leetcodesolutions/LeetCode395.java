package com.jlee.leetcodesolutions;

public class LeetCode395 {
  /*
   * Find the length of the longest substring T of a given string (consists of
   * lowercase letters only) such that every character in T appears no less than k
   * times.
   * 
   * Example 1:
   * Input: s = "aaabb", k = 3
   * Output: 3
   * 
   * The longest substring is "aaa", as 'a' is repeated 3 times.
   * 
   * Example 2:
   * Input: s = "ababbc", k = 2
   * Output: 5
   * 
   * The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is
   * repeated 3 times.
   * 
   * https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/description/
   */
  public int longestSubstring(String s, int k) {
    if(s == null || s.length() == 0 || s.length() < k)
      return 0;
    if(k == 1)
      return s.length();
    
    // Find which characters repeat < k
    int[] counts = new int[26];
    for(int i = 0; i < s.length(); i++)
      counts[s.charAt(i)-'a']++;
    
    // Find first character < k to start recursion
    char ch = 0;
    for(int i = 0; i < counts.length; i++) {
      if(counts[i] != 0 && counts[i] < k)
        ch = (char) (i+'a');
    }
    // If ch is still 0, then all characters are >= k counts
    if(ch == 0)
      return s.length();
    
    String[] subs = s.split(""+ch);
    int result = 0;
    for(String sub : subs)
      result = Math.max(result, longestSubstring(sub, k));
    return result;
  }
}
