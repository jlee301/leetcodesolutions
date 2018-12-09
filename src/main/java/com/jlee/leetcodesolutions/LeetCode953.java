package com.jlee.leetcodesolutions;

public class LeetCode953 {
  /*
   * In an alien language, surprisingly they also use english lowercase letters,
   * but possibly in a different order. The order of the alphabet is some
   * permutation of lowercase letters.
   * 
   * Given a sequence of words written in the alien language, and the order of the
   * alphabet, return true if and only if the given words are sorted
   * lexicographicaly in this alien language.
   * 
   * https://leetcode.com/problems/verifying-an-alien-dictionary/
   */
  public boolean isAlienSorted(String[] words, String order) {
    // Map order characters to new indices
    int[] map = new int[26];
    for(int i = 0; i < order.length(); i++)
      map[order.charAt(i) - 'a'] = i;
    
    // Compare every adjacent words
    search: for(int i = 0; i < words.length-1; i++) {
      String word1 = words[i], word2 = words[i+1];
      int N = Math.min(word1.length(), word2.length());
      for(int j = 0; j < N; j++) {
        // Find first unmatching character
        if(word1.charAt(j) != word2.charAt(j)) {
          // Next word is not in correct order
          if(map[word1.charAt(j) - 'a'] > map[word2.charAt(j) - 'a'])
            return false;
          else
            continue search;
        }
      }
      
      // Check to see if next word is shorter, ie [apple, app]
      if(word1.length() > word2.length())
        return false;
    }
    return true;
  }
}
