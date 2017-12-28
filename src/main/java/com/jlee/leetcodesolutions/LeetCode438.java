package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode438 {
  /*
   * Given a string s and a non-empty string p, find all the start indices of p's
   * anagrams in s.
   * 
   * Strings consists of lowercase English letters only and the length of both
   * strings s and p will not be larger than 20,100.
   * 
   * The order of output does not matter.
   * 
   * Example 1:
   * Input: s: "cbaebabacd" p: "abc"
   * Output: [0, 6]
   * Explanation: The substring with start index = 0 is "cba", which is an anagram
   * of "abc". The substring with start index = 6 is "bac", which is an anagram of
   * "abc".
   * 
   * Example 2:
   * Input: s: "abab" p: "ab"
   * Output: [0, 1, 2]
   * Explanation: The substring with start index = 0 is "ab", which is an anagram
   * of "ab". The substring with start index = 1 is "ba", which is an anagram of
   * "ab". The substring with start index = 2 is "ab", which is an anagram of
   * "ab".
   * 
   * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
   */
  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList<Integer>();
    if(s == null || p == null || s.length() == 0 || p.length() == 0)
      return result;
    
    // Dump all of p into defaultPlist. This list will never be directly used.
    ArrayList<Character> defaultPlist = new ArrayList<Character>(p.length());
    for (int i = 0; i < p.length(); i++) {
      defaultPlist.add((Character) p.charAt(i));
    }

    // This list will be used indirectly and rebuilt from the default.
    ArrayList<Character> pList = new ArrayList<Character>(defaultPlist);

    for (int i = 0; i < s.length(); i++) {
      if (pList.remove((Character) s.charAt(i))) {
        if (pList.size() == 0) {
          result.add(i - (defaultPlist.size() - 1));
          pList = new ArrayList<Character>(defaultPlist);
          // If I have to reset the list, I need to check if the current character is not
          // part of of p string.
          pList.remove((Character) s.charAt(i));
        }
      } else {
        pList = new ArrayList<Character>(defaultPlist);
        // If I have to reset the list, I need to check if the current character is not
        // part of of p string.
        pList.remove((Character) s.charAt(i));
      }
    }
    return result;
  }
}
