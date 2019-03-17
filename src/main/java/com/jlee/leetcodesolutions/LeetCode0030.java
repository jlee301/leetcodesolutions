package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode0030 {
  /*
   * You are given a string, s, and a list of words, words, that are all of the
   * same length. Find all starting indices of substring(s) in s that is a
   * concatenation of each word in words exactly once and without any intervening
   * characters.
   * 
   * https://leetcode.com/problems/substring-with-concatenation-of-all-words/
   */
  public List<Integer> findSubstring(String s, String[] words) {
    List<Integer> result = new ArrayList<>();    
    if(s == null || s.isEmpty() || words == null || words.length == 0)
      return result;
    
    // Find the frequency of each word
    // This will be used to validate the substring
    HashMap<String,Integer> count = new HashMap<>();
    for(String word : words)
      count.put(word, count.getOrDefault(word, 0) + 1);
    
    int N = words.length;
    int M = words[0].length();
    for(int i = 0; i <= s.length() - N*M; i++) {
      HashMap<String,Integer> curr = new HashMap<>();
      int j = i;
      int LEN = j + N*M;
      boolean validSubstring = true;
      while(j < LEN) {
        String nextWord = s.substring(j, j+M);
        if(count.containsKey(nextWord)) {
          curr.put(nextWord, curr.getOrDefault(nextWord, 0) + 1);
          
          // Exceeded expected frequency
          if(curr.get(nextWord) > count.get(nextWord)) {
            validSubstring = false;
            break;
          }
        }
        else {
          validSubstring = false;
          break;
        }
        j += M;
      }
      if(validSubstring)
        result.add(i);
    }
    return result;
  }
}
