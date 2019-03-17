package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0916 {
  /*
   * We are given two arrays A and B of words. Each word is a string of lowercase
   * letters.
   * 
   * Now, say that word b is a subset of word a if every letter in b occurs in a,
   * including multiplicity. For example, "wrr" is a subset of "warrior", but is
   * not a subset of "world".
   * 
   * Now say a word a from A is universal if for every b in B, b is a subset of a.
   * 
   * Return a list of all universal words in A. You can return the words in any
   * order.
   * 
   * https://leetcode.com/problems/word-subsets/description/
   */
  public List<String> wordSubsets(String[] A, String[] B) {
    // Merge all of B into a master count of characters
    int[] masterB = new int[26];
    for(String word : B) {
      int[] temp = new int[26];
      for(int i = 0; i < word.length(); i++)
        temp[word.charAt(i)-'a']++;
      
      // If the curr word in B has a greater char count than what we seen so far,
      // store this value
      for(int i = 0; i < 26; i++)
        masterB[i] = Math.max(masterB[i], temp[i]);
    }
    
    List<String> result = new ArrayList<>();
    // Now check every word in A against the master count
    for(String word : A) {
      int[] curr = new int[26];
      for(int i = 0; i < word.length(); i++)
        curr[word.charAt(i)-'a']++;
      
      boolean isUniversal = true;
      for(int i = 0; i < 26; i++) {
        if(masterB[i] == 0)
          continue;
        
        if(masterB[i] > curr[i]) {
          isUniversal = false;
          break;
        }
      }
      if(isUniversal)
        result.add(word);
    }
    return result;
  }
}
