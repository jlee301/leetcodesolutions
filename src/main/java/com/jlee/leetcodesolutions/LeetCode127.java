package com.jlee.leetcodesolutions;

import java.util.HashSet;
import java.util.List;

public class LeetCode127 {
  /*
   * Given two words (beginWord and endWord), and a dictionary's word list, find
   * the length of shortest transformation sequence from beginWord to endWord,
   * such that:
   * 1. Only one letter can be changed at a time.
   * 2. Each transformed word must exist in the word list. Note that beginWord is
   * not a transformed word.
   * 
   * For example,
   * Given: beginWord = "hit" endWord = "cog"
   * wordList = ["hot","dot","dog","lot","log","cog"]
   * As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
   * return its length 5.
   * 
   * Note:
   * 1. Return 0 if there is no such transformation sequence.
   * 2. All words have the same length.
   * 3. All words contain only lowercase alphabetic characters.
   * 4. You may assume no duplicates in the word list.
   * 5. You may assume beginWord and endWord are non-empty and are not the same.
   * 
   * https://leetcode.com/problems/word-ladder/description/
   */
  public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    if (beginWord == null || endWord == null || wordList == null || beginWord.length() == 0 || endWord.length() == 0
        || wordList.size() == 0 || !wordList.contains(endWord))
      return 0;
    
    // Using sets makes searching better from O(n) to O(1)
    HashSet<String> wordSet = new HashSet<>(wordList);
    HashSet<String> currentSet = new HashSet<>();
    currentSet.add(beginWord);
    int count = 1;
    while(!currentSet.contains(endWord)) {
      HashSet<String> nextSet = new HashSet<>();
      for(String word : currentSet) {
        for(int i = 0; i < word.length(); i++) {
          // We will be checking for every possible one letter change combinations instead
          // of searching for words that has a difference of 1.
          char[] temp = word.toCharArray();
          for(char ch = 'a'; ch <= 'z'; ch++) {
            temp[i] = ch;
            String nextWord = String.valueOf(temp);
            if(wordSet.contains(nextWord)) {
              nextSet.add(nextWord);
              wordSet.remove(nextWord);
            }
          }
        }
      }
      // If size is zero, there is no possible way to move to another word -- so we
      // are done. Anything greater than zero, the nextList becomes currentList.
      if(nextSet.size() == 0) return 0;
      currentSet = nextSet;
      count++;
    }
    return count;
  }
}
