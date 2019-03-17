package com.jlee.leetcodesolutions;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCode0820 {
  /*
   * Given a list of words, we may encode it by writing a reference string S and a
   * list of indexes A.
   * 
   * For example, if the list of words is ["time", "me", "bell"], we can write it
   * as S = "time#bell#" and indexes = [0, 2, 5].
   * 
   * Then for each index, we will recover the word by reading from the reference
   * string from that index until we reach a "#" character.
   * 
   * What is the length of the shortest reference string S possible that encodes
   * the given words?
   * 
   * Example:
   * Input: words = ["time", "me", "bell"]
   * Output: 10
   * Explanation: S = "time#bell#" and indexes = [0, 2, 5].
   * 
   * Note:
   * 1. 1 <= words.length <= 2000.
   * 2. 1 <= words[i].length <= 7.
   * 3. Each word has only lowercase letters.
   * 
   * https://leetcode.com/problems/short-encoding-of-words/description/
   */
  public int minimumLengthEncoding(String[] words) {
    // Store all words into set
    HashSet<String> set = new HashSet<>(Arrays.asList(words));
    
    // For each word, remove all word possibilities
    // ie word = "time", attempt to remove from set "ime", "me", "e"
    for(String word : words){
      for(int i = 1; i < word.length(); i++)
        set.remove(word.substring(i));
    }

    // Remaining in the set is what you can use to build the reference string
    int length = 0;
    for(String word : set)
      length += word.length() + 1;
    return length;
  }
}
