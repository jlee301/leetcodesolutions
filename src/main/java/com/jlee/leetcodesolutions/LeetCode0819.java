package com.jlee.leetcodesolutions;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode0819 {
  /*
   * Given a paragraph and a list of banned words, return the most frequent word
   * that is not in the list of banned words. It is guaranteed there is at least
   * one word that isn't banned, and that the answer is unique.
   * 
   * Words in the list of banned words are given in lowercase, and free of
   * punctuation. Words in the paragraph are not case sensitive. The answer is in
   * lowercase.
   * 
   * Example:
   * Input:
   * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
   * banned = ["hit"]
   * Output: "ball"
   * 
   * Explanation:
   * "hit" occurs 3 times, but it is a banned word.
   * "ball" occurs twice (and no other word does), so it is the most frequent
   * non-banned word in the paragraph.
   * 
   * Note that words in the paragraph are not case sensitive, that punctuation is
   * ignored (even if adjacent to words, such as "ball,"), and that "hit" isn't
   * the answer even though it occurs more because it is banned.
   */
  public String mostCommonWord(String paragraph, String[] banned) {
    // Store all banned words into set for faster searching
    HashSet<String> bannedSet = new HashSet<>();
    for(String word: banned)
      bannedSet.add(word);
    
    // Store all words into HashMap<Word, Frequency>. Lower case the word to match
    // bannedSet.
    String[] tokens = paragraph.split("\\!|\\?|\\'|\\,|\\;|\\.| ");
    HashMap<String,Integer> map = new HashMap<>();
    for(String word : tokens) {
      if(word.isEmpty()) continue;
      word = word.toLowerCase();
      map.put(word, map.getOrDefault(word, 0) + 1);
    }
    
    // Find the word with the max frequency that is not in the bannedSet.
    String result = "";
    int maxCount = 0;
    for(String word : map.keySet()) {
      if(bannedSet.contains(word)) continue;
      int count = map.get(word);
      if(count > maxCount) {
        maxCount = count;
        result = word;
      }
    }
    return result;
  }  
}
