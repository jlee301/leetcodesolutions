package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode0676 {
  /*
   * Implement a magic directory with buildDict, and search methods.
   * 
   * For the method buildDict, you'll be given a list of non-repetitive words to
   * build a dictionary.
   * 
   * For the method search, you'll be given a word, and judge whether if you
   * modify exactly one character into another character in this word, the
   * modified word is in the dictionary you just built.
   * 
   * https://leetcode.com/problems/implement-magic-dictionary/description/
   */
  private HashSet<String> set;
  
  /** Initialize your data structure here. */
  public LeetCode0676() {
    set = new HashSet<>();
  }

  /** Build a dictionary through a list of words */
  public void buildDict(String[] dict) {
    for(String word : dict) {
      char[] data = word.toCharArray();
      // Store every one char change for each word
      for(int i = 0; i < data.length; i++) {
        char ch = data[i];
        for(char j = 'a'; j <= 'z'; j++) {
          if(ch != j) {
            data[i] = j;
            set.add(String.valueOf(data));
          }
        }
        // Set word back to original
        data[i] = ch;
      }
    }
  }

  /**
   * Returns if there is any word in the trie that equals to the given word after
   * modifying exactly one character
   */
  public boolean search(String word) {
    return set.contains(word);
  }
}
