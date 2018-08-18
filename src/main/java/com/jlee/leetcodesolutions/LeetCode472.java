package com.jlee.leetcodesolutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode472 {
  /*
   * A concatenated word is defined as a string that is comprised entirely of at
   * least two shorter words in the given array.
   * 
   * Note:
   * 1. The number of elements of the given array will not exceed 10,000
   * 2. The length sum of elements in the given array will not exceed 600,000.
   * 3. All the input string will only include lower case letters.
   * 4. The returned elements order does not matter.
   * 
   * https://leetcode.com/problems/concatenated-words/description/
   */
  private HashSet<String> set;
  
  public List<String> findAllConcatenatedWordsInADict(String[] words) {
    // Generate all available words into a set for faster searching
    // If for some reason there is an empty string, we skip
    set = new HashSet<>();
    for(String word : words) {
      if(!word.isEmpty())
        set.add(word);
    }
    
    // Edge case, if there are no words, there is nothing to concatenate
    List<String> result = new ArrayList<>();
    if(set.isEmpty())
      return result;
    
    // Now check every word to see if it concatenates with other words
    for(String word : words) {
      if(!word.isEmpty() && helper(word, 0, 1, word.length()))
        result.add(word);
    }
    return result;
  }
  
  private boolean helper(String str, int i, int j, int N) {
    // Did not find any word but itself
    if(i == 0 && j == N)
      return false;
    
    if(set.contains(str.substring(i, j))) {
      // At the end and last section was found
      if(j == N)
        return true;
      // Continue with two conditions
      // 1. substring(i, j) is valid, continue with substring(j, j+1)
      // 2. substring(i, j) is not valid, continue with substring(i, j+1)
      return helper(str, j, j+1, N) || helper(str, i, j+1, N);
    }
    else {
      // At the end and last section was not found
      if(j == N)
        return false;
      // Continue, only one condition
      // 1. substring(i, j) is not valid, continue by adding another char substring(i, j+1)
      return helper(str, i, j+1, N);
    }
  }
}
