package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode0522 {
  /*
   * Given a list of strings, you need to find the longest uncommon subsequence
   * among them. The longest uncommon subsequence is defined as the longest
   * subsequence of one of these strings and this subsequence should not be any
   * subsequence of the other strings.
   * 
   * A subsequence is a sequence that can be derived from one sequence by deleting
   * some characters without changing the order of the remaining elements.
   * Trivially, any string is a subsequence of itself and an empty string is a
   * subsequence of any string.
   * 
   * The input will be a list of strings, and the output needs to be the length of
   * the longest uncommon subsequence. If the longest uncommon subsequence doesn't
   * exist, return -1.
   * 
   * Example 1:
   * Input: "aba", "cdc", "eae"
   * Output: 3
   * 
   * Note:
   * 1. All the given strings' lengths will not exceed 10.
   * 2. The length of the given list will be in the range of [2, 50].
   * 
   * https://leetcode.com/problems/longest-uncommon-subsequence-ii/description/
   */
  public int findLUSlength(String[] strs) {
    if(strs == null || strs.length < 2)
      return 0;
    
    // Store HashMap<All subsequences, Frequency>.
    HashMap<String,Integer> map = new HashMap<>();
    for(String str : strs) {
      for(String subseq : getSubseqs(str))
        map.put(subseq, map.getOrDefault(subseq, 0) + 1);
    }
    
    // Now search for all results with frequency of 1. The one with the longest
    // length is the LUS.
    int result = -1;
    for(String subseq : map.keySet()) {
      if(map.get(subseq) == 1)
        result = Math.max(result, subseq.length());
    }
    return result;
  }
  
  private HashSet<String> getSubseqs(String s) {
    HashSet<String> set = new HashSet<>();
    getSubseqs(s, "", 0, set);
    return set;
  }
  
  private void getSubseqs(String s, String curr, int pos, HashSet<String> set) {
    set.add(curr);
    if(pos == s.length())
      return;
    
    // Take character
    getSubseqs(s, curr+s.charAt(pos), pos+1, set);
    // Don't take character
    getSubseqs(s, curr, pos+1, set);
  }
}
