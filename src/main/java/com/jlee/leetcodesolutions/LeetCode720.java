package com.jlee.leetcodesolutions;

import java.util.HashSet;

public class LeetCode720 {
  /*
   * Given a list of strings words representing an English Dictionary, find the
   * longest word in words that can be built one character at a time by other
   * words in words. If there is more than one possible answer, return the longest
   * word with the smallest lexicographical order.
   * 
   * If there is no answer, return the empty string.
   * 
   * Example 1:
   * Input: words = ["w","wo","wor","worl", "world"]
   * Output: "world"
   * 
   * Explanation: The word "world" can be built one character at a time by "w",
   * "wo", "wor", and "worl".
   * 
   * Example 2:
   * Input: words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
   * Output: "apple"
   * 
   * Explanation: Both "apply" and "apple" can be built from other words in the
   * dictionary. However, "apple" is lexicographically smaller than "apply".
   * 
   * Note:
   * 1. All the strings in the input will only contain lowercase letters.
   * 2. The length of words will be in the range [1, 1000].
   * 3. The length of words[i] will be in the range [1, 30].
   * 
   * https://leetcode.com/problems/longest-word-in-dictionary/description/
   */
  public String longestWord(String[] words) {
    if(words == null || words.length == 0)
      return "";
    
    // Dump all words into HashSet for faster searching
    HashSet<String> set = new HashSet<String>();
    for(String word : words)
      set.add(word);
    
    String result = "";
    boolean canBuild = false;
    
    for(String word: words) {
      if(word.length() > result.length() || 
          (word.length() == result.length() && word.compareTo(result) < 0)) {
        // Now check if you can build the word up until the last character
        for(int i = 1; i <= word.length(); i++) {
          if(!set.contains(word.substring(0, i))) {
            canBuild = false;
            break;
          } else {
            canBuild = true;
          }
        }
        if(canBuild)
          result = word;
        
        canBuild = false;
      }
    }
    return result;
  }
}
