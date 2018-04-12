package com.jlee.leetcodesolutions;

import java.util.List;

public class LeetCode524 {
  /*
   * Given a string and a string dictionary, find the longest string in the
   * dictionary that can be formed by deleting some characters of the given
   * string. If there are more than one possible results, return the longest word
   * with the smallest lexicographical order. If there is no possible result,
   * return the empty string.
   * 
   * Example 1:
   * Input: s = "abpcplea", d = ["ale","apple","monkey","plea"]
   * Output: "apple"
   * 
   * Example 2:
   * Input: s = "abpcplea", d = ["a","b","c"]
   * Output: "a"
   * 
   * Note:
   * 1. All the strings in the input will only contain lower-case letters.
   * 2. The size of the dictionary won't exceed 1,000.
   * 3. The length of all the strings in the input won't exceed 1,000.
   * 
   * https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/description/
   */
  public String findLongestWord(String s, List<String> d) {
    if(s == null || s.isEmpty() || d.size() == 0)
      return "";
    
    String result = "";
    for(String word : d) {
      if(isSubsequence(s, word)) {
        if(result.length() < word.length())
          result = word;
        else if(result.length() == word.length()) {
          // If lengths are the same, take the string with smaller lexigraph
          if(result.compareTo(word) > 0)
            // The result is a negative integer if this String object lexicographically
            // precedes the argument string. The result is a positive integer if this String
            // object lexicographically follows the argument string. The result is zero if
            // the strings are equal
            result = word;
        }
      }
    }
    return result;
  }
  
  /*
   * Is s2 a subsequence of s1
   */
  private boolean isSubsequence(String s1, String s2) {
    int j = 0;
    for(int i = 0; i < s1.length() && j < s2.length(); i++) {
      if(s1.charAt(i) == s2.charAt(j)) j++;
    }
    return j == s2.length();
  }  
}
